package org.example;

import org.example.Integer.IntegerArrayList;
import org.example.Integer.IntegerList;
import org.example.String.StringArraysList;
import org.example.String.StringList;

import java.util.Arrays;

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
    /*    System.out.println(list);
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

     */


        IntegerList integerList = new IntegerArrayList(10);
        System.out.println(integerList.isEmpty());

        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        System.out.println(Arrays.toString(integerList.toArray()));

        integerList.remove(2);
        System.out.println(Arrays.toString(integerList.toArray()));

        integerList.remove(4);
        System.out.println(Arrays.toString(integerList.toArray()));

        integerList.set(0,88);
        System.out.println(Arrays.toString(integerList.toArray()));

        integerList.add(1,77);
        System.out.println(Arrays.toString(integerList.toArray()));

        integerList.add(77);
        System.out.println(Arrays.toString(integerList.toArray()));
        System.out.println(integerList.size());

        System.out.println(integerList.contains(77));
        System.out.println(integerList.contains(100));

        System.out.println(integerList.indexOf(77));
        System.out.println(integerList.lastIndexOf(77));

        IntegerList integerList1 = new IntegerArrayList(10);
        integerList1.add(88);
        integerList1.add(77);
        integerList1.add(2);
        integerList1.add(4);
        integerList1.add(5);
        integerList1.add(77);

        System.out.println(integerList.equals(integerList1));
        integerList.clear();
        System.out.println(Arrays.toString(integerList.toArray()));
    }
}