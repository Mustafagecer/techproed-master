package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Q01 {
    public static void main(String[] args) {
        List<String> list=new ArrayList<>();
        list.add("Alinin");
        list.add("Babasi");
        list.add("Alman");
        list.add("Arabasi");
        list.add("hediyeetti");

            System.out.print(list.stream()
                    .filter(t->t.startsWith("A"))
                    .map(String::toUpperCase)
                    .collect(Collectors.toList()));
        }
    }

