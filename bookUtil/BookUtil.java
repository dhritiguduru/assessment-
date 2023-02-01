package com.bookUtil;

import java.util.Scanner;

import com.book.*;

public class BookUtil {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		BookStore bs = new BookStore();
		try {

			System.out.println("Please enter Book ID: ");
			String id = sc.next();
			System.out.println("Please enter Book Title: ");
			String ttl = sc.next();
			System.out.println("Please enter Book author: ");
			String auth = sc.next();
			System.out.println("Please enter Book Category: ");
			String cat = sc.next();
			System.out.println("Please enter Book price: ");
			float pr = sc.nextFloat();

			Book ob = new Book(id, ttl, auth, cat, pr);

			bs.addBook(ob);
			System.out.println("The book details are: " +bs.list);

			System.out.println("Enter Name to be searched: ");
			String auth1 = sc.next();
			bs.searchByAuthor(auth1);

			System.out.println("Enter Title to be searched: ");
			String ttl1 = sc.next();
			bs.searchByTitle(ttl1);

			bs.displayAll();
			throw new InvalidBookException(id, cat, pr);
		} catch (InvalidBookException ex) {

		}
		sc.close();
	}

}
