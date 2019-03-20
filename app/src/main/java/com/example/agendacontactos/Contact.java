package com.example.agendacontactos;

public class Contact {

    private String Id;
    private String Name;
    private String LastName;
    private String Phone;
    private String Cellphone;

    public Contact(String id, String name, String lastName, String phone, String cellphone) {
        Id = id;
        Name = name;
        LastName = lastName;
        Phone = phone;
        Cellphone = cellphone;
    }

    public String getId() {
        return Id;
    }

    public void setId(String id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getCellphone() {
        return Cellphone;
    }

    public void setCellphone(String cellphone) {
        Cellphone = cellphone;
    }

    public void SaveContact(){
        Data.Save(this);
    }

    public void RemoveContact(){
        Data.Remove(this);
    }

    //public void EditContact(){
    //   Data.Edit(this);
    //}





}
