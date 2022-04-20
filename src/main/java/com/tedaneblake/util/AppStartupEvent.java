package com.tedaneblake.util;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.tedaneblake.data.Room;
import com.tedaneblake.data.RoomRepository;

@Component
public class AppStartupEvent implements ApplicationListener<ApplicationReadyEvent> {
	
	//data field
	private final RoomRepository roomRepository;
	
	//constructor
	public AppStartupEvent(RoomRepository roomRepository) {
		this.roomRepository = roomRepository;
	}
	
	@Override
	//method
	public void onApplicationEvent(ApplicationReadyEvent event) {
		Iterable<Room> rooms = this.roomRepository.findAll();
		rooms.forEach(System.out::println);
	}
}
