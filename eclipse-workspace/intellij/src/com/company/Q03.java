package com.company;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Q03 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Alinin");
        list.add("Babasi");
        list.add("Alman");
        list.add("Arabasi");
        list.add("hediye");
        list.add("etti");

        //Her elamanin uzunlugunu yaz
        list.stream().sorted().forEach(t-> System.out.print(t+" = "+t.length()+", "));
        System.out.println("++++++++++++++++++++++++++++++++++");
        //elemanlari uzunluguna gore yaz
        list.stream().sorted(Comparator.comparing(t->t.length())).forEach(t-> System.out.println(t));
        System.out.println("++++++++++++++++++++++++++++++++++");
        //Son karekterlere gore
        list.stream().sorted(Comparator.comparing(t->t.charAt(t.length()-1)))
                .forEach(t-> System.out.println(t));
    }

    }

