package ru.usersave.homework.userexception;

import java.io.IOException;

public class DataTimeNotCorrect extends IOException {
    public DataTimeNotCorrect(String message) {
        super(message);
    }
}
