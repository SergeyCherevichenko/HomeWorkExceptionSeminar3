package ru.usersave.homework;
public class Main {
    public static void main(String[] args) {
        try {
            SaveUser user = new SaveUser();
            user.saveUser();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}