package com.studyJava.Exercise_;

/**
 * @author aj
 * @version 1.0
 */
public class StringEx3 {
    public static void main(String[] args) {
        PanDuan("1d53as21das65dASa53s1A536S15D1AS35D13sd51A53Da1d35A1D3");
    }
    /*
    判断大写字母、小写字母、数字  个数
     */
    public static void PanDuan(String str){
        char []c = str.toCharArray();
        int Big = 0;
        int Small = 0;
        int Digital = 0;
        for (int i = 0; i < c.length; i++) {
            if(c[i] >= 65 && c[i] <= 90){
                Big++;
            } else if (c[i] >= 97 && c[i] <= 122) {
                Small++;
            } else if (c[i] >= 48 && c[i] <= 57) {
                Digital++;
            }
        }
        System.out.println("大学字母：" + Big + ",小写字母：" + Small + ",数字：" + Digital);
    }
}
