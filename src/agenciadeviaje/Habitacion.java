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
public class Habitacion {
    private int codigoHotelOResort;
    private int noHabitacion;
    private int codigoReservacion;
    private int noPersonas;
    private int costo;
    private String clase;

    /**
     * @return the codigoHotelOResort
     */
    public int getCodigoHotelOResort() {
        return codigoHotelOResort;
    }

    /**
     * @param codigoHotelOResort the codigoHotelOResort to set
     */
    public void setCodigoHotelOResort(int codigoHotelOResort) {
        this.codigoHotelOResort = codigoHotelOResort;
    }

    /**
     * @return the noHabitacion
     */
    public int getNoHabitacion() {
        return noHabitacion;
    }

    /**
     * @param noHabitacion the noHabitacion to set
     */
    public void setNoHabitacion(int noHabitacion) {
        this.noHabitacion = noHabitacion;
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
     * @return the noPersonas
     */
    public int getNoPersonas() {
        return noPersonas;
    }

    /**
     * @param noPersonas the noPersonas to set
     */
    public void setNoPersonas(int noPersonas) {
        this.noPersonas = noPersonas;
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

    /**
     * @return the clase
     */
    public String getClase() {
        return clase;
    }

    /**
     * @param clase the clase to set
     */
    public void setClase(String clase) {
        this.clase = clase;
    }
}
