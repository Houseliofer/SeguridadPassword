/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author house
 */
public class Contrasena {
    
    public enum NivelSeguridad{
        debil, medio, fuerte
    }//
    
    public static NivelSeguridad assessPassword(String password){
        
        if(password.length() < 8)
            return NivelSeguridad.debil;
        
        if(password.matches("[a-zA-Z]+"))
            return NivelSeguridad.debil;
        
        if(password.matches("[a-zA-Z0-9]+"))
            return NivelSeguridad.medio;
        
        return NivelSeguridad.fuerte;
    }

    //cambie algo
}
