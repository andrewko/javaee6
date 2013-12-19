package javaee6.server.rest.library;

import javaee6.domain.library.Author;
import javaee6.domain.library.AuthorList;
import javaee6.domain.library.Book;
import javaee6.domain.library.BookList;
import javaee6.server.ejb.Library;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/")
@RequestScoped
public class LibraryRestService {

	@Inject
	private Library libraryBean;

	@GET
	@Path("/book")
	@Produces(MediaType.APPLICATION_JSON)
	public BookList listBooks() {
		return libraryBean.loadBooks();
	}

	@GET
	@Path("/book/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Book loadBook(@PathParam("id") Long id) {
		return libraryBean.loadBook(id);
	}

	@GET
	@Path("/author/{id}")
	@Produces(MediaType.APPLICATION_JSON)
	public Author loadAuthor(@PathParam("id") Long id) {
		return libraryBean.loadAuthor(id);
	}

	@GET
	@Path("/author")
	@Produces(MediaType.APPLICATION_JSON)
	public AuthorList listAuthors() {
		return libraryBean.loadAuthors();
	}

}
