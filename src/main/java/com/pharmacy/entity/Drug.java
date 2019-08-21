package com.pharmacy.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
@Table(name = "drug")
public class Drug implements Serializable {

	private static final long serialVersionUID = 1L;

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	@Column(name = "drug_id", unique = true)
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "composition")
	private String composition;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "release_form_id", referencedColumnName = "release_form_id")
	private ReleaseForm releaseForm;
/*
	@Column(name = "release_form_id", updatable = false, insertable = false)
	private int releaseFormKey;
	
	public int getReleaseFormKey() {
		return releaseFormKey;
	}

	public void setReleaseFormKey(int releaseFormKey) {
		this.releaseFormKey = releaseFormKey;
	}
*/
	@Column(name = "indications")
	private String indications;

	@Column(name = "contraindications")
	private String contraindications;

	@Column(name = "application_during_pregnancy_and_lactation")
	private String applicationDuringPregnancyAndLactation;

	@Column(name = "method_administration_and_dose")
	private String methodAdministrationAndDose;

	@Column(name = "overdose")
	private String overdose;

	@Column(name = "side_effects")
	private String sideEffects;

	@Column(name = "terms_conditions_storage")
	private String termsConditionsStorage;

	public Drug() {
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getComposition() {
		return composition;
	}

	public void setComposition(String composition) {
		this.composition = composition;
	}

	public ReleaseForm getReleaseForm() {
		return releaseForm;
	}

	public void setReleaseForm(ReleaseForm releaseForm) {
		this.releaseForm = releaseForm;
	}
	
	public String getIndications() {
		return indications;
	}

	public void setIndications(String indications) {
		this.indications = indications;
	}

	public String getContraindications() {
		return contraindications;
	}

	public void setContraindications(String contraindications) {
		this.contraindications = contraindications;
	}

	public String getApplicationDuringPregnancyAndLactation() {
		return applicationDuringPregnancyAndLactation;
	}

	public void setApplicationDuringPregnancyAndLactation(String applicationDuringPregnancyAndLactation) {
		this.applicationDuringPregnancyAndLactation = applicationDuringPregnancyAndLactation;
	}

	public String getMethodAdministrationAndDose() {
		return methodAdministrationAndDose;
	}

	public void setMethodAdministrationAndDose(String methodAdministrationAndDose) {
		this.methodAdministrationAndDose = methodAdministrationAndDose;
	}

	public String getOverdose() {
		return overdose;
	}

	public void setOverdose(String overdose) {
		this.overdose = overdose;
	}

	public String getSideEffects() {
		return sideEffects;
	}

	public void setSideEffects(String sideEffects) {
		this.sideEffects = sideEffects;
	}

	public String getTermsConditionsStorage() {
		return termsConditionsStorage;
	}

	public void setTermsConditionsStorage(String termsConditionsStorage) {
		this.termsConditionsStorage = termsConditionsStorage;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	};

}
