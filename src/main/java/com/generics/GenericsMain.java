package com.generics;

public class GenericsMain {
    public static void main(String[] args) {
        GenericsData genericsData=new GenericsData();
        genericsData.setName("Hamit");
        System.out.println(genericsData.getName());

        GenericsData genericsData2=new GenericsData();
        genericsData2.setName("Hamit");
        // genericsData2.setSurname(true);
        // genericsData2.setSurname(44);
        // genericsData2.setSurname(44.16);
        genericsData2.setSurname("Mızrak");
        System.out.println(genericsData2);
        genericsData2.fullData(44);
    }
}
