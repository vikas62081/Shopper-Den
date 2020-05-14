package com.virtusa.shoppersden.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;

@Entity
@Table(name = "users")
public class User {
	@Id
	@Column( name = "userId")
	@GeneratedValue(strategy = GenerationType.TABLE)
	private String userId;
	@Column(length = 40)
	private String userName;
	@Column(length = 40,unique = true,nullable = false)
	private String email;
	@Min(10)
	private long phoneNo;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "questionId",nullable = false)
	private SecurityQuestion securityQuestion;
	@Column(length = 40)
	private String answer;
	@Column( name = "PASSWORD",length = 150)
	private String password;
	@Column(length = 80)
	private String address;
	@Column( name = "ENABLED")
	private byte enabled;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "user",fetch=FetchType.EAGER)
	private List<UserRole> userRole;
	public String getUserId() {
		return userId;
	} 
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public long getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}
	public SecurityQuestion getSecurityQuestion() {
		return securityQuestion;
	}
	public void setSecurityQuestion(SecurityQuestion securityQuestion) {
		this.securityQuestion = securityQuestion;
	}
	public String getAnswer() {
		return answer;
	}
	public void setAnswer(String answer) {
		this.answer = answer;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public byte getEnabled() {
		return enabled;
	}
	public void setEnabled(byte enabled) {
		this.enabled = enabled;
	}
	public List<UserRole> getUserRole() {
		return userRole;
	}
	public void setUserRole(List<UserRole> userRole) {
		this.userRole = userRole;
	}	

	
	
}
