package com.shamim;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();

        list1.add("abc");
        list1.add("xyz");
        list1.add("pqr");
        System.out.println("first list :"+list1);

        list2.add("kokhogo");
        list2.add("cochojo");
        list2.add("tothodo");

        System.out.println("second list :"+list2);

        Collections.copy(list1,list2);

        System.out.println("updated first list :"+list1);
	// write your code here
    }
}
