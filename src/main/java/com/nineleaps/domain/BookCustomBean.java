package com.nineleaps.domain;

public class BookCustomBean {

	private String bookName;

	public BookCustomBean() {
		System.out.println("Constructor of BookCustomBean bean is called !! ");
	}

	public void customDestroy() throws Exception {
		
		System.out.println("Custom destroy method of BookCustomBean called !! ");
	}

	public void customInit() throws Exception {
		
		System.out.println("Custom Init method of BookCustomBean called !! ");
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	@Override
	public String toString() {
		return "BookCustomBean [bookName=" + bookName + "]";
	}
	
}
