package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringJoiner;

public class StringArraysList implements StringList {

    private String[] array;
    private int COUNT = 0;

    public StringArraysList(int size) {
        this.array = new String[size];
    }

    // [0,1,2,3,4,5,6,7,8,9]

    @Override
    public String add(String item) {
        if(item==null) {
            throw new NullPointerException();
        }
        if(array.length-1 == COUNT) {
            grow();
        }

        array[COUNT] = item;
        COUNT++;

        return item;
    }

    @Override
    public String add(int index, String item) {
        chackIndex(index);if(index<0 || index>COUNT) {
            throw new ArrayIndexOutOfBoundsException();
        }
        System.arraycopy(array,index, array,index+1,COUNT-index);
        array[index] = item;
        COUNT++;
        return item;
    }

    @Override
    public String set(int index, String item) {
        chackIndex(index);
        array[index]=item;
        return item;
    }

    @Override
    public String remove(String item) {
        int index = indexOf(item);
        if(index==-1) {
            throw new ItemNotFoundException();
        }
        return remove(index);
    }

    @Override
    public String remove(int index) {
        chackIndex(index);
        String removed = array[index];
        if(index == COUNT-1) {
            array[index] = null;
        } else {
            System.arraycopy(array, index + 1, array, index, COUNT - index - 1);
        }
        COUNT--;
        return removed;
    }

    @Override
    public boolean contains(String item) {
        for (int i = 0; i < COUNT; i++) {
            if(item.equals(array[i])) {
                return true;
            }
        }
        return false;
        // return indexOf(item) != -1;
    }

    @Override
    public int indexOf(String item) {
        for (int i = 0; i < COUNT; i++) {
            if(array[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public int lastIndexOf(String item) {
        for (int i = COUNT; i > 0 ; i--) {
            if(array[i].equals(item)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public String get(int index) {
        chackIndex(index);
        return array[index];
    }

    @Override
    public boolean equals(StringList otherList) {
        if(size()!=otherList.size()) return false;
        for (int i = 0; i < size(); i++) {
            if(!get(i).equals(otherList.get(i))) {
                return false;
            }
        }
        return true;
    }

    @Override
    public int size() {
        return COUNT;
    }

    @Override
    public boolean isEmpty() {
        return COUNT==0;
    }

    @Override
    public void clear() {
        COUNT = 0;
    }

    @Override
    public String[] toArray() {
        return Arrays.copyOf(array, COUNT);
    }

    public void chackIndex(int index) {
        if(index<0 || index>=COUNT) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public void grow() {
        String[] newArray = new String[array.length*2];
        /*
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
         */

        // String[] newArray = Arrays.copyOf(array,array.length*2);

        System.arraycopy(array, 0, newArray, 0, array.length);
        this.array = newArray;
    }

    @Override
    public String toString() {
        StringJoiner joiner = new StringJoiner(" ", "[","]");
        for (int i = 0; i < COUNT; i++) {
            joiner.add(array[i]);
        }
        return joiner.toString();
    }
}
