package com.studyJava.String_;

/**
 * @author aj
 * @version 1.0
 */
public class String02 {
    String str = new String("aj");
    final char [] ch = {'a','j'};
    public void change(String str , char[] ch){
        str = "java";
        ch[0] = 'h';
    }
    public static void main(String[] args) {
        String02 string02 = new String02();
        string02.change(string02.str, string02.ch);
        System.out.println(string02.str);
        System.out.println(string02.ch);
    }
}

