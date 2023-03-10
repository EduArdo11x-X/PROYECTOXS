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
public class Usuario extends Persona {
    private String Grado;
    private String Nivel_Conocimiento;
    private String Materias_Dificultad;

    public Usuario(String Grado, String Nivel_Conocimiento, String Materias_Dificultad, String Cedula, String Primer_nom, String Segundo_Nom, String Primer_Ape, String Segundo_Ape, String Calle_principal, String Calle_Secundaria, String Sexo, int Edad) {
        super(Cedula, Primer_nom, Segundo_Nom, Primer_Ape, Segundo_Ape, Calle_principal, Calle_Secundaria, Sexo, Edad);
        this.Grado = Grado;
        this.Nivel_Conocimiento = Nivel_Conocimiento;
        this.Materias_Dificultad = Materias_Dificultad;
    }

    public Usuario() {
        super();
        
    }

    public String getGrado() {
        return Grado;
    }

    public void setGrado(String Grado) {
        this.Grado = Grado;
    }

    public String getNivel_Conocimiento() {
        return Nivel_Conocimiento;
    }

    public void setNivel_Conocimiento(String Nivel_Conocimiento) {
        this.Nivel_Conocimiento = Nivel_Conocimiento;
    }

    public String getMaterias_Dificultad() {
        return Materias_Dificultad;
    }

    public void setMaterias_Dificultad(String Materias_Dificultad) {
        this.Materias_Dificultad = Materias_Dificultad;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Grado=" + Grado + ", Nivel_Conocimiento=" + Nivel_Conocimiento + ", Materias_Dificultad=" + Materias_Dificultad + '}';
    }
    
    
    
    

}