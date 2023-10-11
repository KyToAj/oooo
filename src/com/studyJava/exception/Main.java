package com.studyJava.exception;

/**
 * @author aj
 * @version 1.0
 */

// 自定义异常类
class CustomException02 extends Exception {
    public CustomException02(String message) {
        super(message);
    }

}

// 示例程序
public class Main {
    public static void main(String[] args) {
        try {
            performCustomOperation();
        } catch (CustomException02 e) {
            System.out.println("捕获到自定义异常: " + e.getMessage());
        }
    }

    public static void performCustomOperation() throws CustomException02 {
        int value = 10;
        if (value == 10) {
            throw new CustomException02("自定义异常属性值为： 10.");
        }
    }
}

