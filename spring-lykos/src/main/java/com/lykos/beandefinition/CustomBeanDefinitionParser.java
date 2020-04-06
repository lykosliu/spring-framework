package com.lykos.beandefinition;


import com.lykos.ioc.chapter3.MyBeanPostProcessor;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.RootBeanDefinition;
import org.springframework.beans.factory.xml.BeanDefinitionParser;
import org.springframework.beans.factory.xml.ParserContext;
import org.w3c.dom.Element;

public class CustomBeanDefinitionParser implements BeanDefinitionParser {
	@Override
	public BeanDefinition parse(Element element, ParserContext parserContext) {
		Object source = parserContext.extractSource(element);
		RootBeanDefinition def = new RootBeanDefinition(MyBeanPostProcessor.class);
		def.setSource(source);
		def.setRole(BeanDefinition.ROLE_INFRASTRUCTURE);
		BeanDefinitionRegistry registry = parserContext.getRegistry();
		registry.registerBeanDefinition("myBeanPostProcessor", def);
		return null;
	}
}
