package top.philsongzi.codingmoreswagger.config;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.util.ReflectionUtils;
import org.springframework.web.servlet.mvc.method.RequestMappingInfoHandlerMapping;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.spring.web.plugins.WebFluxRequestHandlerProvider;
import springfox.documentation.spring.web.plugins.WebMvcRequestHandlerProvider;

import java.lang.reflect.Field;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @author 小子松
 * @version 1.0
 * @description Swagger 配置类。
 * @since 2023/5/31
 */
@Configuration // @Configuration  注解通常用来声明一个 Java 配置类
@EnableOpenApi // @EnableOpenApi  注解表明开启 Swagger。
public class SwaggerConfig {
    /**
     * SwaggerConfig 类中包含了一个 @Bean  注解声明的方法 docket()，
     * 该方法会被 Spring 的 AnnotationConfigApplicationContext 或 AnnotationConfigWebApplicationContext 类进行扫描，
     * 然后添加到 Spring 容器当中。
     */

    @Bean
    public Docket docket() {
        /**
         * new Docket(DocumentationType.OAS_30)，使用 3.0 版本的 Swagger API
         * apiInfo(apiInfo())，配置 API 文档基本信息，标题、描述、作者、版本等。
         * apis(RequestHandlerSelectors.basePackage("top.codingmore.codingmoreswagger.controller")) 指定 API 的接口范围为 controller 控制器。
         * paths(PathSelectors.any()) 指定匹配所有的 URL。
         */
        Docket docket = new Docket(DocumentationType.OAS_30)
                .apiInfo(apiInfo()).enable(true)
                .select()
                // apis: 添加 swagger 接口提取范围
                .apis(RequestHandlerSelectors.basePackage("top.philsongzi.codingmoreswagger.controller"))
                .paths(PathSelectors.any())
                .build();

        return docket;
    }

    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("codingmore 笔记")
                .description("codingmore 是一个 springboot + vue 的前后端分离项目")
                .contact(new Contact("小子松", "https://codingmore.top", "greensun.h@gmail.com"))
                .version("v1.0")
                .build();
    }

    // 为了解决springfox3.0版本冲突问题引进以下内容（为啥，不懂没看。。。因为连swagger-ui3.0包都下不下来。。。
    @Bean
    public static BeanPostProcessor springfoxHandlerProviderBeanPostProcessor() {
        return new BeanPostProcessor() {

            @Override
            public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
                if (bean instanceof WebMvcRequestHandlerProvider || bean instanceof WebFluxRequestHandlerProvider) {
                    customizeSpringfoxHandlerMappings(getHandlerMappings(bean));
                }
                return bean;
            }

            private <T extends RequestMappingInfoHandlerMapping> void customizeSpringfoxHandlerMappings(List<T> mappings) {
                List<T> copy = mappings.stream()
                        .filter(mapping -> mapping.getPatternParser() == null)
                        .collect(Collectors.toList());
                mappings.clear();
                mappings.addAll(copy);
            }

            @SuppressWarnings("unchecked")
            private List<RequestMappingInfoHandlerMapping> getHandlerMappings(Object bean) {
                try {
                    Field field = ReflectionUtils.findField(bean.getClass(), "handlerMappings");
                    field.setAccessible(true);
                    return (List<RequestMappingInfoHandlerMapping>) field.get(bean);
                } catch (IllegalArgumentException | IllegalAccessException e) {
                    throw new IllegalStateException(e);
                }
            }
        };
    }
}
