package com.datademo.bean;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@ManagedBean
@ViewScoped
public class UsersBean implements Serializable {

    private List<User> list;
    private User newUser;
    
    public UsersBean() {
            list = new ArrayList<>();
        list.add(new User("1","John", "Doe", 25,"M", "john.doe@example.com", "password123", "1234567890"));
        list.add(new User("2","Jane", "Doe", 32,"M", "jane.doe@example.com", "securepass", "9876543210"));
        list.add(new User("3","Diyana", "Doe", 34,"F", "diyana.doe@example.com", "dia123", "7657483397"));
        list.add(new User("4","Rahul", "Doe", 35,"M", "rahul.doe@example.com", "rahul123", "0978685743"));
        list.add(new User("5","Rajesh", "Doe", 28,"M", "rajesh.doe@example.com", "rajesh123", "2345097634"));
        list.add(new User("6","Joseph", "Doe", 29,"M", "joseph.doe@example.com", "joseph123", "9021344459"));
        list.add(new User("7","Ram", "Doe", 26,"M", "ram.doe@example.com", "ram123", "0978215423"));
        newUser = new User();
    }
     public User getNewUser() {
        return newUser;
    }

    public void setNewUser(User newUser) {
        this.newUser = newUser;
    }
    public void addUser(String id, String firstName, String lastName, int age, String gender, String emailID, String password, String mobileNumber) {
        User newUser = new User(id, firstName, lastName, age, gender, emailID, password, mobileNumber);
        list.add(newUser);
        newUser = new User();
        
    }

    public void updateUser(User existingUser, String firstName, String lastName, int age, String gender, String emailID, String password, String mobileNumber) {
        existingUser.setFirstName(firstName);
        existingUser.setLastName(lastName);
        existingUser.setAge(age);
        existingUser.setGender(gender);
        existingUser.setEmailID(emailID);
        existingUser.setPassword(password);
        existingUser.setMobilenumber(mobileNumber);
        newUser = new User();
        // No ID to update
    }
    public void editUser(User editedUser) {
    // Find the index of the user in the list
    int index = list.indexOf(editedUser);

    if (index != -1) {
        // Update the user at the found index with the editedUser
        list.set(index, editedUser);
    }
}

    public void deleteUser(User userToDelete) {
        list.remove(userToDelete);
        newUser = new User();
    }

    public List<User> getList() {
        return list;
    }

    public void setList(List<User> list) {
        this.list = list;
    }
    // Getters and setters for list
    
    public List<User> getUsers() {
        return list;
    }
    
    public List<User> getUsers(int size) {

        if (size > list.size()) {
            Random rand = new Random();

            List<User> randomList = new ArrayList<>();
            for (int i = 0; i < size; i++) {
                int randomIndex = rand.nextInt(list.size());
                randomList.add(list.get(randomIndex));
            }

            return randomList;
        }

        else {
            return new ArrayList<>(list.subList(0, size));
        }

    }
    
}

