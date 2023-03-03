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
public class Administrador extends Persona{
    
    private String Tiulo_admi;
    private String Correo_Electronico_admi;
    private int Telefono_admi;
    private String Especializacion_admi;

    public Administrador(String Tiulo_admi, String Correo_Electronico_admi, int Telefono_admi, String Especializacion_admi, String Cedula, String Primer_nom, String Segundo_Nom, String Primer_Ape, String Segundo_Ape, String Calle_principal, String Calle_Secundaria, String Sexo, int Edad) {
        super(Cedula, Primer_nom, Segundo_Nom, Primer_Ape, Segundo_Ape, Calle_principal, Calle_Secundaria, Sexo, Edad);
        this.Tiulo_admi = Tiulo_admi;
        this.Correo_Electronico_admi = Correo_Electronico_admi;
        this.Telefono_admi = Telefono_admi;
        this.Especializacion_admi = Especializacion_admi;
    }

    public Administrador() {
        super();
    }

    public String getTiulo_admi() {
        return Tiulo_admi;
    }

    public void setTiulo_admi(String Tiulo_admi) {
        this.Tiulo_admi = Tiulo_admi;
    }

    public String getCorreo_Electronico_admi() {
        return Correo_Electronico_admi;
    }

    public void setCorreo_Electronico_admi(String Correo_Electronico_admi) {
        this.Correo_Electronico_admi = Correo_Electronico_admi;
    }

    public int getTelefono_admi() {
        return Telefono_admi;
    }

    public void setTelefono_admi(int Telefono_admi) {
        this.Telefono_admi = Telefono_admi;
    }

    public String getEspecializacion_admi() {
        return Especializacion_admi;
    }

    public void setEspecializacion_admi(String Especializacion_admi) {
        this.Especializacion_admi = Especializacion_admi;
    }

    @Override
    public String toString() {
        return "Administrador{" + "Tiulo_admi=" + Tiulo_admi + ", Correo_Electronico_admi=" + Correo_Electronico_admi + ", Telefono_admi=" + Telefono_admi + ", Especializacion_admi=" + Especializacion_admi + '}';
    }
    
    

    
    

}

