package com.team.beatify.models;

import java.util.List;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(columnNames = "email"))
public class User extends BaseModel{
	@NotBlank(message = "not blank")
	@Size(min = 5,max = 200,message = "size")
	private String firstName;
    @NotBlank(message = "not blank")
    @Size(min = 5,max = 200,message = "size")
    private String lastName;
    @NotNull(message = "not null")
    private String region;
	@NotBlank(message = "not blank")
	@Email(message = "mail")
	private String email;
	@NotBlank(message = "n")
	@Size( min = 8, max = 200, message = "size")
	private String password;
	@Transient
	private String passwordConfirmation;
	
	public User() {
	}
}