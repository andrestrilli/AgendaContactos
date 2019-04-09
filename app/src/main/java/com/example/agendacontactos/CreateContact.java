package com.example.agendacontactos;

import android.content.res.Resources;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.FirebaseApp;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.ArrayList;

public class CreateContact extends AppCompatActivity {
    private static int IdAut=0;
    private EditText Name, LastName, Phone, CellPhone;
    private Resources Resources;
    private ArrayList<Contact> contacts;
    private FirebaseDatabase database = FirebaseDatabase.getInstance();
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
        Id = (IdAut+"");
        NameV= Name.getText().toString();
        LastNameV = LastName.getText().toString();
        PhoneV = Phone.getText().toString();
        CellPhoneV = CellPhone.getText().toString();

        Contact C = new Contact(Id,NameV,LastNameV,PhoneV,CellPhoneV);
        C.SaveContact();
// Write a message to the database

       DatabaseReference myRef = database.getReference("Contactos");
       myRef.child(C.getId()).setValue(C);

        Toast.makeText(this,R.string.done,Toast.LENGTH_LONG).show();
        //incremento el ID;
        IdAut++;

    }


}
