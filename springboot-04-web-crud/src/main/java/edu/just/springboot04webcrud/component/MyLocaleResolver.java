package edu.just.springboot04webcrud.component;

import org.springframework.util.StringUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

/**
 * 自己实现区域信息解析器
 */
public class MyLocaleResolver implements LocaleResolver {

    @Override
    public Locale resolveLocale(HttpServletRequest request) {
        // 获取链接上提供的参数
        String l = request.getParameter("l");
        // 获取默认的 Locale 类
        Locale locale = Locale.getDefault();

        if (!StringUtils.isEmpty(l)) {
            String[] split = l.split("_");
            // en_US    language:en   country:US
            locale = new Locale(split[0], split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest request, HttpServletResponse response, Locale locale) {

    }

}
