package com.example.Room.API.controller;


import com.example.Room.API.model.Room;
import com.example.Room.API.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RoomController {

    @Autowired
    RoomService roomService;

    //post api

    @PostMapping("room")
    public String addRoom(@RequestBody Room newRoom)
    {
        return roomService.addRoom(newRoom);
    }



    //get api

    @GetMapping("rooms")
    public List<Room> getRooms()
    {

        return roomService.getRooms();
    }
}
