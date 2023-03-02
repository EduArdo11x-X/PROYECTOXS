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
public class Representante extends Persona {
    
    private int Telefono_repre;
    private String Correo_Electronico_repre;
    private String Parentesco_repre;

    public Representante(int Telefono_repre, String Correo_Electronico_repre, String Parentesco_repre, String Cedula, String Primer_nom, String Segundo_Nom, String Primer_Ape, String Segundo_Ape, String Calle_principal, String Calle_Secundaria, char Sexo, int Edad) {
        super(Cedula, Primer_nom, Segundo_Nom, Primer_Ape, Segundo_Ape, Calle_principal, Calle_Secundaria, Sexo, Edad);
        this.Telefono_repre = Telefono_repre;
        this.Correo_Electronico_repre = Correo_Electronico_repre;
        this.Parentesco_repre = Parentesco_repre;
    }

    public Representante() {
        super();
    }

    public int getTelefono_repre() {
        return Telefono_repre;
    }

    public void setTelefono_repre(int Telefono_repre) {
        this.Telefono_repre = Telefono_repre;
    }

    public String getCorreo_Electronico_repre() {
        return Correo_Electronico_repre;
    }

    public void setCorreo_Electronico_repre(String Correo_Electronico_repre) {
        this.Correo_Electronico_repre = Correo_Electronico_repre;
    }

    public String getParentesco_repre() {
        return Parentesco_repre;
    }

    public void setParentesco_repre(String Parentesco_repre) {
        this.Parentesco_repre = Parentesco_repre;
    }

    @Override
    public String toString() {
        return "Representante{" + "Telefono_repre=" + Telefono_repre + ", Correo_Electronico_repre=" + Correo_Electronico_repre + ", Parentesco_repre=" + Parentesco_repre + '}';
    }
    
    
    

    
    
    
}

