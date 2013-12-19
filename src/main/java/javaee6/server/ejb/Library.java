package javaee6.server.ejb;

import javaee6.domain.library.Author;
import javaee6.domain.library.AuthorList;
import javaee6.domain.library.Book;
import javaee6.domain.library.BookList;

import javax.ejb.Local;

@Local
public interface Library {

	BookList loadBooks();

	AuthorList loadAuthors();

	Book loadBook(Long id);

	Author loadAuthor(Long id);

	Book saveBook(Book book);

	Author saveAuthor(Author author);

}
