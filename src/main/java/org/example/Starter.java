package org.example;

import java.util.HashSet;
import java.util.Set;

public class Starter {
    public static void main(String[] args) {

        Set<MuClass> set = new HashSet<>();
        System.out.println("1");
        set.add(new MuClass(11L, "name1"));
        System.out.println("2");
        set.add(new MuClass(12L, "name2"));
        System.out.println("3");
        set.add(new MuClass(13L, "name3"));
        System.out.println("4");
        set.add(new MuClass(14L, "name4"));

        System.out.println("SIZE:" + set.size());
    }
}
