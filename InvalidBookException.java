package com.book;
//user defined exception
public class InvalidBookException extends Exception {

	public InvalidBookException(String bookID, String category, float price) {
		if (category == "science" && category == "fiction" && category == "technology" && category == "others") {
			System.out.println("Valid Category");
			
		} else if (price < 0) {
			System.out.println("Inavlid Price. ");

		} else if (bookID.charAt(1) != 'b' && bookID.charAt(1) != 'B' && bookID.length()==4) {
			System.out.println("Invalid book ID");

		} else {
			System.out.println();
		}
		
	}

	@Override
	public String toString() {
		return "InvalidBookException []";
	}

}


