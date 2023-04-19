package Lesson12_HomeWork.entity;

import Lesson12_HomeWork.entity.Bill;

public class Client {
    private String name;
    private String surname;
    private String phoneNumber;
    private String mail;
    private Bill bill;

    public Client(String name, String surname, String phoneNumber, String mail, Bill bill){
        this.name = name;
        this.surname = surname;
        this.phoneNumber = phoneNumber;
        this.mail = mail;
        this.bill = bill;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Bill getBill() {
        return bill;
    }

    public void setBill(Bill bill) {
        this.bill = bill;
    }
}
