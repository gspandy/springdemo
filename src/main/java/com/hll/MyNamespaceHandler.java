package com.hll;

import org.springframework.beans.factory.xml.NamespaceHandlerSupport;

/**
 * Created by hll on 2016/6/17.
 */
public class MyNamespaceHandler extends NamespaceHandlerSupport {
  @Override
  public void init() {
    registerBeanDefinitionParser("people",new PeopleBeanDefinitionParser());
  }
}
