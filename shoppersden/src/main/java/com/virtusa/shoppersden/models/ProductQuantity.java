package com.virtusa.shoppersden.models;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
@Entity
@Table(name = "product_Quantity")
public class ProductQuantity {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int productQtyId;
	@OneToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "productId",nullable = false)
	private Product product;
	private int purchaseQty;
	private long amount;
	public int getProductQtyId() {
		return productQtyId;
	}
	public void setProductQtyId(int productQtyId) {
		this.productQtyId = productQtyId;
	}
	public Product getProduct() {
		return product;
	}
	public void setProduct(Product product) {
		this.product = product;
	}
	public int getPurchaseQty() {
		return purchaseQty;
	}
	public void setPurchaseQty(int purchaseQty) {
		this.purchaseQty = purchaseQty;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	
	
}
