package com.quintin;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

import com.quintin.calculator.Operation;
import com.quintin.calculator.OperationFactory;

public class mian {

    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);  
        Double numberA = getNumberFromSystemIN(scanner, "A");
        Operation operation = null;
        String operatorStr = "";
        while (operation == null) {
            System.out.print("请输入合法的操作符");
            operatorStr = scanner.nextLine();
            operation = OperationFactory.getOperation(operatorStr);
            if (operation == null) {
                System.out.println("输入的操作符非法："+operatorStr);
                System.out.println("请输入合法的操作符");
                continue;
            }
        }
        Double numberB = getNumberFromSystemIN(scanner, "B");
        operation.setNumberA(numberA);
        operation.setNumberB(numberB);
        System.out.println(numberA + operatorStr + numberB + "=" + operation.getResult());
    }
    
    private static Double getNumberFromSystemIN(Scanner scanner, String numberName) {
        Double number = null;
        System.out.print("请输入的数字"+ numberName + ":");
        while (number == null) {
            String numberAStr = "";
                try {
                    numberAStr = scanner.nextLine();
                    number = Double.valueOf(numberAStr);
                } catch (Exception e) {
                    System.out.println("输入的数字"+ numberName +"为非法字符:" + numberAStr);
                    System.out.print("请重新输入的数字"+ numberName + ":");
                    continue;
                }
            System.out.println("输入的数字"+ numberName +"为"+number);
        }
        return number;
    }

}
