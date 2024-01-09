/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.conversio;

import java.util.Scanner;

/**
 *
 * @author nil
 */
public class Conversio {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean bucle =true;
        while(bucle){
        System.out.println("Introdueix (1) €→£ (2) £→€ (3)Sortir");
        int valor = sc.nextInt();
        if(valor == 1){
        System.out.println("Introdueix en €");
        int valor_euros = sc.nextInt();
        double tipus_de_canvi = 0.86;
        System.out.println(valor_euros + " euros (€) actualment equivalen a" + (valor_euros * tipus_de_canvi) + " lliures esterlines (£)");
        }else if(valor == 2){
        System.out.println("Introdueix en €");
        int valor_euros = sc.nextInt();
        double tipus_de_canvi = 1.16;
        System.out.println(valor_euros + " lliures esterlines (£) actualment equivalen a" + (valor_euros * tipus_de_canvi) + " euros (€)");
        } else if(valor == 3)
            bucle =false;
        }
        }
}
