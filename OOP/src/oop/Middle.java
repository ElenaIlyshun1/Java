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
public class Middle extends Developer {
    private String fixlevel;
    private String writeCode;
    private String englishlevel;
    private int experience ;
    
    
    public Middle(String name, String city, String position, int age, int salary, String fixlevel, String writeCode,String englishlevel,int experience){
        super(name, city, position, age, salary);
        this.fixlevel = fixlevel;
        this.writeCode = writeCode;
        this.englishlevel = englishlevel;
        this.experience = experience;
        
    }
     public void GetDeveloperInfo(){
        System.out.println("Name " + this.name + "\nCity " + this.city + "\nPosition " + this.position + "\nAge " + this.age + "\nSalary " + this.salary + "\nfixlevel " + this.fixlevel + "\nwriteCode " + this.writeCode + "\nenglishlevel " + this.englishlevel  + "\nexperience " +
        this.experience );
    }
    
}
