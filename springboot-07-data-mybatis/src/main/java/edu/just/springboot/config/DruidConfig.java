package edu.just.springboot.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@Configuration
public class DruidConfig {

    // 从配置文件加载 druid 的配置信息
    @ConfigurationProperties(prefix = "spring.datasource")
    @Bean
    public DataSource druid() {
        return new DruidDataSource();
    }

    /**
     * 配置 druid 监控
     * 1. 配置一个管理后台的 Servlet
     * 2. 配置一个监控的 Filter
     */
    @Bean
    public ServletRegistrationBean statViewServlet() {
        ServletRegistrationBean bean
                = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        Map<String, String> initParam = new HashMap<>();
        initParam.put("loginUsername", "admin");
        initParam.put("loginPassword", "123456");
        initParam.put("allow", ""); // 默认允许所有访问
        bean.setInitParameters(initParam);
        return bean;
    }

    /**
     * 配置数据源监控
     */
    @Bean
    public FilterRegistrationBean webStatFilter() {
        FilterRegistrationBean bean
                = new FilterRegistrationBean();
        // 设置 Filter
        bean.setFilter(new WebStatFilter());
        Map<String, String> initParam = new HashMap<>();

        initParam.put("exclusions", "*.js,*.css,/druid/*");
        bean.setInitParameters(initParam);
        bean.setUrlPatterns(Arrays.asList("/*"));
        return bean;
    }

}
