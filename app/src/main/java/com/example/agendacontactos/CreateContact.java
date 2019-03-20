package com.example.agendacontactos;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class CreateContact extends AppCompatActivity {
    private EditText Name, LastName, Phone, CellPhone;
    private Resources Resources;
    private ArrayList<Contact> contacts;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.create_contact);

        Name= (EditText)findViewById(R.id.TxtName);
        LastName= (EditText)findViewById(R.id.TxtLastName);
        Phone= (EditText)findViewById(R.id.TxtPhone);
        CellPhone= (EditText)findViewById(R.id.TxtCellPhone);

        Resources = this.getResources();
        contacts = Data.Get();
    }

    public void Save(View view){
        String Id, NameV, LastNameV, PhoneV, CellPhoneV;
        Id = (contacts.size()+1)+"";
        NameV= Name.getText().toString();
        LastNameV = LastName.getText().toString();
        PhoneV = Phone.getText().toString();
        CellPhoneV = CellPhone.getText().toString();

        Contact C = new Contact(Id,NameV,LastNameV,PhoneV,CellPhoneV);
        C.SaveContact();
        Toast.makeText(this,R.string.done,Toast.LENGTH_LONG).show();

    }


}
