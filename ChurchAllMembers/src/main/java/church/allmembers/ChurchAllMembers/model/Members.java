package church.allmembers.ChurchAllMembers.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class Members {

	@Id
	private String name;
	private String district;
	private String fullMember;
	@UpdateTimestamp
	@Temporal(TemporalType.TIMESTAMP)
	private java.util.Date membershipDate;
	private String phone;
	private String servingPosition;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getFullMember() {
		return fullMember;
	}
	public void setFullMember(String fullMember) {
		this.fullMember = fullMember;
	}
	public java.util.Date getMembershipDate() {
		return membershipDate;
	}
	public void setMembershipDate(java.util.Date membershipDate) {
		this.membershipDate = membershipDate;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getServingPosition() {
		return servingPosition;
	}
	public void setServingPosition(String servingPosition) {
		this.servingPosition = servingPosition;
	}
	public Members() {
		
	}
	public Members(String name, String district, String fullMember, Date membershipDate, String phone,
			String servingPosition) {
		super();
		this.name = name;
		this.district = district;
		this.fullMember = fullMember;
		this.membershipDate = membershipDate;
		this.phone = phone;
		this.servingPosition = servingPosition;
	}
	@Override
	public String toString() {
		return "Members [name=" + name + ", district=" + district + ", fullMember=" + fullMember + ", membershipDate="
				+ membershipDate + ", phone=" + phone + ", servingPosition=" + servingPosition + "]";
	}
	
	
	
	
	
	
}
