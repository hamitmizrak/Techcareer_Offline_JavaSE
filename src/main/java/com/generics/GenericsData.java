package com.generics;

// Generics Class
public class GenericsData <T> {
    // Data Types
    private String name;
    private T surname;// Generics Type

    // Constructor (Parametresiz)
    public  GenericsData(){

    }

    // Constructor (Parametreli)
    //  Generics Constructor
    public GenericsData(String name, T surname) {
        this.name = name;
        this.surname = surname;
    }

    // Generics Method
    public <T> void fullData(T data){
        System.out.println(data);
    }

    // GETTER AND SETTER
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public T getSurname() {
        return surname;
    }

    public void setSurname(T surname) {
        this.surname = surname;
    }

    //toString
    @Override
    public String toString() {
        return "GenericsData{" +
                "name='" + name + '\'' +
                ", surname=" + surname +
                '}';
    }
}
