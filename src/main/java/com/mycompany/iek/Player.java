/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.iek;

import java.util.Date;

/**
 *
 * @author Tep-G
 */
public class Player {
    

    private String  firstname;
    private String  lastname;
    private Date    birthDate;
    
    

public Player (String f, String l){
         this.firstname=f;
         this.lastname=f;}

public void printStats(){
    System.out.println("First Name: " + firstname);
    System.out.println("Last Name: " + firstname);
    System.out.println("Birth Date: " + birthDate);
}
       public String toString(){
         return "First Name: "+firstname+"Last Name: "+lastname+
                 ",Birth Date:"+birthDate;}  
    
    
    

         
}