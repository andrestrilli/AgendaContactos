package com.example.agendacontactos;

import java.util.ArrayList;
import java.util.LinkedList;

public class Data {

    private static ArrayList<Contact> Contacts = new ArrayList<>();

    public static void Save(Contact c){
        Contacts.add(c);
    }

    public static ArrayList<Contact> Get() {
    return Contacts;
    }


    public static void Edit(Contact c, String id, String name, String lastName, String phone, String cellphone){

        c.setId(id);
        c.setName(name);
        c.setLastName(lastName);
        c.setPhone(phone);
        c.setCellphone(cellphone);

    }

    public static void Remove(Contact c){
        Contacts.remove(c);
    }


}
