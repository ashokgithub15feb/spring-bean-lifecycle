package com.nineleaps.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Book implements InitializingBean, DisposableBean{

	private String bookName;

	public Book() {
		System.out.println("Constructor of Book bean is called !!");
	}
	
	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Destroy method of Book bean called !! ");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet method of Book bean is called !!");
	}
	
	
}
