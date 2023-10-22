package com.studyJava.Exercise_;

/**
 * @author aj
 * @version 1.0
 */
public class StringEx {
    //将字符串中指定部分进行反转   “abcdef”
    //编写方法   public static String reverse1(String str , int start , int end)
    public static String reverse(String str , int start , int end){
        if(str != null && start >= 0 && end >= start && end <= str.length()){
            throw new RuntimeException("参数不正确");
        }
        String str1 = str.substring(start,end);
        StringBuilder strB = new StringBuilder(str);
        StringBuilder str3 = new StringBuilder(str1);
        strB.delete(start,end);
        str3.reverse();
        strB.insert(start,str3);
        return strB.toString();

    }
    public static String reverse1(String str , int start , int end){
        char c1[] = str.toCharArray();
        char t = ' ';
        for(int i = start , j = end ; i < j ; i ++ , j -- ){
            t = c1[i];
            c1[i] = c1[j];
            c1[j] = t;
        }
        return new String(c1);
    }
    public static void main(String[] args) {
        System.out.println(reverse("abcdef",1,5));
        System.out.println(reverse1("abcdef",1,4));
    }
}
