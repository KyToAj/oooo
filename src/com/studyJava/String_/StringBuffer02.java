package com.studyJava.String_;

/**
 * @author aj
 * @version 1.0
 */
public class StringBuffer02 {
    public static void main(String[] args) {
        String str = null;
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(str);
        System.out.println(stringBuffer.length());//4
        System.out.println(stringBuffer);//null
        StringBuffer stringBuffer1 = new StringBuffer(stringBuffer);
        System.out.println(stringBuffer1);//null

    }
}
