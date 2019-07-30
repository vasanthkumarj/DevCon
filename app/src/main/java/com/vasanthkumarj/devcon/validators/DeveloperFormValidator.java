package com.vasanthkumarj.devcon.validators;

import android.content.Context;
import android.text.TextUtils;
import android.widget.EditText;


import com.vasanthkumarj.devcon.models.DeveloperModel;

public class DeveloperFormValidator {

    public void validateForLetters(EditText input)
    {
        if(TextUtils.isEmpty(input.getText()))
        {
            input.setError("Fill this field");
        }
        else {
              if(!input.getText().toString().matches("^[a-zA-z]*$")) {
                input.setError("Only letters");
             }
        }


    }


    public void validateMail(EditText emailID)
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
