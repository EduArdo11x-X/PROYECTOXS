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
public class Empleado {
    
    private String Ced_empleado;
    private String Id_Empleado;
    private String Area_Empleado;
    private String Hora_Entrada;
    private String Hora_salida;
    private String horas_sem;

    public Empleado(String Ced_empleado, String Id_Empleado, String Area_Empleado, String Hora_Entrada, String Hora_salida, String horas_sem) {
        this.Ced_empleado = Ced_empleado;
        this.Id_Empleado = Id_Empleado;
        this.Area_Empleado = Area_Empleado;
        this.Hora_Entrada = Hora_Entrada;
        this.Hora_salida = Hora_salida;
        this.horas_sem = horas_sem;
    }

    public Empleado() {
    }
   
    /**
     * @return the Ced_empleado
     */
    public String getCed_empleado() {
        return Ced_empleado;
    }

    /**
     * @param Ced_empleado the Ced_empleado to set
     */
    public void setCed_empleado(String Ced_empleado) {
        this.Ced_empleado = Ced_empleado;
    }

    /**
     * @return the Id_Empleado
     */
    public String getId_Empleado() {
        return Id_Empleado;
    }

    /**
     * @param Id_Empleado the Id_Empleado to set
     */
    public void setId_Empleado(String Id_Empleado) {
        this.Id_Empleado = Id_Empleado;
    }

    /**
     * @return the Area_Empleado
     */
    public String getArea_Empleado() {
        return Area_Empleado;
    }

    /**
     * @param Area_Empleado the Area_Empleado to set
     */
    public void setArea_Empleado(String Area_Empleado) {
        this.Area_Empleado = Area_Empleado;
    }

    /**
     * @return the Hora_Entrada
     */
    public String getHora_Entrada() {
        return Hora_Entrada;
    }

    /**
     * @param Hora_Entrada the Hora_Entrada to set
     */
    public void setHora_Entrada(String Hora_Entrada) {
        this.Hora_Entrada = Hora_Entrada;
    }

    /**
     * @return the Hora_salida
     */
    public String getHora_salida() {
        return Hora_salida;
    }

    /**
     * @param Hora_salida the Hora_salida to set
     */
    public void setHora_salida(String Hora_salida) {
        this.Hora_salida = Hora_salida;
    }

    /**
     * @return the horas_sem
     */
    public String getHoras_sem() {
        return horas_sem;
    }

    /**
     * @param horas_sem the horas_sem to set
     */
    public void setHoras_sem(String horas_sem) {
        this.horas_sem = horas_sem;
    }

    @Override
    public String toString() {
        return "Empleado{" + "Ced_empleado=" + Ced_empleado + ", Id_Empleado=" + Id_Empleado + ", Area_Empleado=" + Area_Empleado + ", Hora_Entrada=" + Hora_Entrada + ", Hora_salida=" + Hora_salida + ", horas_sem=" + horas_sem + '}';
    }
    
    
    
}
