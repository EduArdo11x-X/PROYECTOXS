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
public class Usuario {
    
    private int Cedual;
    private String Grado;
    private String Nivel_Conocimiento;
    private String Materias_Dificultad;

    public Usuario(int Cedual, String Grado, String Nivel_Conocimiento, String Materias_Dificultad) {
        this.Cedual = Cedual;
        this.Grado = Grado;
        this.Nivel_Conocimiento = Nivel_Conocimiento;
        this.Materias_Dificultad = Materias_Dificultad;
    }

    /**
     * @return the Cedual
     */
    public int getCedual() {
        return Cedual;
    }

    /**
     * @param Cedual the Cedual to set
     */
    public void setCedual(int Cedual) {
        this.Cedual = Cedual;
    }

    /**
     * @return the Grado
     */
    public String getGrado() {
        return Grado;
    }

    /**
     * @param Grado the Grado to set
     */
    public void setGrado(String Grado) {
        this.Grado = Grado;
    }

    /**
     * @return the Nivel_Conocimiento
     */
    public String getNivel_Conocimiento() {
        return Nivel_Conocimiento;
    }

    /**
     * @param Nivel_Conocimiento the Nivel_Conocimiento to set
     */
    public void setNivel_Conocimiento(String Nivel_Conocimiento) {
        this.Nivel_Conocimiento = Nivel_Conocimiento;
    }

    /**
     * @return the Materias_Dificultad
     */
    public String getMaterias_Dificultad() {
        return Materias_Dificultad;
    }

    /**
     * @param Materias_Dificultad the Materias_Dificultad to set
     */
    public void setMaterias_Dificultad(String Materias_Dificultad) {
        this.Materias_Dificultad = Materias_Dificultad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Cedual=" + Cedual + ", Grado=" + Grado + ", Nivel_Conocimiento=" + Nivel_Conocimiento + ", Materias_Dificultad=" + Materias_Dificultad + '}';
    }

}

    

