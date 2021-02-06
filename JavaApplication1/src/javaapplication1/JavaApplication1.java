/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author xanun
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner cin = new Scanner(System.in);
        double java,cs,python,vb,web,avg;
        System.out.print("Enter Scores Java= ");
        java = cin.nextDouble();
        System.out.print("Enter Scores C#= ");
        cs = cin.nextDouble();
        System.out.print("Enter Scores Python= ");
        python = cin.nextDouble();
        System.out.print("Enter Scores VB= ");
        vb = cin.nextDouble();
        System.out.print("Enter Scores Web!= ");
        web = cin.nextDouble();
        
        
        avg = (java+python+vb+web) / 5;
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.println("==================================");
        System.out.println(" Average = " + df.format(avg));
                
        
        
        
    }
    
}
