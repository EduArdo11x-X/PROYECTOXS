/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 *
 * @author EDU
 */
public class Validaciones {
    
         public boolean validarCedula(String cadena) {
        cadena = cadena.trim();
        boolean ban = false;
        if (cadena.matches("([0-9]{10}╽╽[0-9]{8})")) {
            ban = true;
        }
        return ban;
    }
    
    
    public boolean validarNomApe(String cadena) {
        cadena = cadena.trim();
        boolean ban = false;
        if (cadena.matches("[[A-Za-z]\\s]*{3,30}")) {
            ban = true;
        }
        return ban;
    }
    
    public boolean validarid(String cadena) {
        boolean validar = cadena.matches("[[A-Z]{2}]+\\-[[\\d]{4}]");//AS-1234
        System.out.println(validar);
        return validar;
    }
    
    public boolean validarCorreo(String mail) {
        boolean val = false;
        // Patrón para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)(\\.[A-Za-z]{1,30})$");

        // El email a validar
        Matcher mather = pattern.matcher(mail);
        val = mather.find();

        return val;
    }
    
    public boolean validarParentesco(String parentesco) {
        parentesco = parentesco.trim();
        boolean val = false;
        if (parentesco.matches("[[A-Za-z]\\s]*{3,30}")) {
            val = true;
        }
        return val;
    }
    
    
    
    
    
    
    
    
    
     
}
