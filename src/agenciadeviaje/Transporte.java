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
public class Transporte {
    private int codigo;
    private int capacidad;
    private int codigoDestino;

    /**
     * @return the capacidad
     */
    public int getCapacidad() {
        return capacidad;
    }

    /**
     * @param capacidad the capacidad to set
     */
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    /**
     * @return the codigoDestino
     */
    public int getCodigoDestino() {
        return codigoDestino;
    }

    /**
     * @param codigoDestino the codigoDestino to set
     */
    public void setCodigoDestino(int codigoDestino) {
        this.codigoDestino = codigoDestino;
    }

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
}
