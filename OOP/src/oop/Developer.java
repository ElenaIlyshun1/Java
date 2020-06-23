/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author ІлюшинОленаСергіївна
 */
public class Developer {
    private String name;
    private String city;
    private String position;
    private int age;
    private int salary;
    private String[]skills = new String[5];
    
    public Developer(String name, String city, String position, int age, int salary){
        this.name = name;
        this.city = city;
        this.position = position;
        this.age = age;
        this.salary = salary;
        
    }
     public Developer() throws IOException{
      BufferedReader buffered=new BufferedReader(new InputStreamReader(System.in));
      System.out.print("Name: ");
      this.name=buffered.readLine();              
      System.out.print("City: ");
      this.city=buffered.readLine();             
      System.out.print("Position: ");
      this.position=buffered.readLine();            
      System.out.print("Salery: ");
      this.salary= Integer.parseInt(buffered.readLine());
      System.out.print("Age: ");
      this.age= Integer.parseInt(buffered.readLine());
    }
     public String[] GetSkills(){
         return this.skills;
     }
      public void SetSkills(String [] skills){
     this.skills = skills;
    }
    public void GetDeveloperInfo(){
        System.out.println("Name " + this.name + "\nCity " + this.city + "\nPosition " + this.position + "\nAge " + this.age + "\nSalary " + this.salary);
    }
    public String GetName(){
    return this.name;
    }
    
     public void SetName(String name){
     this.name = name;
    }
     public String GetCity(){
    return this.city;
    }
      public void SetCity(String city){
     this.city = city;
    }
      public String GetPosition(){
    return this.position;
    }
        public void SetPosition(String position){
     this.position = position;
    }
       public int GetAge(){
    return this.age;
    }
     public void SetAge(int age){
     this.age = age;
    }
        public int GetSalary(){
    return this.salary;
    }
         public void SetSalary(int salary){
     this.salary = salary;
    }
    public void CompareSalary(Developer one, Developer two){
        if (one.salary > two.salary)
        {
             System.out.println("Devops " + one.name + "has more salary" );
        }
        else if (one.salary < two.salary)
        {
             System.out.println("Devops " + two.name + "has more salary" );
        }
         else 
        {
             System.out.println("Devops has same salary" );
        }
    }
    
}
