package com.studyJava.Exercise_;

/**
 * @author aj
 * @version 1.0
 */
public class StringEx2 {
    public static void main(String[] args) {
        Str("Zhu Shi Ji");
    }
    public static void Str(String name){
        String[] str = name.split(" ");
        String s = str[1].toUpperCase();
        char[] c = s.toCharArray();
        System.out.println(str[2] + ", " + str[0] +" ." +  c[0]   );
    }
}
