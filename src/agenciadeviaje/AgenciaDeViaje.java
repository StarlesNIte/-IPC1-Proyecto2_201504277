/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciadeviaje;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
/**
 *
 * @author LuisMiguel
 */
public class AgenciaDeViaje {

    /**
     * @param args the command line arguments
     */
    // static final Logger log = Logger.getLogger(AgenciaDeViaje.class);
    private final static Logger log = LogManager.getLogger(AgenciaDeViaje.class);
    public static void main(String[] args) {
        log.info("iniciando aplicación");
        new VentanaInicial();
    }
    
}
