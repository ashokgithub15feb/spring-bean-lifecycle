package com.nineleaps;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nineleaps.config.BlogPostsApplication;
import com.nineleaps.demopackageA.DemoBeanA;
import com.nineleaps.domain.AwareBeanImpl;
import com.nineleaps.domain.Book;
import com.nineleaps.domain.BookBean;
import com.nineleaps.domain.BookCustomBean;

@SpringBootApplication
public class SpringBeanLifecycleApplication {

	public static void main(String[] args) {
		// SpringApplication.run(SpringBeanLifecycleApplication.class, args);

		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");

		AwareBeanImpl bean = (AwareBeanImpl) context.getBean("awareBean");

		BookBean beanBean = (BookBean) context.getBean("bookBeanPost");
		System.out.println(beanBean.getBookName());

		Book beanBook = (Book) context.getBean("bookBean");
		System.out.println(beanBook.getBookName());

		BookCustomBean beancus = (BookCustomBean) context.getBean("bookCustomBean");
		System.out.println(beancus.getBookName());

		System.out.println("====================================");

		ApplicationContext context1 = SpringApplication.run(BlogPostsApplication.class, args);
		
	    AnnotationConfigApplicationContext context1a = new AnnotationConfigApplicationContext();
	    context1a.register(BlogPostsApplication.class);
	    context1a.refresh();
	    
	    DemoBeanA demoBeanA = context1.getBean(DemoBeanA.class);
	    
		
		System.out.println("Contains A  " + context1.containsBeanDefinition("demoBeanA"));
		System.out.println("Contains B1  " + context1.containsBeanDefinition("demoBeanB1"));
		System.out.println("Contains B2  " + context1.containsBeanDefinition("demoBeanB2"));
		System.out.println("Contains B3  " + context1.containsBeanDefinition("demoBeanB3"));
		System.out.println("Contains C   " + context1.containsBeanDefinition("demoBeanC"));
		System.out.println("Contains D   " + context1.containsBeanDefinition("demoBeanD"));

		((AbstractApplicationContext) context1).registerShutdownHook();

	}

}
