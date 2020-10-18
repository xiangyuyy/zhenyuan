package com.macro.mall.config;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import javax.sql.DataSource;

/**
 * MyBatis相关配置
 * Created by macro on 2019/4/8.
 */
@Configuration
//@MapperScan({"com.macro.mall.msdao"})
@MapperScan(basePackages = "com.macro.mall.msdao", sqlSessionTemplateRef  = "msSqlSessionTemplate")
public class MyBatisMsConfig {

    @Bean(name = "msDataSource")
    @ConfigurationProperties(prefix = "spring.datasource.ms")
    public DataSource testDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "msSqlSessionFactory")
    public SqlSessionFactory testSqlSessionFactory(@Qualifier("msDataSource") DataSource dataSource) throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(dataSource);
        bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources("classpath:msdao/*.xml"));
        return bean.getObject();
    }

    @Bean(name = "msTransactionManager")
    public DataSourceTransactionManager testTransactionManager(@Qualifier("msDataSource") DataSource dataSource) {
        return new DataSourceTransactionManager(dataSource);
    }

    @Bean(name = "msSqlSessionTemplate")
    public SqlSessionTemplate testSqlSessionTemplate(@Qualifier("msSqlSessionFactory") SqlSessionFactory sqlSessionFactory) throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory);

    }
}

