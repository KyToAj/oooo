package com.studyJava.Exercise_;

/**
 * @author aj
 * @version 1.0
 */
public class ExceptionEx {
    /**
     *
     * @param name
     * @param password
     * @param email
     * 输入用户名，密码，邮箱，如果信息录入正确，则提示注册成功，否则生成异常对象
     */
    public static void register(String name , String password, String email ){
            if(!(name.length() <= 4 && name.length() > 2)){
                throw new RuntimeException("用户名长度为  2 , 3 , 4");
            }
            if(!(password.length() == 6 && isDigital(password))){
                throw new RuntimeException("密码的长度为 6 , 并且全是数字");
            }
            if(ig(email)){
                throw new RuntimeException("邮箱中要包含 @ 和 . ，并且 @ 在 . 的前面");
            }
        System.out.println("注册成功");
    }
    public static boolean isDigital(String password){
        char c1[] = password.toCharArray();

        for (int i = 0; i < c1.length; i++) {
            if(c1[i] < '0' || c1[i] > '9'){
                return false;
            }
        }
        return true;
    }
    public static boolean ig(String email){
//        char c1[] = email.toCharArray();
//
//        for (int i = 0; i < c1.length; i++) {
//            if(c1[i]!= '@'&& c1[i] !=  '.' ){
//                return false;
//            }
//
//        }
//        return true;
        int i = email.indexOf('@');
        int j = email.indexOf('.');
        if(!(i > 0 && j > i )){
            return true;
        }else {
            return false;
        }
    }
    public static void main(String[] args) {
        try {
            register("ajj","121156","1213@136.com");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
