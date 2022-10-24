package com.serenitydojo;

public abstract class Pet {
    private String name = "";
    private int age;

    public String getName() {
        return name;
    }

    /*
    getter
     */
    public int getAge() {
        return age;
    }
    /*
    setter
     */
    public void setName(String name) {
        this.setName(name);
    }
    public void setAge(int age) {
        this.setAge(age);
    }

    /*
    constructor
     */
    public Pet (String name,int age){
        this.name=name;
        this.age=age;
    }

    public abstract String play();
}
