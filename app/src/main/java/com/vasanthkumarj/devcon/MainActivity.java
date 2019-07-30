package com.vasanthkumarj.devcon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
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

        firstName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                getDeveloperFormValidator().validateForLetters(firstName);
            }
        });

        lastName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                getDeveloperFormValidator().validateForLetters(lastName);
            }
        });

        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                getDeveloperFormValidator().validateMail(email);
            }
        });

        position.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                 getDeveloperFormValidator().validateForLetters(position);
            }
        });

        company.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                  getDeveloperFormValidator().validateForLetters(company);
            }
        });

        city.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                  getDeveloperFormValidator().validateForLetters(city);
            }
        });

        country.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void afterTextChanged(Editable editable) {
                  getDeveloperFormValidator().validateForLetters(country);
            }
        });


    }

    public void createAccount(View view) {

        developerModel=new DeveloperModel(firstName,lastName,email,
                                          position,company,city,country);


    }



    public DeveloperFormValidator getDeveloperFormValidator() {
        return developerFormValidator;
    }

    public void setDeveloperFormValidator(DeveloperFormValidator developerFormValidator) {
        this.developerFormValidator = developerFormValidator;
    }


}
