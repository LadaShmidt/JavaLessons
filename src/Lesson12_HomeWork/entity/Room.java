package Lesson12_HomeWork.entity;

public class Room {
    private int amountPeople;
    private int costRoom;
    private boolean isFree;

    public Room(int amountBed, int costRoom, boolean isFree) {
        this.amountPeople = amountBed;
        this.costRoom = costRoom;
        this.isFree = isFree;
    }
    public int getAmountBed() {
        return amountPeople;
    }
    public void setAmountBed(int amountPeople) {
        this.amountPeople = amountPeople;
    }
    public int getCostRoom() {
        return costRoom;
    }
    public void setCostRoom(int costRoom) {
        this.costRoom = costRoom;
    }
    public boolean getIsFree() {
        return isFree;
    }
    public void setIsFree(boolean free) {
        isFree = free;
    }
}
