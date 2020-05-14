package com.nineleaps.domain;

import java.util.Arrays;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class AwareBeanImpl implements ApplicationContextAware, BeanNameAware, BeanFactoryAware{
	
	public AwareBeanImpl() {
		
		System.out.println("Called Constructor");
	}
	
	//BeanFactoryAware interface can get the current bean factory and this can be used to call the any service from bean factory
	@Override
	public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
	
		System.out.println("setBeanFactory method of AwareBeanImpl is called");
		
		System.out.println("setBeanFactory:: AwareBeanImpl singleton= "+beanFactory.isSingleton("awareBean"));
		
		System.out.println(beanFactory.getBean("awareBean"));
		
		System.out.println("setBeanFactory:: AwareBeanImpl Prototype= "+beanFactory.isPrototype("awareBean"));
		
		System.out.println("=========================================================");
	}

	//BeanNameAware interface can get the bean name defined in spring container 
	@Override
	public void setBeanName(String beanName) {
	
		System.out.println("setBeanName method of AwareBeanImpl is called");
		
		System.out.println("setBeanName:: Bean Name defined in context= "+ beanName);
		
		System.out.println("=========================================================");
	}
	
	//ApplicationContextAware interface can get the current application context and this can be used to a call any service from the application context
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		
		System.out.println("setApplicationContext method of AwareBeanImpl is called");
		
		System.out.println("setApplicationContext:: Bean Definition Names= "+Arrays.toString(applicationContext.getBeanDefinitionNames()));
		
		System.out.println("=========================================================");
	}

	@Override
	public String toString() {
		return "AwareBeanImpl [getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()="
				+ super.toString() + "]";
	}
	
	
}
