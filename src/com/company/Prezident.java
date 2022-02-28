package com.company;

public class Prezident {
    private String name;
    private int age;
    private Kyrgyzstan goroda;

    public Prezident(String name, int age, Kyrgyzstan goroda) {
        this.name = name;
        this.age = age;
        this.goroda = goroda;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Kyrgyzstan getGoroda() {
        return goroda;
    }

    public void setGoroda(Kyrgyzstan goroda) {
        this.goroda = goroda;
    }

    @Override
    public String toString() {
        return "Prezident{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ",lovly goroda=" + goroda +
                '}';
    }
}
