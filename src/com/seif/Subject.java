package com.seif;

public class Subject {
    private String name;
    private int lectures;


    public Subject(String name, int lectures) {
        this.name = name;
        this.lectures = lectures;
    }

    public void redLecs(){
        lectures--;
    }
    public int getLectures(){
        return lectures;
    }

    public String getName() {
        return name;
    }
}
