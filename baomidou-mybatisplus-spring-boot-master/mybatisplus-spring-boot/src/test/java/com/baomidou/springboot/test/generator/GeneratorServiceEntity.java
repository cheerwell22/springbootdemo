package com.baomidou.springboot.test.generator;

import org.junit.Test;

import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.rules.DbType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

/**
 * <p>
 *     测试生成代码
 * </p>
 *
 * @author K神
 * @date 2017/12/18
 */
public class GeneratorServiceEntity {

    @Test
    public void generateCode(){
        String packageName = "com.baomidou.springboot";
        generateByTables(packageName, "role");
    }

    private void generateByTables(String packageName, String... tableNames){
        GlobalConfig config = new GlobalConfig();
        String dbUrl = "jdbc:mysql://172.16.10.127:3306/test";
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setDbType(DbType.MYSQL)
                .setUrl(dbUrl)
                .setUsername("app")
                .setPassword("app*()")
                .setDriverName("com.mysql.jdbc.Driver");
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig
                .setCapitalMode(true)
                .setEntityLombokModel(false)
                .setDbColumnUnderline(true)
                .setNaming(NamingStrategy.underline_to_camel)
                .setInclude(tableNames);//修改替换成你需要的表名，多个表名传数组
        config.setActiveRecord(false)
                .setAuthor("K神带你飞")
                .setOutputDir("C:\\Users\\Administrator\\Desktop\\sbc\\springbootdemo\\baomidou-mybatisplus-spring-boot-master\\mybatisplus-spring-boot")
                .setFileOverride(true);
        new AutoGenerator().setGlobalConfig(config)
                .setDataSource(dataSourceConfig)
                .setStrategy(strategyConfig)
                .setPackageInfo(
                        new PackageConfig()
                                .setParent(packageName)
                                .setController("controller")
                                .setEntity("entity")
                                .setMapper("mapper")
                                .setXml("mapper")
                                .setService("service")
                                .setServiceImpl("service.impl")
                ).execute();
    }
}
