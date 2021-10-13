package com;

import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s1=new Scanner(System.in);
        Customer[] cust=new Customer[2];
        String[] objJsn= new String[2];


        ArrayList<Customer> customerlist= new ArrayList<Customer>();

        for(int i=0;i<2;i++) {
            cust[i]=new Customer();
            System.out.println("Customer Name:");
            String Name = s1.next();
            cust[i].setCustName(Name);
            System.out.println("Customer Age: ");
            int age = (s1.nextInt());
            cust[i].setCustAge(age);
            //converting object to the arrayList
            customerlist.add(cust[i]);
        }

        //converting arrylist to jason
        Gson gson = new Gson();
        String cust_objToJson=gson.toJson(cust);
        System.out.println(cust_objToJson);




    }
}
