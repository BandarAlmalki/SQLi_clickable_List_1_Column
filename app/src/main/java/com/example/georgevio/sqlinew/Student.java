package com.example.georgevio.sqlinew;

public class Student {
    private String Name;
    private String Email;
    private String Phone;
    private String Street;

    public Student(String name, String email, String phone,String street) {
        Name = name;
        Email = email;
        Phone = phone;
        Street=street;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getEmail() {
        return Email;
    }

    public String getStreet() {
        return Street;
    }

    public void setStreet(String street) {
        Street = street;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }
}
