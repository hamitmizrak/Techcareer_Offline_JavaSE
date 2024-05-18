package com.accessmodifiersame;

public class Student {

    public String publicData="public";
    protected String protectedData="protected";
    private String privateData="private";
    String defaultData="default";

    public static void main(String[] args) {
        Student student=new Student();
        System.out.println(student.publicData);
        System.out.println(student.protectedData);
        System.out.println(student.privateData);
        System.out.println(student.defaultData);
    }
}
