package com.company;

public class ListofAll {
    public static void main(String[] args) {

        try {

            ListofAll list = (ListofAll) java.util.List.of(1, 2, 3);

            System.out.println("List : " + list.toString());

            System.out.println("Trying to modify the list");
            list.set();
        } catch (Exception e) {
            System.out.println("Exception : " + e);
        }


    }

    private void set() {

    }
}