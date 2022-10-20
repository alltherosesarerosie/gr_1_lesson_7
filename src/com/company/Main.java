package com.company;

public class Main {

    public static void main(String[] args) {
        Hero [] heroes = {new Warrior(),new Medic(),new Magic()};

        for (Hero hero:heroes) {
            hero.applySuperAbility();
        }

        System.out.println("-----------------    -----------------");

        for (Hero hero:heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic){
                ((Medic)hero).increaseExperience();
                ((Medic)hero).increaseExperience();
            }
        }


    }
}
