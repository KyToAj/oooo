package com.studyJava.exception;

import java.util.Scanner;

/**
 * @author aj
 * @version 1.0
 */
public class CustomException {
    public static void main(String[] args) {
        int age = 22;
        if(!(age > 18 && age < 120)){
            throw new AgeException("年龄错误");
        }
    }
}
class AgeException extends RuntimeException{
    public AgeException(String message) {
        super(message);
    }
}

