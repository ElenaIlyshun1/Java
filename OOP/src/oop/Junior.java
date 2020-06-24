/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author ІлюшинОленаСергіївна
 */
public class Junior extends Developer {
    private String fixlevel;
    private String writeCode;
    
    public Junior(String name, String city, String position, int age, int salary, String fixlevel, String writeCode){
        super(name, city, position, age, salary);
        this.fixlevel = fixlevel;
        this.writeCode = writeCode;
        
    }

  
     public void GetDeveloperInfo(){
        System.out.println("Name " + this.name + "\nCity " + this.city + "\nPosition " + this.position + "\nAge " + this.age + "\nSalary " + this.salary + "\nfixlevel " + this.fixlevel + "\nwriteCode " + this.writeCode  );
    }
    
}
