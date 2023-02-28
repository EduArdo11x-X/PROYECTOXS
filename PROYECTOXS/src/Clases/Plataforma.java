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
public class Plataforma {
    
private int Codigo_Registro;
    private int Cedula;

    public Plataforma(int Codigo_Registro, int Cedula) {
        this.Codigo_Registro = Codigo_Registro;
        this.Cedula = Cedula;
    }

    /**
     * @return the Codigo_Registro
     */
    public int getCodigo_Registro() {
        return Codigo_Registro;
    }

    /**
     * @param Codigo_Registro the Codigo_Registro to set
     */
    public void setCodigo_Registro(int Codigo_Registro) {
        this.Codigo_Registro = Codigo_Registro;
    }

    /**
     * @return the Cedula
     */
    public int getCedula() {
        return Cedula;
    }

    /**
     * @param Cedula the Cedula to set
     */
    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }

    @Override
    public String toString() {
        return "Plataforma{" + "Codigo_Registro=" + Codigo_Registro + ", Cedula=" + Cedula + '}';
    }
    
    
    
}

