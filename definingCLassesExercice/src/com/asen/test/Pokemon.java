package com.asen.test;

public class Pokemon {
    private String name;
    private  String element;
    private  int heath;
    public Pokemon(String name, String element, int heath) {
        this.name = name;
        this.element = element;
        this.heath = heath;
    }
    public void hitPOkemon(){
        this.heath-=10;
    }
    public String getName() {
        return name;
    }
    public String getElement() {
        return element;
    }
    public int getHeath() {
        return heath;
    }
}
