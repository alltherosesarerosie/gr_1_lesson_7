package com.company;

public class Medic extends Hero{
    private int healPoints = 100;
    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность CRITICAL DAMAGE");
    }

    @Override
    public void HavingSuperAbility() {
    }

    public void  increaseExperience(){
        healPoints = healPoints+ healPoints*10/100;
        System.out.println("Now medic's experience is "+healPoints);
    }
}
