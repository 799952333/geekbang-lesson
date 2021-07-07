package com.bamboo;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.JspFragment;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

public class TestTagTagdependent extends SimpleTagSupport {


    @Override
    public void doTag() throws JspException, IOException {
        //tagdependent 将标签内内容写入 body,调用invoke，在输出到页面
        JspFragment jspBody = getJspBody();
        jspBody.invoke(null);
    }


}
