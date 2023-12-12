/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projecte_git_01;

/**
 *
 * @author eric.mosdia.dam_insa
 */
public class Class_Persona {
private final String nom;
private final int edat;
// Constructor
public Class_Persona (String nom, int edat)
{
this.nom = nom;
this.edat = edat;
}
// Mètode per saludar
public void saludar() {
System.out.println("Hola, soc en "+ nom + "i tinc " + edat + "anys.");
}
}
// Altres mètodes o atributs poden ser afegits aquí.

