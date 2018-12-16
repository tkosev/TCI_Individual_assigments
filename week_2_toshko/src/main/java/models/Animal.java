package models;

public abstract class Animal {

    protected int id;
    protected int name;
    protected int age;
    protected int color;


    public int getId() {
        return id;
    }

    public int getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getColor() {
        return color;
    }
}
