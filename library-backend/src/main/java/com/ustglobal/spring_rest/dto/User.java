package com.ustglobal.spring_rest.dto;

import java.lang.annotation.Retention;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Constraint;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.Target;
import org.hibernate.validator.constraints.Email;

import lombok.Data;

@Data
@Entity
@Table(name = "Users_details")
public class User {

	@Id
	@Column(name = "userId")
	@GeneratedValue
	private int id;

	@Column(name = "UserName")
	@NotNull
	@Pattern(message = "Invalid name" , regexp = "^.+@.+||..+$")
	private String name;

	@NotNull
	@Column(name = "Email")
	@Email
	@Pattern(message = "Invalid email" , regexp = "^.+@.+||..+$")
	private String  email;

	@Column(name = "password")
	@NotNull
	@Size(min=6, max=45)
	@Pattern.List({
	    @Pattern(regexp = "(?=.*[0-9]).+", message = "Password must contain one digit."),
	    @Pattern(regexp = "(?=.*[a-z]).+", message = "Password must contain one lowercase letter."),
	    @Pattern(regexp = "(?=.*[A-Z]).+", message = "Password must contain one uppercase letter."),
	    @Pattern(regexp = "(?=.*[!@#$%^&*+=?-_()/\"\\.,<>~`;:]).+", message ="Password must contain one special character."),
	    @Pattern(regexp = "(?=\\S+$).+", message = "Password must contain no whitespace.")
	})
	private String password;

	@Column(name="Role")
	@NotNull
	private String role;





}
