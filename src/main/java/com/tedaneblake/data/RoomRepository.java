package com.tedaneblake.data;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
// CrudRepository takes in the entity i.e Room and the data type of the id i.e Long
@Repository
public interface RoomRepository extends CrudRepository<Room, Long> {
	
}
