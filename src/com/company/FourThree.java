package com.company;

public class FourThree {
    public static void main(String[] args) {
Cat cat=new Cat();
cat.age=2;
cat.weight=2;
cat.strength=2;

Cat cat1=new Cat();
cat1.age=2;
cat1.weight=1;
cat1.strength=2;
        System.out.println(cat1.fight(cat));
    }
}

class Cat {
    public int age;
    public int weight;
    public int strength;

    public Cat() {
    }

    public boolean fight(Cat anotherCat) {
        int victory=0;
        int victoryOpponent=0;

    if (age<anotherCat.age) {
        victoryOpponent++; }
    else if(age>anotherCat.age)
        victory++;
    else {victory++;victoryOpponent++;}

    if (weight<anotherCat.weight) {
        victoryOpponent++; }
    else if(weight>anotherCat.weight)
        victory++;
    else {victory++;victoryOpponent++;}

    if(strength<anotherCat.strength){
        victoryOpponent++; }
    else if (strength>anotherCat.strength)
        victory++;
    else {victory++;victoryOpponent++;}


    if(victory<victoryOpponent) return false;
    else return true; }

    }


