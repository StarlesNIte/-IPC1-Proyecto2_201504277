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
public class EntidadFinanciera {
    private int codigo;
    private int codigoCliente;
    private String tipoTarjeta;
    private int codigoTarjeta;
    private int saldo;
    private int limite;

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
     * @return the tipoTarjeta
     */
    public String getTipoTarjeta() {
        return tipoTarjeta;
    }

    /**
     * @param tipoTarjeta the tipoTarjeta to set
     */
    public void setTipoTarjeta(String tipoTarjeta) {
        this.tipoTarjeta = tipoTarjeta;
    }

    /**
     * @return the codigoTarjeta
     */
    public int getCodigoTarjeta() {
        return codigoTarjeta;
    }

    /**
     * @param codigoTarjeta the codigoTarjeta to set
     */
    public void setCodigoTarjeta(int codigoTarjeta) {
        this.codigoTarjeta = codigoTarjeta;
    }

    /**
     * @return the saldo
     */
    public int getSaldo() {
        return saldo;
    }

    /**
     * @param saldo the saldo to set
     */
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    /**
     * @return the limite
     */
    public int getLimite() {
        return limite;
    }

    /**
     * @param limite the limite to set
     */
    public void setLimite(int limite) {
        this.limite = limite;
    }
}
