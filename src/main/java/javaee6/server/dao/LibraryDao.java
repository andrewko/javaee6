package javaee6.server.dao;

import javaee6.domain.library.Book;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class LibraryDao {

	@PersistenceContext
	private EntityManager entityManager;

	public LibraryDao() {
	}

	public Book loadBook(Long id) {
		return entityManager.find(Book.class, id);
	}

}
