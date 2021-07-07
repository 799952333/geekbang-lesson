package com.bamboo;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.PageContext;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class TestTagEmpty extends SimpleTagSupport {


    private String cacheControl;
    private String connection;
    private String host;
    private String acceptEncoding;

    @Override
    public void doTag() throws JspException, IOException {
//        ServletRequestAttributes attributes = (ServletRequestAttributes) RequestContextHolder.getRequestAttributes();
//        HttpServletResponse response = attributes.getResponse();
        PageContext pageContext = (PageContext) this.getJspContext();
        HttpServletResponse response = (HttpServletResponse) pageContext.getResponse();
        response.setHeader("Cache-Control", cacheControl);
        response.setHeader("Host", host);
        response.setHeader("Connection", connection);
        response.setHeader("Accept-Encoding", acceptEncoding);
        getJspContext().getOut().write("hellow world");
    }


    public String getCacheControl() {
        return cacheControl;
    }

    public void setCacheControl(String cacheControl) {
        this.cacheControl = cacheControl;
    }

    public String getConnection() {
        return connection;
    }

    public void setConnection(String connection) {
        this.connection = connection;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getAcceptEncoding() {
        return acceptEncoding;
    }

    public void setAcceptEncoding(String acceptEncoding) {
        this.acceptEncoding = acceptEncoding;
    }
}
