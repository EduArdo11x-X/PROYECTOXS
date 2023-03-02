/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Lenovo
 */
public class Persona {
    
    private String Cedula;
    private String Primer_nom;
    private String Segundo_Nom;
    private String Primer_Ape;
    private String Segundo_Ape;
    private String Calle_principal;
    private String Calle_Secundaria;
    private char Sexo;
    private int Edad;

    public Persona(String Cedula, String Primer_nom, String Segundo_Nom, String Primer_Ape, String Segundo_Ape, String Calle_principal, String Calle_Secundaria, char Sexo, int Edad) {
        this.Cedula = Cedula;
        this.Primer_nom = Primer_nom;
        this.Segundo_Nom = Segundo_Nom;
        this.Primer_Ape = Primer_Ape;
        this.Segundo_Ape = Segundo_Ape;
        this.Calle_principal = Calle_principal;
        this.Calle_Secundaria = Calle_Secundaria;
        this.Sexo = Sexo;
        this.Edad = Edad;
    }

    public Persona() {
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getPrimer_nom() {
        return Primer_nom;
    }

    public void setPrimer_nom(String Primer_nom) {
        this.Primer_nom = Primer_nom;
    }

    public String getSegundo_Nom() {
        return Segundo_Nom;
    }

    public void setSegundo_Nom(String Segundo_Nom) {
        this.Segundo_Nom = Segundo_Nom;
    }

    public String getPrimer_Ape() {
        return Primer_Ape;
    }

    public void setPrimer_Ape(String Primer_Ape) {
        this.Primer_Ape = Primer_Ape;
    }

    public String getSegundo_Ape() {
        return Segundo_Ape;
    }

    public void setSegundo_Ape(String Segundo_Ape) {
        this.Segundo_Ape = Segundo_Ape;
    }

    public String getCalle_principal() {
        return Calle_principal;
    }

    public void setCalle_principal(String Calle_principal) {
        this.Calle_principal = Calle_principal;
    }

    public String getCalle_Secundaria() {
        return Calle_Secundaria;
    }

    public void setCalle_Secundaria(String Calle_Secundaria) {
        this.Calle_Secundaria = Calle_Secundaria;
    }

    public char getSexo() {
        return Sexo;
    }

    public void setSexo(char Sexo) {
        this.Sexo = Sexo;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    @Override
    public String toString() {
        return "Persona{" + "Cedula=" + Cedula + ", Primer_nom=" + Primer_nom + ", Segundo_Nom=" + Segundo_Nom + ", Primer_Ape=" + Primer_Ape + ", Segundo_Ape=" + Segundo_Ape + ", Calle_principal=" + Calle_principal + ", Calle_Secundaria=" + Calle_Secundaria + ", Sexo=" + Sexo + ", Edad=" + Edad + '}';
    }
    
    

}