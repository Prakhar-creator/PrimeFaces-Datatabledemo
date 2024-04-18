package com.datademo.bean;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;
import java.util.List;
import java.util.ArrayList;

@ManagedBean
@SessionScoped
public class ContextBean implements Serializable {
    private List<User> userList;
    private User selectedUser;

    public ContextBean() {
        userList = new ArrayList<>();
        userList.add(new User("1", "John", "Doe", 25, "M", "john.doe@example.com", "password123", "1234567890"));
        userList.add(new User("2", "Jane", "Doe", 32, "M", "jane.doe@example.com", "securepass", "9876543210"));
        userList.add(new User("3", "Diyana", "Doe", 34, "F", "diyana.doe@example.com", "dia123", "7657483397"));
        userList.add(new User("4", "Rahul", "Doe", 35, "M", "rahul.doe@example.com", "rahul123", "0978685743"));
        userList.add(new User("5", "Rajesh", "Doe", 28, "M", "rajesh.doe@example.com", "rajesh123", "2345097634"));
        userList.add(new User("6", "Joseph", "Doe", 29, "M", "joseph.doe@example.com", "joseph123", "9021344459"));
        userList.add(new User("7", "Ram", "Doe", 26, "M", "ram.doe@example.com", "ram123", "0978215423"));
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public List<User> getUserList() {
        return userList;
    }

    public User getSelectedUser() {
        return selectedUser;
    }

    public void setSelectedUser(User selectedUser) {
        this.selectedUser = selectedUser;
    }

    public void deleteUser() {
        userList.remove(selectedUser);
        selectedUser = null;
    }
    public void viewUser(){
        
    }
}
