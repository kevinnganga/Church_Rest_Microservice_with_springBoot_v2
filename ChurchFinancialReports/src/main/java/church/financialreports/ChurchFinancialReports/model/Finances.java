package church.financialreports.ChurchFinancialReports.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Finances {

	@Id
	private String district;
	private String offering;
	private String tithe;
	private String service;
	
	
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date updatedOn;


	public String getDistrict() {
		return district;
	}


	public void setDistrict(String district) {
		this.district = district;
	}


	public String getOffering() {
		return offering;
	}


	public void setOffering(String offering) {
		this.offering = offering;
	}


	public String getTithe() {
		return tithe;
	}


	public void setTithe(String tithe) {
		this.tithe = tithe;
	}


	public String getService() {
		return service;
	}


	public void setService(String service) {
		this.service = service;
	}


	@Column(name = "updated_on",insertable = false,updatable = false)
	public java.util.Date getUpdatedOn() {
		return updatedOn;
	}


	public void setUpdatedOn(java.util.Date updatedOn) {
		this.updatedOn = updatedOn;
	}


	public Finances() {
		super();
	}


	public Finances(String district, String offering, String tithe, String service, java.util.Date updatedOn) {
		super();
		this.district = district;
		this.offering = offering;
		this.tithe = tithe;
		this.service = service;
		this.updatedOn = updatedOn;
	}


	@Override
	public String toString() {
		return "Finances [district=" + district + ", offering=" + offering + ", tithe=" + tithe + ", service=" + service
				+ ", updatedOn=" + updatedOn + "]";
	}
	
	
	
	
	
	
}
