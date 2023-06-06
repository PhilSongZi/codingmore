package top.philsongzi.autogenerator.generator;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.rules.DateType;

/**
 * @author 小子松
 * @version 1.0
 * @description
 * @since 2023/6/6
 */
// 很难绷，设置完 mp 的 autogenerator 之后运行 mybatis 的 generator 就成功了，之前一直卡在 数据库驱动那里不动，也不知道为啥
// 然后就是 codegenerator 没法用， 报两个警告之后运行停止。
// 14:57:53.322 [main] WARN org.apache.velocity.deprecation -- configuration key 'file.resource.loader.class' has been deprecated in favor of 'resource.loader.file.class'
// 14:57:53.326 [main] WARN org.apache.velocity.deprecation -- configuration key 'file.resource.loader.unicode' has been deprecated in favor of 'resource.loader.file.unicode'
public class CodeGenerator {

    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();

        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        gc.setOutputDir(projectPath + "/src/main/java");
        gc.setAuthor("小子松");
        gc.setOpen(false);
        gc.setDateType(DateType.ONLY_DATE);
        gc.setSwagger2(true);
        gc.setIdType(IdType.AUTO);
        gc.setBaseColumnList(true);
        gc.setBaseResultMap(true);
        gc.setFileOverride(true);

        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://localhost:3306/codingmore?useUnicode=true&characterEncoding=utf-8&serverTimezone=Asia/Shanghai");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("xqs123456");

        mpg.setDataSource(dsc);

        // 包配置
        PackageConfig pc = new PackageConfig();
        pc.setParent("top.philsongzi.autogenerator.mpg");
        mpg.setPackageInfo(pc);

        mpg.execute();
    }
}
