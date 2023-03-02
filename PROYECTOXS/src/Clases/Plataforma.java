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
    
private String Codigo_Registro_plat;

    public Plataforma(String Codigo_Registro_plat) {
        this.Codigo_Registro_plat = Codigo_Registro_plat;
    }

    public Plataforma() {
    }

    public String getCodigo_Registro_plat() {
        return Codigo_Registro_plat;
    }

    public void setCodigo_Registro_plat(String Codigo_Registro_plat) {
        this.Codigo_Registro_plat = Codigo_Registro_plat;
    }

    @Override
    public String toString() {
        return "Plataforma{" + "Codigo_Registro_plat=" + Codigo_Registro_plat + '}';
    }






    
    
}

