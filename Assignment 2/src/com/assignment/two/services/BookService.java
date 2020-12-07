package com.assignment.two.services;

import com.assignment.two.Book;

public class BookService {
	public double calculateDiscount(Book book) {
		double discount;
		int bprice=book.getBookPrice();
		if(bprice < 500) {
			discount=bprice* 0.05;
		}else {
			discount=bprice* 0.1;
		}
		return discount;
	}
	public double calculateDiscount(Book book, String customerType) {
		double discount;
		int bprice=book.getBookPrice();
		
		if(customerType == "Corporate") {
			discount=bprice* 0.05;
		}else if(customerType == "Retail") {
			discount=bprice* 0.1;
		}else {
			discount=bprice* 0.02;
		}
		return discount;
	}
}
