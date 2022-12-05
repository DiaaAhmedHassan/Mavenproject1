/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mavenproject1;


import static java.lang.Math.*;
import java.util.Scanner;






/**
 *
 * @author DELL
 */
public class Mavenproject1 {

    public static void main(String[] args) {
        
        //grades
        //geting inputs
        System.out.println("Enter the 3 exams scores");
        Scanner ex_one,ex_two,ex_three;
        int exam1,exam2,exam3;
        ex_one = new Scanner(System.in);
        ex_two = new Scanner(System.in);
        ex_three = new Scanner(System.in);
        
        exam1 = ex_one.nextInt();
        exam2 = ex_two.nextInt();
        exam3 = ex_three.nextInt();
        
        int score = exam1+exam2+exam3;
        System.out.println("Your score is: "+score);
        
        //take a decisione
        if (score >= 75){
            System.out.println("Passed");
        }else{
            System.out.println("Fail");
        }
       
       
       
        
        
        
    }
}
