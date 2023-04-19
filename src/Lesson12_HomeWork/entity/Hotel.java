package Lesson12_HomeWork.entity;

import java.util.ArrayList;

public class Hotel {
    private String name;
    private ArrayList<Room> roomList = new ArrayList<>();

    public Hotel(String name, ArrayList<Room> roomList) {
        this.name = name;
        this.roomList = roomList;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public ArrayList<Room> getRoomList() {
        return roomList;
    }
    public void setRoomList(ArrayList<Room> roomList) {
        this.roomList = roomList;
    }
}
