package com.imooc.security.browser.support;

/**
 * Created by Jingchao Zhang
 * Date: 2020-07-01
 * Time: 8:34 AM
 */
public class SimpleResponse {

    private Object content;

    public SimpleResponse(Object content) {
        this.content = content;
    }

    public Object getContent() {
        return content;
    }

    public void setContent(Object content) {
        this.content = content;
    }
}
