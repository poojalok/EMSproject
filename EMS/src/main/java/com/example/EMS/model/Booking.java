package com.example.EMS.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="Bookingevent")
public class Booking {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String contact;
    private String email;
    private String address;
    private String date;
    private String eventType;
    private String decorationQuality;
    private String cateringQuality;
    private double totalBudget;
	public Booking() {
		
	}
	public Booking(int id, String name, String contact, String email, String address, String date, String eventType,
			String decorationQuality, String cateringQuality, double totalBudget) {
		super();
		this.id = id;
		this.name = name;
		this.contact = contact;
		this.email = email;
		this.address = address;
		this.date = date;
		this.eventType = eventType;
		this.decorationQuality = decorationQuality;
		this.cateringQuality = cateringQuality;
		this.totalBudget = totalBudget;
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
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
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
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getEventType() {
		return eventType;
	}
	public void setEventType(String eventType) {
		this.eventType = eventType;
	}
	public String getDecorationQuality() {
		return decorationQuality;
	}
	public void setDecorationQuality(String decorationQuality) {
		this.decorationQuality = decorationQuality;
	}
	public String getCateringQuality() {
		return cateringQuality;
	}
	public void setCateringQuality(String cateringQuality) {
		this.cateringQuality = cateringQuality;
	}
	public double getTotalBudget() {
		return totalBudget;
	}
	public void setTotalBudget(double totalBudget) {
		this.totalBudget = totalBudget;
	}
	
}