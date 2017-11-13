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
public class RentaAuto {
    private int codigo;
    private int codigoCliente;
    private int noPasajeros;
    private String tipoTerreno;
    private int duracion;
    private int monto;
    private String fechaEntrega;
    private String fechaDevolucion;
    private String condiciones;

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
     * @return the noPasajeros
     */
    public int getNoPasajeros() {
        return noPasajeros;
    }

    /**
     * @param noPasajeros the noPasajeros to set
     */
    public void setNoPasajeros(int noPasajeros) {
        this.noPasajeros = noPasajeros;
    }

    /**
     * @return the tipoTerreno
     */
    public String getTipoTerreno() {
        return tipoTerreno;
    }

    /**
     * @param tipoTerreno the tipoTerreno to set
     */
    public void setTipoTerreno(String tipoTerreno) {
        this.tipoTerreno = tipoTerreno;
    }

    /**
     * @return the duracion
     */
    public int getDuracion() {
        return duracion;
    }

    /**
     * @param duracion the duracion to set
     */
    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    /**
     * @return the monto
     */
    public int getMonto() {
        return monto;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(int monto) {
        this.monto = monto;
    }

    /**
     * @return the fechaEntrega
     */
    public String getFechaEntrega() {
        return fechaEntrega;
    }

    /**
     * @param fechaEntrega the fechaEntrega to set
     */
    public void setFechaEntrega(String fechaEntrega) {
        this.fechaEntrega = fechaEntrega;
    }

    /**
     * @return the fechaDevolucion
     */
    public String getFechaDevolucion() {
        return fechaDevolucion;
    }

    /**
     * @param fechaDevolucion the fechaDevolucion to set
     */
    public void setFechaDevolucion(String fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    /**
     * @return the condiciones
     */
    public String getCondiciones() {
        return condiciones;
    }

    /**
     * @param condiciones the condiciones to set
     */
    public void setCondiciones(String condiciones) {
        this.condiciones = condiciones;
    }
}
