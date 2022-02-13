package com.itheima.enetiy;


public class Hero {

    private long id;
    private String name;
    private double hp;
    private double armor;
    private long moveSpeed;
    private double damage;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getHp() {
        return hp;
    }

    public void setHp(double hp) {
        this.hp = hp;
    }


    public double getArmor() {
        return armor;
    }

    public void setArmor(double armor) {
        this.armor = armor;
    }


    public long getMoveSpeed() {
        return moveSpeed;
    }

    public void setMoveSpeed(long moveSpeed) {
        this.moveSpeed = moveSpeed;
    }


    public double getDamage() {
        return damage;
    }

    public void setDamage(double damage) {
        this.damage = damage;
    }


    @Override
    public String toString() {
        return "Hero{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", armor=" + armor +
                ", moveSpeed=" + moveSpeed +
                ", damage=" + damage +
                '}';
    }
}
