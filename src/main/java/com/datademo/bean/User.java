/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.datademo.bean;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;



@ManagedBean
@SessionScoped
public class User implements Serializable  {
    private List<User> list;
    private String id;
    private String FirstName;
    private String LastName;
    private int age;
    private String gender;
    private String emailID;
    private String password;
    private String Mobilenumber;
    

    public User(String id,String FirstName, String LastName, int age,String gender, String emailID, String password, String String) {
        this.id= id;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.age = age;
        this.gender=gender;
        this.emailID = emailID;
        this.password = password;
        this.Mobilenumber = String;
    }

    public User() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    
    
    

    public String getMobilenumber() {
        return Mobilenumber;
    }

    
    
    public String getFirstName() {
        return FirstName;
    }

    public String getLastName() {
        return LastName;
    }

    public String getEmailID() {
        return emailID;
    }

    public int getAge() {
        return age;
    }

    public String getPassword() {
        return password;
    }

    

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmailID(String emailID) {
        this.emailID = emailID;
    }

    public void setFirstName(String FirstName) {
        this.FirstName = FirstName;
    }

    public void setLastName(String LastName) {
        this.LastName = LastName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setMobilenumber(String Mobilenumber) {
        this.Mobilenumber = Mobilenumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void addUser(String id,String firstName, String lastName, int age, String gender, String emailID, String password, String mobileNumber) {
        User newUser = new User(id,firstName, lastName, age, gender, emailID, password, mobileNumber);
        list.add(newUser);
    }

    public void updateUser(User existingUser, String id, String firstName, String lastName, int age, String gender, String emailID, String password, String mobileNumber) {
        existingUser.setId(id);
        existingUser.setFirstName(firstName);
        existingUser.setLastName(lastName);
        existingUser.setAge(age);
        existingUser.setGender(gender);
        existingUser.setEmailID(emailID);
        existingUser.setPassword(password);
        existingUser.setMobilenumber(mobileNumber);
        // No ID to update
    }

    public void deleteUser(User userToDelete) {
        list.remove(userToDelete);
    }

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }
    
}
