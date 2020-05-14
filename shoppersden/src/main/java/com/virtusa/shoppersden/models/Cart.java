package com.virtusa.shoppersden.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Cart")
public class Cart {
	 
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int cartId;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "userId",nullable = false)
	private User user;
	@ManyToMany(cascade = CascadeType.MERGE,fetch = FetchType.EAGER)
	@JoinColumn(referencedColumnName = "productQtyId")
	private List<ProductQuantity> productQty;
	public int getCartId() {
		return cartId; 
	}
	public void setCartId(int cartId) {
		this.cartId = cartId;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<ProductQuantity> getProductQty() {
		return productQty;
	}
	public void setProductQty(List<ProductQuantity> productQty) {
		this.productQty = productQty;
	}
	
	
	
}
