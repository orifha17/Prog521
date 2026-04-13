/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.main;

/**
 *
 * @author Student
 */
public class Login {
    private String userName;
    private String password;
    private String cellPhoneNumber;
    
    public boolean checkUserName(String userName){
        return userName.contains("_")&& userName.length()<=5;
    }
    public boolean checkPasswordComplexity(String password){
        return password.length() >= 8 &&password.matches(".*[A-Z].*") &&password.matches(".*[0-9].*") &&password.matches(".*[^a-zA-Z0-9].*");
    }
    public boolean checkCellPhoneNumber(String cellPhoneNumber){
        return cellPhoneNumber.matches("^\\+[0-9]{1,3}[0-9]{1,10}$");
    }
    
    public String registerUser(String userName, String password, String cellPhoneNumber){
        if(!checkUserName(userName)){
            return "Username is not correctly formatted. Please ensure that your username contains an underscore and is no more than five characters in length";
        }
        else if(!checkPasswordComplexity(password)){
            return "Password is not correctly formatted. Please ensure it contains a capital letter,number,special character and its atleast eight characters long";
        }
        else if(!checkCellPhoneNumber(cellPhoneNumber)){
            return "Cell phone incorrectly formatted or does not contain international code";
        }
        this.userName = userName;
        this.password = password;
        this.cellPhoneNumber = cellPhoneNumber;
        return "User successfully registered";
    }
    public boolean loginUser(String userName, String password){
        return this.userName.equals(userName)&&this.password.equals(password);
    }
    public String returnLoginStatus(boolean success,String firstName, String lastName){
        if(success){
            return "Welcome "+firstName+" "+ lastName+" it is great to see you again";
        }
        else{
            return "Username or password incorrect please try again";
        }
    }
}
