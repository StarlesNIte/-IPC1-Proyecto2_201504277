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
public class Reservacion {
    private int codigo;
    private int codigoPaquete;
    private int codigoCliente;
    private String fechaReservacion;
    private String fechaSalida;
    private int DuracionViaje;
    private String estado;
    private int saldoPendiente;

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the codigoPaquete
     */
    public int getCodigoPaquete() {
        return codigoPaquete;
    }

    /**
     * @param codigoPaquete the codigoPaquete to set
     */
    public void setCodigoPaquete(int codigoPaquete) {
        this.codigoPaquete = codigoPaquete;
    }

    /**
     * @return the codigoCliente
     */
    public int getCodigoCliente() {
        return codigoCliente;
    }

    /**
     * @param codigoCliente the codigoCliente to set
     */
    public void setCodigoCliente(int codigoCliente) {
        this.codigoCliente = codigoCliente;
    }

    /**
     * @return the fechaReservacion
     */
    public String getFechaReservacion() {
        return fechaReservacion;
    }

    /**
     * @param fechaReservacion the fechaReservacion to set
     */
    public void setFechaReservacion(String fechaReservacion) {
        this.fechaReservacion = fechaReservacion;
    }

    /**
     * @return the fechaSalida
     */
    public String getFechaSalida() {
        return fechaSalida;
    }

    /**
     * @param fechaSalida the fechaSalida to set
     */
    public void setFechaSalida(String fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    /**
     * @return the DuracionViaje
     */
    public int getDuracionViaje() {
        return DuracionViaje;
    }

    /**
     * @param DuracionViaje the DuracionViaje to set
     */
    public void setDuracionViaje(int DuracionViaje) {
        this.DuracionViaje = DuracionViaje;
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @return the saldoPendiente
     */
    public int getSaldoPendiente() {
        return saldoPendiente;
    }

    /**
     * @param saldoPendiente the saldoPendiente to set
     */
    public void setSaldoPendiente(int saldoPendiente) {
        this.saldoPendiente = saldoPendiente;
    }
}
