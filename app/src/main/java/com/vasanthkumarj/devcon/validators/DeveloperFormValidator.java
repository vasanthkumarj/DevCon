package com.vasanthkumarj.devcon.validators;

import android.content.Context;
import android.text.TextUtils;
import android.widget.EditText;


import com.vasanthkumarj.devcon.models.DeveloperModel;

public class DeveloperFormValidator {

    public void validate(DeveloperModel developerModel, Context context)
    {
        validateForLetters(developerModel.getFirstName(),
                           developerModel.getLastName(),
                           developerModel.getPosition(),
                           developerModel.getCompany(),
                           developerModel.getCity(),
                           developerModel.getCountry());
        validateMail(developerModel.getEmail());


    }

    private void validateForLetters(EditText firstName, EditText lastName,EditText position,
                                    EditText company,EditText city,EditText country)
    {
        if(TextUtils.isEmpty(firstName.getText()))
        {
            firstName.setError("Fill this field");
        }
        else {
              if(!firstName.getText().toString().matches("^[a-zA-z]*$")) {
                firstName.setError("Only letters");
             }
        }

        if(TextUtils.isEmpty(lastName.getText()))
        {
            lastName.setError("Fill this field");
        }
        else {
            if(!lastName.getText().toString().matches("^[a-zA-z]*$")) {
                lastName.setError("Only letters");
            }
        }

        if(TextUtils.isEmpty(position.getText()))
        {
            position.setError("Fill this field");
        }
        else {
            if(!position.getText().toString().matches("^[a-zA-z]*$")) {
                position.setError("Only letters");
            }
        }

        if(TextUtils.isEmpty(company.getText()))
        {
            company.setError("Fill this field");
        }
        else {
            if(!company.getText().toString().matches("^[a-zA-z]*$")) {
                company.setError("Only letters");
            }
        }

        if(TextUtils.isEmpty(city.getText()))
        {
            city.setError("Fill this field");
        }
        else {
            if(!city.getText().toString().matches("^[a-zA-z]*$")) {
                city.setError("Only letters");
            }
        }

        if(TextUtils.isEmpty(country.getText()))
        {
            country.setError("Fill this field");
        }
        else {
            if(!country.getText().toString().matches("^[a-zA-z]*$")) {
                country.setError("Only letters");
            }
        }

    }


    private void validateMail(EditText emailID)
    {
        if(TextUtils.isEmpty(emailID.getText()))
        {
            emailID.setError("Fill this field");
        }
        else {
            String emailRegex = "^[a-zA-Z0-9_+&*-]+(?:\\."+
                    "[a-zA-Z0-9_+&*-]+)*@" +
                    "(?:[a-zA-Z0-9-]+\\.)+[a-z" +
                    "A-Z]{2,7}$";
            if(!emailID.getText().toString().matches(emailRegex))
            {
                emailID.setError("Invalid");
            }
        }
    }
}
