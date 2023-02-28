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
public class Administrador {
    
private int Cedula;
    private String Tiulo;
    private String Correo_Electronico;
    private int Telefono;
    private String Especializacion;

    public Administrador(int Cedula, String Tiulo, String Correo_Electronico, int Telefono, String Especializacion) {
        this.Cedula = Cedula;
        this.Tiulo = Tiulo;
        this.Correo_Electronico = Correo_Electronico;
        this.Telefono = Telefono;
        this.Especializacion = Especializacion;
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
     * @return the Tiulo
     */
    public String getTiulo() {
        return Tiulo;
    }

    /**
     * @param Tiulo the Tiulo to set
     */
    public void setTiulo(String Tiulo) {
        this.Tiulo = Tiulo;
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
     * @return the Especializacion
     */
    public String getEspecializacion() {
        return Especializacion;
    }

    /**
     * @param Especializacion the Especializacion to set
     */
    public void setEspecializacion(String Especializacion) {
        this.Especializacion = Especializacion;
    }

    @Override
    public String toString() {
        return "Administrador{" + "Cedula=" + Cedula + ", Tiulo=" + Tiulo + ", Correo_Electronico=" + Correo_Electronico + ", Telefono=" + Telefono + ", Especializacion=" + Especializacion + '}';
    }

}

