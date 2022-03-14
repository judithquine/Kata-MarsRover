package com.example.marsrover;

public class Rover {
    private Integer posX;
    private Integer posY;
    private String direction;

    public Rover(){

    }

    public Rover(Integer posX, Integer posY, String direction) {
        this.posX = posX;
        this.posY = posY;
        this.direction = direction;
    }

    public Integer getPosX() {
        return (posX);
    }

    public Integer getPosY() {
        return (posY);
    }


    public String getDirection() {
        return (direction);
    }

    public void setPosX(Integer posX) {
        this.posX = posX;
    }

    public void setPosY(Integer posY) {
        this.posY = posY;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    void roverSpinLeft(){
        switch (getDirection()) {
            case "L" -> setDirection("E");
            case "E" -> setDirection("S");
        }

}}
