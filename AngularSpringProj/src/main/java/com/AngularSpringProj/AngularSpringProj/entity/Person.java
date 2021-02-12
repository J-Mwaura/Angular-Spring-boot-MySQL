package com.AngularSpringProj.AngularSpringProj.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "person")
public class Person implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", updatable = false)
    protected Integer id;
    @Basic(optional = false)
    //@NotNull
    //@Size(min = 1, max = 50)
    @Column(name = "FIRSTNAME")
    protected String firstname;
    @Basic(optional = false)
    //@NotNull
    //@Size(min = 1, max = 100)
    @Column(name = "LASTNAME")
    protected String lastname;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
   // @NotNull
    //@Size(min = 1, max = 45)
    @Column(name = "EMAIL")
    protected String email;
    @Basic(optional = false)
    //@NotNull
    //@Size(min = 1, max = 45)
    @Column(name = "ADDRESS")
    protected String address;
    @Basic(optional = false)
    //@NotNull
    //@Size(min = 1, max = 45)
    @Column(name = "CITY")
    protected String city;
    //@Size(max = 100)
    @Column(name = "PASSWORD")
    protected String password;
    
    @Column(name = "SECRET")
    protected String secret;
    @Column(name = "EXPIRYDATE")
    @Temporal(javax.persistence.TemporalType.DATE)
    protected Date expiryDate;
    @Column(name = "TOKEN")
    protected String token;
    @Column(name = "EMAIL_VERIFICATION_ATTEMPTS")
    protected Integer email_verification_attempts;
    @Column(name = "EMAIL_VERIFICATION_HASH")
    protected String email_verification_hash;
    @Column(name = "STATUS")
    protected String status;
    //@Size(max = 31)
    @Column(name = "DTYPE")
    protected String dtype;
    @Lob
    @Column(name = "AVATAR")
    protected byte[] avatar;
    //@Size(max = 45)
    @Column(name = "IMAGE", length=45)
    protected String image;
    
    public Person() {}
    
	public Person(Integer id, String firstname, String lastname, String email, String address, String city,
			String password, String secret, Date expiryDate, String token, Integer email_verification_attempts,
			String email_verification_hash, String status, String dtype, byte[] avatar, String image) {
		super();
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;
		this.email = email;
		this.address = address;
		this.city = city;
		this.password = password;
		this.secret = secret;
		this.expiryDate = expiryDate;
		this.token = token;
		this.email_verification_attempts = email_verification_attempts;
		this.email_verification_hash = email_verification_hash;
		this.status = status;
		this.dtype = dtype;
		this.avatar = avatar;
		this.image = image;
		
		
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSecret() {
		return secret;
	}

	public void setSecret(String secret) {
		this.secret = secret;
	}

	public Date getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Integer getEmail_verification_attempts() {
		return email_verification_attempts;
	}

	public void setEmail_verification_attempts(Integer email_verification_attempts) {
		this.email_verification_attempts = email_verification_attempts;
	}

	public String getEmail_verification_hash() {
		return email_verification_hash;
	}

	public void setEmail_verification_hash(String email_verification_hash) {
		this.email_verification_hash = email_verification_hash;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getDtype() {
		return dtype;
	}

	public void setDtype(String dtype) {
		this.dtype = dtype;
	}

	public byte[] getAvatar() {
		return avatar;
	}

	public void setAvatar(byte[] avatar) {
		this.avatar = avatar;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}
    
    

}
