package sadanie2;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Sadanie2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Введите 3-х значное число");
        Scanner scanner = new Scanner(System.in);
        int userNum = scanner.nextInt();
        int num1 =userNum/100;
        int num2 = userNum%100/10;
        int num3 = userNum%10;
        int summa = num1+num2+num3;
        System.out.println("сумма этого числа:"+summa);
    }
    
}
