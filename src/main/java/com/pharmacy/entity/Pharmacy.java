package com.pharmacy.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "pharmacy")
public class Pharmacy implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "pharmacy_id", unique = true)
	private int id;
/*
	@Column(name = "region_id")
	private int regionId;

	@Column(name = "district_id")
	private int districtId;

	@Column(name = "locality_id")
	private int localityId;
*/
	@Column(name = "street")
	private String street;
/*
	@Column(name = "stock_id")
	private int stockId;
*/
	@ManyToOne
	@JoinColumn(name = "region_id", referencedColumnName = "region_id")
	private Region region;

	@ManyToOne
	@JoinColumn(name = "district_id", referencedColumnName = "district_id")
	private District district;

	@ManyToOne
	@JoinColumn(name = "locality_id", referencedColumnName = "locality_id")
	private Locality locality;

	@ManyToOne
	@JoinColumn(name = "stock_id", referencedColumnName = "stock_id")
	private Stock stock;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
/*
	public int getRegionId() {
		return regionId;
	}

	public void setRegionId(int regionId) {
		this.regionId = regionId;
	}

	public int getDistrictId() {
		return districtId;
	}

	public void setDistrictId(int districtId) {
		this.districtId = districtId;
	}

	public int getLocalityId() {
		return localityId;
	}

	public void setLocalityId(int localityId) {
		this.localityId = localityId;
	}
*/
	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
/*
	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}
*/
	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public District getDistrict() {
		return district;
	}

	public void setDistrict(District district) {
		this.district = district;
	}

	public Locality getLocality() {
		return locality;
	}

	public void setLocality(Locality locality) {
		this.locality = locality;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}



	public Pharmacy() {
	};
}
