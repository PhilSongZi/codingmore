package top.philsongzi.codingmorefilterinterceptorlistener.listener;

import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

/**
 * @author 小子松
 * @version 1.0
 * @date 2023/5/30
 * @description 监听器类。
 */
// @WebListener  注解用于将一个类声明为监听器，同样干掉了 web.xml 文件。
// ServletContextListener 能够监听整个 Web 应用程序的生命周期。
// 当 Web 应用启动时触发 contextInitialized 方法，关闭时触发 contextDestroyed 方法。
@WebListener
public class MyListener implements ServletContextListener {

    @Override
    public void contextInitialized(ServletContextEvent sce) {
        System.out.println("上下文创建");
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("上下文销毁");
    }
}
