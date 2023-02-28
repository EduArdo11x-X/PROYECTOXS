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
public class Multimedia {
    
    private int Cod_mult;
    private String Fecha_Interaccion;
    private String Nivel_juego;
    private String Cod_video;

    public Multimedia(int Cod_mult, String Fecha_Interaccion, String Nivel_juego, String Cod_video) {
        this.Cod_mult = Cod_mult;
        this.Fecha_Interaccion = Fecha_Interaccion;
        this.Nivel_juego = Nivel_juego;
        this.Cod_video = Cod_video;
    }
    
    

    /**
     * @return the Cod_mult
     */
    public int getCod_mult() {
        return Cod_mult;
    }

    /**
     * @param Cod_mult the Cod_mult to set
     */
    public void setCod_mult(int Cod_mult) {
        this.Cod_mult = Cod_mult;
    }

    /**
     * @return the Fecha_Interaccion
     */
    public String getFecha_Interaccion() {
        return Fecha_Interaccion;
    }

    /**
     * @param Fecha_Interaccion the Fecha_Interaccion to set
     */
    public void setFecha_Interaccion(String Fecha_Interaccion) {
        this.Fecha_Interaccion = Fecha_Interaccion;
    }

    /**
     * @return the Nivel_juego
     */
    public String getNivel_juego() {
        return Nivel_juego;
    }

    /**
     * @param Nivel_juego the Nivel_juego to set
     */
    public void setNivel_juego(String Nivel_juego) {
        this.Nivel_juego = Nivel_juego;
    }

    /**
     * @return the Cod_video
     */
    public String getCod_video() {
        return Cod_video;
    }

    /**
     * @param Cod_video the Cod_video to set
     */
    public void setCod_video(String Cod_video) {
        this.Cod_video = Cod_video;
    }

    @Override
    public String toString() {
        return "Multimedia{" + "Cod_mult=" + Cod_mult + ", Fecha_Interaccion=" + Fecha_Interaccion + ", Nivel_juego=" + Nivel_juego + ", Cod_video=" + Cod_video + '}';
    }
           
    
}
