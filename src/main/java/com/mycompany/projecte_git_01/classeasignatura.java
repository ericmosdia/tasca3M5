/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.projecte_git_01;

/**
 *
 * @author eric.mosdia.dam_insa
 */
public class classeasignatura {
  private final String nom;
private final int hores;
// Constructor
public classeasignatura (String nom, int hores)
{
this.nom = nom;
this.hores = hores;
}
// Mètode per saludar
public void asignatura() {
System.out.println("Assignatura"+ nom + "Dure" + hores);
}  
}
