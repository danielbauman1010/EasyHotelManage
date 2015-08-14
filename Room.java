/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easymanagehotel;

import javax.sound.sampled.AudioFileFormat;

/**
 *
 * @author daniel
 */
public class Room {    
    private int number;
    private boolean isAvailable;
    private String type;
    private String view;
    private String currentOwner; 
    private String timeLeft;
    public Room(int number,String type, String view, String currentOwner, String timeLeft, boolean isAvailable) {
        this.number = number;
        this.isAvailable = isAvailable;
        this.type = type;
        this.view = view;
        this.currentOwner = currentOwner;
        this.timeLeft = timeLeft;
    }
    public Room(int number, String type, String view) {
        this.number = number;
        this.isAvailable = true;
        this.type = type;
        this.view = view;
        this.currentOwner = "no owner at the moment";
        this.timeLeft = "not rented at the moment";
    }

    public String getTimeLeft() {
        return timeLeft;
    }

    public void setTimeLeft(String timeLeft) {
        this.timeLeft = timeLeft;
    }

    public String getView() {
        return view;
    }

    public void setView(String view) {
        this.view = view;
    }
    
    public int getNumber() {
        return number;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public String getType() {
        return type;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }

    public void setType(String type) {
        this.type = type;
    }
    public void setCurrentOwner(String owner){ 
        this.currentOwner = owner;
    }
    public String getCurrentOwner() {
        return this.currentOwner;
    }
}
