package com.springrest.inventoryManagement.springrest.entities;

import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;


@Entity
public class Outwards {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int outward_Id;
	private String item_name;
	private int invoice_no;
	private Date date_of_supply;
	private Date date_of_del;
	private String delivered_to;
	private int quantity;
	private String purpose;
	private int reciept_no;
	private int bill_value;
	private String checked_by;
	
	@ManyToOne(cascade = CascadeType.ALL)
	Godowns godowns;

	public Outwards(int outward_Id, String item_name, int invoice_no, Date date_of_supply, Date date_of_del,
			String delivered_to, int quantity, String purpose, int reciept_no, int bill_value, String checked_by,
			Godowns godowns) {
		super();
		this.outward_Id = outward_Id;
		this.item_name = item_name;
		this.invoice_no = invoice_no;
		this.date_of_supply = date_of_supply;
		this.date_of_del = date_of_del;
		this.delivered_to = delivered_to;
		this.quantity = quantity;
		this.purpose = purpose;
		this.reciept_no = reciept_no;
		this.bill_value = bill_value;
		this.checked_by = checked_by;
		this.godowns = godowns;
	}

	public Outwards() {
		super();
	}

	public int getOutward_Id() {
		return outward_Id;
	}

	public void setOutward_Id(int outward_Id) {
		this.outward_Id = outward_Id;
	}

	public String getItem_name() {
		return item_name;
	}

	public void setItem_name(String item_name) {
		this.item_name = item_name;
	}

	public int getInvoice_no() {
		return invoice_no;
	}

	public void setInvoice_no(int invoice_no) {
		this.invoice_no = invoice_no;
	}

	public Date getDate_of_supply() {
		return date_of_supply;
	}

	public void setDate_of_supply(Date date_of_supply) {
		this.date_of_supply = date_of_supply;
	}

	public Date getDate_of_del() {
		return date_of_del;
	}

	public void setDate_of_del(Date date_of_del) {
		this.date_of_del = date_of_del;
	}

	public String getDelivered_to() {
		return delivered_to;
	}

	public void setDelivered_to(String delivered_to) {
		this.delivered_to = delivered_to;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public int getReciept_no() {
		return reciept_no;
	}

	public void setReciept_no(int reciept_no) {
		this.reciept_no = reciept_no;
	}

	public int getBill_value() {
		return bill_value;
	}

	public void setBill_value(int bill_value) {
		this.bill_value = bill_value;
	}

	public String getChecked_by() {
		return checked_by;
	}

	public void setChecked_by(String checked_by) {
		this.checked_by = checked_by;
	}

	public Godowns getGodowns() {
		return godowns;
	}

	public void setGodowns(Godowns godowns) {
		this.godowns = godowns;
	}

	@Override
	public String toString() {
		return "Outwards [outward_Id=" + outward_Id + ", item_name=" + item_name + ", invoice_no=" + invoice_no
				+ ", date_of_supply=" + date_of_supply + ", date_of_del=" + date_of_del + ", delivered_to="
				+ delivered_to + ", quantity=" + quantity + ", purpose=" + purpose + ", reciept_no=" + reciept_no
				+ ", bill_value=" + bill_value + ", checked_by=" + checked_by + ", godowns=" + godowns + "]";
	}
	
	
	
}
