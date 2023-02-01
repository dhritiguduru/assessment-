package com.book;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class BookStore {
	public ArrayList<Book> list=new ArrayList<Book>();
	 
	public void addBook(Book b) {
		list.add(b);
	}
	public void searchByTitle(String title) {
		if(list.contains(title)) {
			
			System.out.println(list);
			
		}else {
			System.out.println("Please enter valid title");
		}
		
	}
	public void searchByAuthor(String author) {
		if(list.contains(author)) {
			System.out.println(list);
		}else {
			System.out.println("Enter valid author");
		}
	}
	public void displayAll() {
		Iterator<Book> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	

}
