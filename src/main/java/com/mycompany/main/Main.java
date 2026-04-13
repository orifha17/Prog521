/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.mycompany.main;
import java.util.Scanner;

/**
 *
 * @author Student
 */
public class Main {

 public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Login signIn = new Login();
       
        System.out.println("===Register===");
        
        System.out.println("Enter Username: ");
        String userName = input.nextLine();
        
        
        System.out.println("Enter Password: ");
        String password = input.nextLine();
        
         
        System.out.println("Enter phone number(+27): ");
        String cellNo = input.nextLine();
       
        String registerMessage = signIn.registerUser(userName, password,cellNo);
        System.out.println(registerMessage);
        
        System.out.println("===Login===");
        System.out.println("Enter Username: ");
        String userLogin = input.nextLine();
        
        
        System.out.println("Enter password: ");
        String loginPass = input.nextLine();
        
        boolean success = signIn.loginUser(userLogin,loginPass);
        String message = signIn.returnLoginStatus(success, "Orifha", "Muthige");
        System.out.println(message);
        
        input.close();
        
    }
    
}
