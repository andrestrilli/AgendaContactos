package com.example.agendacontactos;

import android.content.Intent;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import java.util.ArrayList;

public class ContactDetail extends AppCompatActivity {

    private Intent In;
    private ArrayList<Contact> Contacts;
    private TextView Name, Phone, CellPhone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contact_detail);

        In = getIntent();
        Contacts = Data.Get();

        int Position = In.getIntExtra("position",0);

        Name = (TextView)findViewById(R.id.TxtContactName);
        Phone = (TextView)findViewById(R.id.TxtContactPhone);
        CellPhone = (TextView)findViewById(R.id.TxtContactCellPhone);

        loadContact(Contacts.get(Position));
    }

    private  void loadContact(Contact contact){
        Name.setText(contact.getName()+contact.getLastName());
        Phone.setText(contact.getPhone());
        CellPhone.setText(contact.getCellphone());
    }
}
