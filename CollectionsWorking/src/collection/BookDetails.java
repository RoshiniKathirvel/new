package collection;

import java.util.*;
class Book {
	private String authorname;
	private String bookname;
	private double price;
	public Book(String authorname,String bookname,double price){
		this.authorname=authorname;
		this.bookname=bookname;
		this.price=price;
	}
	public void setAuthor(String authorname) {
		this.authorname=authorname;
	}
	public void setbookname(String bookname) {
		this.bookname=bookname;
	}
	public void setprice(double price) {
		this.price=price;
	}
	public String getAuthor() {
		return authorname;
	}
	public String getbookname() {
		return bookname;
	}
	public double getprice() {
		return price;
	}
	@Override
	public String toString() {
		return "Author name: "+authorname+"Bookname"+bookname+"Price"+price;
	}
// @Override
//      public int compareTo(Book ob) {
//		return (int)(this.getprice()-ob.getprice());
//	  }
}
	class AuthorName implements Comparator<Book>{
		@Override
		public int compare(Book b1,Book b2) {
			return b1.getAuthor().compareTo(b2.getAuthor());
		}
	}
	class Price implements Comparator<Book>{
		@Override
		public int compare(Book p1,Book p2) {
			return (int) (p1.getprice()-p2.getprice());
		}
	}
	class BookName implements Comparator<Book>{
		@Override
		public int compare(Book c1,Book c2) {
			return c1.getbookname().compareTo(c2.getbookname());
		}
	}

public class BookDetails {
 public static void main(String[] args) {
	 ArrayList<Book> booklist=new ArrayList<>();
	 booklist.add(new Book("Roshini","story",1000.0));
	 booklist.add(new Book("Dinesh","Quizz",200.0));
	 booklist.add(new Book("Sandhiya","comics",100.0));
	 for(Book b:booklist) {
		 //System.out.println(booklist);
		 System.out.println("Displaying the details");
		 System.out.println(b.getAuthor()+" "+b.getbookname()+" "+b.getprice());
	 }
	 //Collections.sort(booklist,new AuthorName());
	 Collections.sort(booklist,new Price());
	 for(Book b:booklist) {
		 //System.out.println(booklist);
		 System.out.println(b.getAuthor()+" "+b.getbookname()+" "+b.getprice());
	 }
//	 Iterator<Book> itb=booklist.iterator();
//	 while(itb.hasNext()) {
//		 System.out.println(itb.next());
//	 }
//	 
//	 Comparator<Book> byauthorname=Comparator.comparing(Book::getAuthor());
//	 books.sort(byauthorname);
 }
}
