package com.company;

import java.util.ArrayList;
import java.util.List;

public class Q02 {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(1);
        list.add(-2);
        list.add(3);
        list.add(-4);
        list.add(5);

        System.out.println(list);
        System.out.println(example(list));
    }

    public static Integer example(List<Integer> list1){
        Integer result=list1.stream().
                sorted().
                filter(t->list1.indexOf(t)>1)
                .map(t->t*t).reduce(0,(t,u)->t+u);
        return result;
    }
}
