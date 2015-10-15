/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin2.pkg7.prog;

import java.util.Scanner;

/**
 *
 * @author slagogonzalez
 */
public class Boletin27Prog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     float n,i,t;
        Scanner renta=new Scanner(System.in);
        System.out.println("n");
        n=renta.nextFloat();
        System.out.println("i");
        i=renta.nextFloat();
        System.out.println("t");
        t=renta.nextFloat();
        i=i/1200; 
        t=t*12;
        System.out.println("renda mensual="+(n*Math.pow(1+i, t)*i)/(Math.pow(1+i, t)-1));
    
    }
    
}
