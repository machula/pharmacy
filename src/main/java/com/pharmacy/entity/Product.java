package com.pharmacy.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "products")
public class Product implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "products_id", unique = true)
	private int id;

	/*@Column(name = "stock_id")
	private int stockId;

	@Column(name = "drug_id")
	private int drugId;*/

	@Column(name = "series")
	private int series;

	@Column(name = "party")
	private int party;

	@Column(name = "quantity")
	private int quantity;
/*
	@Column(name = "provider_id")
	private int providerId;*/

	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd")
	@Column(name = "shelf_life")
	private Date shelfLife;

	@ManyToOne
	@JoinColumn(name = "stock_id", referencedColumnName = "stock_id")
	private Stock stock;

	@ManyToOne
	@JoinColumn(name = "drug_id", referencedColumnName = "drug_id")
	private Drug drug;

	@ManyToOne
	@JoinColumn(name = "provider_id", referencedColumnName = "provider_id")
	private Provider provider;

	public Product() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	/*public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}*/
/*
	public int getDrugId() {
		return drugId;
	}

	public void setDrugId(int drugId) {
		this.drugId = drugId;
	}
*/
	public int getSeries() {
		return series;
	}

	public void setSeries(int series) {
		this.series = series;
	}

	public int getParty() {
		return party;
	}

	public void setParty(int party) {
		this.party = party;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
/*
	public int getProviderId() {
		return providerId;
	}

	public void setProviderId(int providerId) {
		this.providerId = providerId;
	}
*/
	public Date getShelfLife() {
		return shelfLife;
	}

	public void setShelfLife(Date shelfLife) {
		this.shelfLife = shelfLife;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public Drug getDrug() {
		return drug;
	}

	public void setDrug(Drug drug) {
		this.drug = drug;
	}

	public Provider getProvider() {
		return provider;
	}

	public void setProvider(Provider provider) {
		this.provider = provider;
	};
	
}
