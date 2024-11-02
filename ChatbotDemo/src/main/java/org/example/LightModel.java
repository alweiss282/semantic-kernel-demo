package org.example;


public class LightModel {
    private int id;
    private String name;
    private boolean isOn;


    public LightModel(Integer id, String name, Boolean isOn) {
        this.id = id;
        this.name = name;
        this.isOn = isOn;
    }

    public Integer getId() {
        return this.id;
    }

    public void setId(int id) {
       this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsOn(boolean isOn) {
        this.isOn = isOn;
    }

    public boolean getIsOn() {
        return this.isOn;
    }
}
