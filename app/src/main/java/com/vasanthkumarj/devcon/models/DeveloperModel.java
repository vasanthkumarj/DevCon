package com.vasanthkumarj.devcon.models;


import android.widget.EditText;

public class DeveloperModel {
    private EditText firstName;
    private EditText lastName;
    private EditText email;
    private EditText position;
    private EditText company;
    private EditText city;
    private EditText country;


    public DeveloperModel() {
    }

    public DeveloperModel(EditText firstName, EditText lastName, EditText email, EditText position, EditText company, EditText city, EditText country) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.position = position;
        this.company = company;
        this.city = city;
        this.country = country;
    }

    public EditText getFirstName() {
        return firstName;
    }

    public void setFirstName(EditText firstName) {
        this.firstName = firstName;
    }

    public EditText getLastName() {
        return lastName;
    }

    public void setLastName(EditText lastName) {
        this.lastName = lastName;
    }

    public EditText getEmail() {
        return email;
    }

    public void setEmail(EditText email) {
        this.email = email;
    }

    public EditText getPosition() {
        return position;
    }

    public void setPosition(EditText position) {
        this.position = position;
    }

    public EditText getCompany() {
        return company;
    }

    public void setCompany(EditText company) {
        this.company = company;
    }

    public EditText getCity() {
        return city;
    }

    public void setCity(EditText city) {
        this.city = city;
    }

    public EditText getCountry() {
        return country;
    }

    public void setCountry(EditText country) {
        this.country = country;
    }
}
