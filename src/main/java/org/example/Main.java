package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StringList list = new StringArraysList(5);
        System.out.println(list.isEmpty());
        list.add("5");
        list.add("2");
        list.add("1");
        list.add("3");
        list.add("4");
        list.add("6");
/*
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }

 */

        System.out.println(list);
        list.remove("3");
        System.out.println(list);
        list.remove(4);
        System.out.println(list);
        list.remove("5");
        System.out.println(list);

        list.set(1,"55");
        System.out.println(list);

        list.add(2,"44");
        System.out.println(list);
        list.add("55");
        System.out.println(list);
        System.out.println(list.size());

        System.out.println(list.contains("55"));
        System.out.println(list.contains("10000"));

        System.out.println(list.indexOf("55"));
        System.out.println(list.lastIndexOf("55"));

        StringList list2 = new StringArraysList(10);
        list2.add("2");
        list2.add("55");
        list2.add("44");
        list2.add("4");
        list2.add("55");
        System.out.println(list.equals(list2));

        System.out.println(Arrays.toString(list.toArray()));
        list.clear();
        System.out.println(Arrays.toString(list.toArray()));
    }
}