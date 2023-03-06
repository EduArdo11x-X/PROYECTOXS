/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author EDU
 */
public class Cliente {
    
    private String id_cli;
    private String telefono_cli;
    private String correo_cli;
    private String membresia;

    public Cliente(String id_cli, String telefono_cli, String correo_cli, String membresia) {
        this.id_cli = id_cli;
        this.telefono_cli = telefono_cli;
        this.correo_cli = correo_cli;
        this.membresia = membresia;
    }

    public Cliente() {
        super();
    }

    public String getId_cli() {
        return id_cli;
    }

    public void setId_cli(String id_cli) {
        this.id_cli = id_cli;
    }

    public String getTelefono_cli() {
        return telefono_cli;
    }

    public void setTelefono_cli(String telefono_cli) {
        this.telefono_cli = telefono_cli;
    }

    public String getCorreo_cli() {
        return correo_cli;
    }

    public void setCorreo_cli(String correo_cli) {
        this.correo_cli = correo_cli;
    }

    public String getMembresia() {
        return membresia;
    }

    public void setMembresia(String membresia) {
        this.membresia = membresia;
    }

    @Override
    public String toString() {
        return "Cliente{" + "id_cli=" + id_cli + ", telefono_cli=" + telefono_cli + ", correo_cli=" + correo_cli + ", membresia=" + membresia + '}';
    }
    
    
    
    


    
}
