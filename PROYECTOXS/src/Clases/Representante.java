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
public class Representante {
    
private int Cedula;
    private int Telefono;
    private String Correo_Electronico;
    private String Parentesco;

    public Representante(int Cedula, int Telefono, String Correo_Electronico, String Parentesco) {
        this.Cedula = Cedula;
        this.Telefono = Telefono;
        this.Correo_Electronico = Correo_Electronico;
        this.Parentesco = Parentesco;
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

    /**
     * @return the Telefono
     */
    public int getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    /**
     * @return the Correo_Electronico
     */
    public String getCorreo_Electronico() {
        return Correo_Electronico;
    }

    /**
     * @param Correo_Electronico the Correo_Electronico to set
     */
    public void setCorreo_Electronico(String Correo_Electronico) {
        this.Correo_Electronico = Correo_Electronico;
    }

    /**
     * @return the Parentesco
     */
    public String getParentesco() {
        return Parentesco;
    }

    /**
     * @param Parentesco the Parentesco to set
     */
    public void setParentesco(String Parentesco) {
        this.Parentesco = Parentesco;
    }

    @Override
    public String toString() {
        return "Representante{" + "Cedula=" + Cedula + ", Telefono=" + Telefono + ", Correo_Electronico=" + Correo_Electronico + ", Parentesco=" + Parentesco + '}';
    }
    
    
    
}

