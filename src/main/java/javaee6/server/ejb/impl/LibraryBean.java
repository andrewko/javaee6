package javaee6.server.ejb.impl;

import javaee6.domain.library.Author;
import javaee6.domain.library.AuthorList;
import javaee6.domain.library.Book;
import javaee6.domain.library.BookList;
import javaee6.server.dao.LibraryDao;
import javaee6.server.ejb.Library;

import javax.ejb.Stateless;
import javax.inject.Inject;

@Stateless(name = "LibraryBean")
public class LibraryBean implements Library {

	@Inject
	private LibraryDao libraryDao;

	@Override
	public BookList loadBooks() {
		BookList result = new BookList();
		return result;
	}

	@Override
	public AuthorList loadAuthors() {
		return null;
	}

	@Override
	public Book loadBook(Long id) {
		return libraryDao.loadBook(id);
	}

	@Override
	public Author loadAuthor(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Book saveBook(Book book) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Author saveAuthor(Author author) {
		// TODO Auto-generated method stub
		return null;
	}
}
