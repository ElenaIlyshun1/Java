/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.io.IOException;

/**
 *
 * @author ІлюшинОленаСергіївна
 */
public class OOP {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        Developer dev = new Developer("Den", "Rivne", "Sinior Java Developer", 25, 1000);
        Developer dev1 = new Developer("Ben", "Kyiv", "Sinior Java Developer", 25, 2000);
        dev1.CompareSalary(dev, dev1);
        //dev.GetDevelopInfo();
        //dev.SetCity("Kyiv");
        //System.out.println(dev.GetCity());
        //dev.GetDevelopInfo();
        //////////////////////
//         Developer[] devTeam = new Developer[3];
//        for (int i = 0; i < devTeam.length; i++){
//            devTeam[i] = new Developer();
//        }
//        for (int i = 0; i < devTeam.length; i++){
//            devTeam[i].GetDeveloperInfo();
//        }
        
    }
    
}
