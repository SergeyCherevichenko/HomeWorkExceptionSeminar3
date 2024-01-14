package ru.usersave.homework.userexception;

import java.io.IOException;

public class SexNotCorrect extends IOException {
    public SexNotCorrect(String message){
        super(message);
    }
}
