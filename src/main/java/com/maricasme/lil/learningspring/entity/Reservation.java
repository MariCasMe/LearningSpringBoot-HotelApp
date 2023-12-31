package com.maricasme.lil.learningspring.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="RESERVATION")
public class Reservation {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="RESERVATION_ID")
	private long id;
	
	@ManyToOne
	@JoinColumn(name="ROOM_ID")
	private Room room;
	
	@ManyToOne
	@JoinColumn(name="GUEST_ID")
	private Guest guest;
	
	@Column(name="RES_DATE")
	private Date reservationDate;
	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}

	public Guest getGuest() {
		return guest;
	}

	public void setGuest(Guest guest) {
		this.guest = guest;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", reservationDate=" + reservationDate + ", guest=" + guest + ", room=" + room
				+ "]";
	}
	
	
}
