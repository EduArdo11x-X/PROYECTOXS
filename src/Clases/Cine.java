/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author user
 */
public class Cine {
    
    private String Id_Cine;
    private String Nombre_cine;
    private String Direccion;
    private String Telefono;
    private String Sucursal_num;

    public Cine(String Id_Cine, String Nombre_cine, String Direccion, String Telefono, String Sucursal_num) {
        this.Id_Cine = Id_Cine;
        this.Nombre_cine = Nombre_cine;
        this.Direccion = Direccion;
        this.Telefono = Telefono;
        this.Sucursal_num = Sucursal_num;
    }

    public Cine() {
    }

    public String getId_Cine() {
        return Id_Cine;
    }

    public void setId_Cine(String Id_Cine) {
        this.Id_Cine = Id_Cine;
    }

    public String getNombre_cine() {
        return Nombre_cine;
    }

    public void setNombre_cine(String Nombre_cine) {
        this.Nombre_cine = Nombre_cine;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getSucursal_num() {
        return Sucursal_num;
    }

    public void setSucursal_num(String Sucursal_num) {
        this.Sucursal_num = Sucursal_num;
    }

    @Override
    public String toString() {
        return "Cine{" + "Id_Cine=" + Id_Cine + ", Nombre_cine=" + Nombre_cine + ", Direccion=" + Direccion + ", Telefono=" + Telefono + ", Sucursal_num=" + Sucursal_num + '}';
    }
    
    
    
}
