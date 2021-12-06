package Homework.education.storage;

import Homework.education.model.User;

public class UserStorage {
    private User[] users = new User[10];
    private int size;


    public void add(User user) {
        if (size == users.length) {
            extend();
        }
        users[size++] = user;
    }

    private void extend() {
        User[] tmp = new User[users.length + 10];
        System.arraycopy(users, 0, tmp, 0, size);
        users = tmp;
    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(users[i]);
        }
    }
    public User getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (users[i].getEmail().equals(email)) {
                return users[i];
            }
        }
        return null;
    }

    public User getByPassword(String password) {
        for (int i = 0; i < size; i++) {
            if (users[i].getPassword().equals(password)) {
                return users[i];
            }
        }
        return null;
    }}
