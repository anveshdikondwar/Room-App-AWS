package com.example.Room.API.repo;


import com.example.Room.API.model.Room;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IRoomRepo extends CrudRepository<Room,Integer> {
}
