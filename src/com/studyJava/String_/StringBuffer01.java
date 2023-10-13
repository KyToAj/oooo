package com.studyJava.String_;

/**
 * @author aj
 * @version 1.0
 */
public class StringBuffer01 {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        char char1 = '安';
        sb.append("my name is aj");
        System.out.println(sb);
        sb.insert(3,"last ");
        System.out.println(sb);
        sb.delete(16,18);
        System.out.println(sb);
        sb.replace(0,3,"your ");
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        StringBuffer sb2 = new StringBuffer(char1);
        System.out.println(sb2);
    }
}
