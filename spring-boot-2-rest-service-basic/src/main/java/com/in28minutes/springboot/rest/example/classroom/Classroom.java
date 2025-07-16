package com.in28minutes.springboot.rest.example.classroom;

public class Classroom {
    private Long id;
    private String roomNumber;
    private String subject;

    public Classroom() {}

    public Classroom(Long id, String roomNumber, String subject) {
        this.id = id;
        this.roomNumber = roomNumber;
        this.subject = subject;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}