package com.vasanthkumarj.devcon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.vasanthkumarj.devcon.models.DeveloperModel;
import com.vasanthkumarj.devcon.validators.DeveloperFormValidator;

public class MainActivity extends AppCompatActivity {

    private EditText firstName;
    private EditText lastName;
    private EditText email;
    private EditText position;
    private EditText company;
    private EditText city;
    private EditText country;
    private DeveloperModel developerModel;
    private DeveloperFormValidator developerFormValidator;
    private Boolean validationFlag=true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstName=findViewById(R.id.firstName);
        lastName=findViewById(R.id.lastName);
        email=findViewById(R.id.emailID);
        position=findViewById(R.id.position);
        company=findViewById(R.id.company);
        city=findViewById(R.id.city);
        country=findViewById(R.id.country);
        developerFormValidator=new DeveloperFormValidator();
    }

    public void createAccount(View view) {

        developerModel=new DeveloperModel(firstName,lastName,email,
                                          position,company,city,country);

        getDeveloperFormValidator().validate(developerModel,getApplicationContext());


    }

    public DeveloperFormValidator getDeveloperFormValidator() {
        return developerFormValidator;
    }

    public void setDeveloperFormValidator(DeveloperFormValidator developerFormValidator) {
        this.developerFormValidator = developerFormValidator;
    }
}
