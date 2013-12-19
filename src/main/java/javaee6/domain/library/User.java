package javaee6.domain.library;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@Entity
@Table(name = "user")
public class User implements Serializable {

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

	@NotNull
	@Size(min = 1, max = 120)
	@Column(length = 120)
	private String email;

	@NotNull
	@Enumerated(EnumType.STRING)
	@Column(name = "user_type", length = 20)
	private UserType userType;

	public User() { }

	public User(String firstName, String lastName, String email, UserType userType) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.userType = userType;
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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public UserType getUserType() {
		return userType;
	}


	public void setUserType(UserType userType) {
		this.userType = userType;
	}

	public enum UserType {

		ADMIN, CUSTOMER;

	}
}
