package com.example.contact;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "contacts")
public class Contact {

    @Id
    private String contactId;
    private String firstName;
    private String lastName;
    private String email;
    private String secondaryEmail;
    private String accountName;
    private String contactOwner;
    private String x;
    private String facebook;
    private String phone;
    private String mobile;
    private String type;
    private String title;

    // Constructors
    public Contact() {}

    public Contact(String contactId, String firstName, String lastName, String email, String secondaryEmail, 
                   String accountName, String contactOwner, String x, String facebook, String phone, 
                   String mobile, String type, String title) {
        this.contactId = contactId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.secondaryEmail = secondaryEmail;
        this.accountName = accountName;
        this.contactOwner = contactOwner;
        this.x = x;
        this.facebook = facebook;
        this.phone = phone;
        this.mobile = mobile;
        this.type = type;
        this.title = title;
    }

    // Getters and Setters
    public String getContactId() {
        return contactId;
    }

    public void setContactId(String contactId) {
        this.contactId = contactId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSecondaryEmail() {
        return secondaryEmail;
    }

    public void setSecondaryEmail(String secondaryEmail) {
        this.secondaryEmail = secondaryEmail;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getContactOwner() {
        return contactOwner;
    }

    public void setContactOwner(String contactOwner) {
        this.contactOwner = contactOwner;
    }

    public String getX() {
        return x;
    }

    public void setX(String x) {
        this.x = x;
    }

    public String getFacebook() {
        return facebook;
    }

    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
