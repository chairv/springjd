package com.tancw.handler;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

import com.tancw.parse.UserBeanDefinitionParser;

/**
 * Created by Administrator on 2018/8/27.
 */
public class UserNameSpaceHandler extends NamespaceHandlerSupport {

    public void init() {
        registerBeanDefinitionParser("user", new UserBeanDefinitionParser());
    }
}
