package com.cg.ohms.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "bookingdetails")
public class BookingDetailsDTO {
    @Id
	private int booking_id;
	private int hotelid;
	private int roomid;
	private int customerid;
	private Date checkindate;
	private Date checkoutdate;
	@Override
	public String toString() {
		return "BookingDetailsDTO [booking_id=" + booking_id + ", hotelid=" + hotelid + ", roomid=" + roomid
				+ ", customerid=" + customerid + ", checkindate=" + checkindate + ", checkoutdate=" + checkoutdate
				+ "]";
	}
	public void setBooking_id(int booking_id) {
		this.booking_id = booking_id;
	}
	public int getBooking_id() {
		return booking_id;
	}
	public int getHotelid() {
		return hotelid;
	}
	public int getRoomid() {
		return roomid;
	}
	public int getCustomerid() {
		return customerid;
	}
	public Date getCheckindate() {
		return checkindate;
	}
	public Date getCheckoutdate() {
		return checkoutdate;
	}
	public void setHotelid(int hotelid) {
		this.hotelid = hotelid;
	}
	public void setRoomid(int roomid) {
		this.roomid = roomid;
	}
	public void setCustomerid(int customerid) {
		this.customerid = customerid;
	}
	public void setCheckindate(Date checkindate) {
		this.checkindate = checkindate;
	}
	public void setCheckoutdate(Date checkoutdate) {
		this.checkoutdate = checkoutdate;
	}

}
