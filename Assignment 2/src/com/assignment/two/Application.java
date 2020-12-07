package com.assignment.two;
import java.util.*;
import com.assignment.two.services.BookService;
public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Book book1=new Book("B1","Silence of lambs","Stephen King",450);
		Book book2=new Book("B2","Harry Potter","JK Rowling",500);
		BookService service=new BookService();
		System.out.println("Enter the Customer type:");
		String type=sc.next();
		System.out.println("Book Name:"+book1.getBookName()+"\nAuthor:"+book1.getBookAuthor()+"\nDiscount="+service.calculateDiscount(book1));
		System.out.println("Book Name:"+book2.getBookName()+"\nAuthor:"+book2.getBookAuthor()+"\nDiscount="+service.calculateDiscount(book2,type));
		sc.close();
	}

}
