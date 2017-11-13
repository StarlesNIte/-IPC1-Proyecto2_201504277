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
public class HotelOResort {
   private int codigo;
   private String direccion;
   private int noCuartos;
   private int codigoDestino;

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
     * @return the direccion
     */
    public String getDireccion() {
        return direccion;
    }

    /**
     * @param direccion the direccion to set
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    /**
     * @return the noCuartos
     */
    public int getNoCuartos() {
        return noCuartos;
    }

    /**
     * @param noCuartos the noCuartos to set
     */
    public void setNoCuartos(int noCuartos) {
        this.noCuartos = noCuartos;
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
}
