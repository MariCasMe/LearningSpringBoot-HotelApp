package com.maricasme.lil.learningspring.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="ROOM")
public class Room {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="ROOM_ID")
	 	private long id;
	@Column(name="NAME")
	 	private String roomName;
	@Column(name="ROOM_NUMBER")
	 	private String roomNumber;
	@Column(name="BED_INFO")
	 	private String roomInfo;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getRoomName() {
		return roomName;
	}
	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	public String getRoomInfo() {
		return roomInfo;
	}
	public void setRoomInfo(String roomInfo) {
		this.roomInfo = roomInfo;
	}
	@Override
	public String toString() {
		return "Room [id=" + id + ", roomName=" + roomName + ", roomNumber=" + roomNumber + ", roomInfo=" + roomInfo
				+ "]";
	}

	
	
	
}
