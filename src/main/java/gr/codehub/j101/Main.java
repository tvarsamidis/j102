package gr.codehub.j101;


import java.io.File;

public class Main {
    public static void main(String[] args) throws Exception {
        Person p = new Person("thomas", 54);
        p.setAge(-833);
        System.out.println("Hello world!");
//        p = null;
//        System.gc();
    }
}