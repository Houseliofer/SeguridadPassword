/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package Main;

import static junit.framework.Assert.assertEquals;
import static Main.Contrasena.NivelSeguridad.debil;
import static Main.Contrasena.NivelSeguridad.medio;
import static Main.Contrasena.NivelSeguridad.fuerte;
import org.junit.Test;



/**
 *
 * @author house
 */
public class ContrasenaTest {
    
    
    @Test
    public void debil_cuando_tiene_menos_de_8_caracteres(){
        assertEquals(debil, Contrasena.assessPassword("1234567")); 
    }
    
    @Test
    public void debil_cuando_solo_tiene_letras(){
        assertEquals(debil , Contrasena.assessPassword("abcdefghi")); 
    }
    
    @Test
    public void medio_cuando_tiene_letras_y_numeros(){
        assertEquals(medio , Contrasena.assessPassword("abcd1234")); 
    }
    
    @Test
    public void fuerte_cuando_tiene_letras_numeros_y_simbolos(){
        assertEquals(fuerte, Contrasena.assessPassword("abcd123!")); 
    }
}
