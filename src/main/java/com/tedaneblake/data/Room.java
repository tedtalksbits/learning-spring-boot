package com.tedaneblake.data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ROOM")
public class Room {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@Column(name="ROOM_ID")
	private long id;
	
	@Column(name="NAME")
	private String name;
	
	@Column(name = "ROOM_NUMBER")
	private String roomNumber;
	
	@Column(name = "BED_INFO")
	private String bedInfo;
	
	
	public String getBedInfo() {
		return bedInfo;
	}
	public long getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getRoomNumber() {
		return roomNumber;
	}
	
	public void setBedInfo(String bedInfo) {
		this.bedInfo = bedInfo;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setRoomNumber(String roomNumber) {
		this.roomNumber = roomNumber;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Room {" + 
				" id: " + id + 
				", name: " + name + 
				", bedInfo: " + bedInfo + 
				", roomNumber: " + roomNumber + 
				" }";
	}
}
