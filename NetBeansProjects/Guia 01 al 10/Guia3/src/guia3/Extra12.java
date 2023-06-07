/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia3;

import java.util.Scanner;

/**
 *
 * @author jrv11
 */
public class Extra12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /**
         *
         */
        Scanner leer = new Scanner(System.in);
        int num1, num2, num3;

        num1 = (int) (Math.random() * 9);
        num2 = (int) (Math.random() * 9);
        num3 = (int) (Math.random() * 9);
        System.out.println(num1 + "-" + num2 + "-" + num3);
        String a = Integer.toString(num1);
        String b = Integer.toString(num2);
        String c = Integer.toString(num3);
        if (a.equals("3")) {

            a = "E";

        }
        if (b.equals("3")) {

            b = "E";

        }
        if (c.equals("3")) {

            c = "E";

        }
        System.out.println(a + "-" + b + "-" + c);
    }
    
    

}
