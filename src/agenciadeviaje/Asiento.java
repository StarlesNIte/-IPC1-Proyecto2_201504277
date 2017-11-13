/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package agenciadeviaje;

/**
 *
 * @author LuisMiguel
 */
public class Asiento {

    private int codigoTransporte;
    private int codigoReservacion;
    private int noAsientoViajero;
    private String Clase;
    private int costo;

    /**
     * @return the codigoTransporte
     */
    public int getCodigoTransporte() {
        return codigoTransporte;
    }

    /**
     * @param codigoTransporte the codigoTransporte to set
     */
    public void setCodigoTransporte(int codigoTransporte) {
        this.codigoTransporte = codigoTransporte;
    }

    /**
     * @return the codigoReservacion
     */
    public int getCodigoReservacion() {
        return codigoReservacion;
    }

    /**
     * @param codigoReservacion the codigoReservacion to set
     */
    public void setCodigoReservacion(int codigoReservacion) {
        this.codigoReservacion = codigoReservacion;
    }

    /**
     * @return the noAsientoViajero
     */
    public int getNoAsientoViajero() {
        return noAsientoViajero;
    }

    /**
     * @param noAsientoViajero the noAsientoViajero to set
     */
    public void setNoAsientoViajero(int noAsientoViajero) {
        this.noAsientoViajero = noAsientoViajero;
    }

    /**
     * @return the Clase
     */
    public String getClase() {
        return Clase;
    }

    /**
     * @param Clase the Clase to set
     */
    public void setClase(String Clase) {
        this.Clase = Clase;
    }

    /**
     * @return the costo
     */
    public int getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(int costo) {
        this.costo = costo;
    }
}
