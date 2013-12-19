package javaee6.domain.library;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "book")
public class Book implements Serializable {

	@Id
	@GeneratedValue
	@Column(unique = true, nullable = false)
	private Long id;

	@NotNull
	@Size(min = 1, max = 80)
	@Column(length = 80)
	private String name;

	@NotNull
	@Size(min = 1, max = 20)
	@Column(length = 20)
	private String iban;

	@ManyToMany
	@JoinTable(name = "book_authors", joinColumns = @JoinColumn(name="book_id"), inverseJoinColumns = @JoinColumn(name = "author_id") )
	private Collection<Author> authors = new ArrayList<>();

	public Book() {
	}

	public Book(String name, String iban) {
		this.name = name;
		this.iban = iban;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIban() {
		return iban;
	}

	public void setIban(String iban) {
		this.iban = iban;
	}

	public Collection<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(Collection<Author> authors) {
		this.authors = authors;
	}
}
