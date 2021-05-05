package com.company;

public class FourOne {
        public static void main(String[] args) {
            Cats cat = new Cats();
            cat.setName("Жужик");
            System.out.println(cat.getName());
        }
    }

    class Cats {
        private String name = "безымянный кот";

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }
    }

