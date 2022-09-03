package com.stt;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;

import javax.sql.DataSource;

/**
 * @description:
 * @author: stt
 * @date: 2022/9/2 14:30
 * @version: 1.0
 */
public class CodeGenerator {
    public static void main(String[] args) {
     AutoGenerator autoGenerator=new AutoGenerator();
     //数据源
        DataSourceConfig dataSourceConfig=new DataSourceConfig();
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUrl("jdbc:mysql:///book");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("123456");
        autoGenerator.setDataSource(dataSourceConfig);

     //设置全局配置
        GlobalConfig globalConfig=new GlobalConfig();

        globalConfig.setOutputDir(System.getProperty("user.dir")+"/final_code_generator/src/main/java");
       System.out.println(System.getProperty("user.dir")+"/final_code_generator/src/main/java");
        globalConfig.setOpen(false);//自动打开
        globalConfig.setAuthor("stt");//作者
        globalConfig.setFileOverride(true);//是否覆盖旧的生成文件
        globalConfig.setMapperName("%sDao");//数据层包名
        globalConfig.setIdType(IdType.ASSIGN_ID);//ID生成策略
        autoGenerator.setGlobalConfig(globalConfig);

        //包相关配置
        PackageConfig packageConfig=new PackageConfig();
        packageConfig.setParent("com.stt");//默认com.baomidou
        packageConfig.setEntity("domain");//实体包名
        packageConfig.setMapper("dao");//数据层包名
        autoGenerator.setPackageInfo(packageConfig);

        //策略设置
        StrategyConfig strategyConfig=new StrategyConfig();
        strategyConfig.setInclude("t_user");//设置当前参与生成的表名
        strategyConfig.setTablePrefix("t_");//设置当前表名前缀  模块名=数据库名-前缀名
        strategyConfig.setRestControllerStyle(true);//是否启用Rest风格
        strategyConfig.setVersionFieldName("version");//乐观锁字段
        strategyConfig.setLogicDeleteFieldName("deleted");//逻辑删除
        strategyConfig.setEntityLombokModel(true);//实体类使用lombokModel
        autoGenerator.setStrategy(strategyConfig);
        autoGenerator.execute();
    }
}
