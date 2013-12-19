package javaee6.domain.library;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@Table(name = "author")
public class Author implements Serializable {

	@Id
	@GeneratedValue
	@Column(unique = true, nullable = false)
	private Long id;

	@NotNull
	@Size(min = 1, max = 40)
	@Column(name = "first_name", length = 40)
	private String firstName;

	@NotNull
	@Size(min = 1, max = 80)
	@Column(name = "last_name", length = 80)
	private String lastName;

	public Author() {
	}

	public Author(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
