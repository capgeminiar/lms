package com.appsone.bean;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name ="BOOKS")
public class Book {
	
	@OneToMany(mappedBy = "book", cascade = {CascadeType.REMOVE})
    List<Borrower> currentMembers = new ArrayList<Borrower>();
	
	public List<Borrower> getCurrentMembers() {
		return currentMembers;
	}

	public void setCurrentMembers(List<Borrower> currentMembers) {
		this.currentMembers = currentMembers;
	}

	@Id
   	@Column(name = "BOOKID")
	private int bookId;
	
   	@Column(name = "BOOKCODE")
	private String bookcode;

   	@Column(name = "BOOKTITLE")
	private String bookTitle;

   	@Column(name = "AUTHOR")
	private String author;
   	
   	@Column(name = "BINDINGID")
	private int bindingId;
	//private int noCopiesActual;
	//private int noCopiesCurrent;
   	
   	@Column(name = "CATEGORYID")
	private int categoryId;
   	
   	@Column(name = "PUBLICATIONYEAR")
	private int publicationYear;
   	
   	@Column(name = "BOOKPRICE")
	private int bookPrice;
   	
   	@Column(name = "BOOKEDITION")
	private String bookEdition;
   	
   	@Column(name="ISACTIVE")
   	private String isactive;
	
	
	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getBookcode() {
		return bookcode;
	}

	public void setBookcode(String bookcode) {
		this.bookcode = bookcode;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getBindingId() {
		return bindingId;
	}

	public void setBindingId(int bindingId) {
		this.bindingId = bindingId;
	}

	/*public int getNoCopiesActual() {
		return noCopiesActual;
	}

	public void setNoCopiesActual(int noCopiesActual) {
		this.noCopiesActual = noCopiesActual;
	}

	public int getNoCopiesCurrent() {
		return noCopiesCurrent;
	}

	public void setNoCopiesCurrent(int noCopiesCurrent) {
		this.noCopiesCurrent = noCopiesCurrent;
	}*/

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public int getPublicationYear() {
		return publicationYear;
	}

	public void setPublicationYear(int publicationYear) {
		this.publicationYear = publicationYear;
	}

	public int getBookPrice() {
		return bookPrice;
	}

	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}

	public String getBookEdition() {
		return bookEdition;
	}

	public void setBookEdition(String bookEdition) {
		this.bookEdition = bookEdition;
	}

	
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookcode=" + bookcode + ", bookTitle=" + bookTitle + ", author=" + author
				+ ", bindingId=" + bindingId + /*", noCopiesActual=" + noCopiesActual + ", noCopiesCurrent="
				+ noCopiesCurrent +*/ ", categoryId=" + categoryId + ", publicationYear=" + publicationYear
				+ ", bookPrice=" + bookPrice + ", bookEdition=" + bookEdition + ", isactive=" + isactive + "]";
	}

	public Book() {
		super();
	}

	public Book(int bookId, String bookcode, String bookTitle, String author, int bindingId, /*int noCopiesActual,
			int noCopiesCurrent,*/ int categoryId, int publicationYear, int bookPrice, String bookEdition, String isactive) {
		super();
		this.bookId = bookId;
		this.bookcode = bookcode;
		this.bookTitle = bookTitle;
		this.author = author;
		this.bindingId = bindingId;
		/*this.noCopiesActual = noCopiesActual;
		this.noCopiesCurrent = noCopiesCurrent;*/
		this.categoryId = categoryId;
		this.publicationYear = publicationYear;
		this.bookPrice = bookPrice;
		this.bookEdition = bookEdition;
		this.isactive=isactive;
	}

	public String getIsactive() {
		return isactive;
	}

	public void setIsactive(String isactive) {
		this.isactive = isactive;
	}

	public String printBookInfo() {
		return "bookId=" + bookId + ", bookcode=" + bookcode + ", bookTitle=" + bookTitle + ", author=" + author
				+ ", publicationYear=" + publicationYear + ", bookPrice=" + bookPrice + ", bookEdition=" + bookEdition;
	}
}
