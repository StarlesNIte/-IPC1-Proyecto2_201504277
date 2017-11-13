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
public class Entretenimiento extends Lugar{
    private int minEdad;
    private String horarioActividad;
    private String horarioFuncion;
    private String recomendacionSeguridad;
    private int codigoDestino;

    /**
     * @return the minEdad
     */
    public int getMinEdad() {
        return minEdad;
    }

    /**
     * @param minEdad the minEdad to set
     */
    public void setMinEdad(int minEdad) {
        this.minEdad = minEdad;
    }

    /**
     * @return the horarioActividad
     */
    public String getHorarioActividad() {
        return horarioActividad;
    }

    /**
     * @param horarioActividad the horarioActividad to set
     */
    public void setHorarioActividad(String horarioActividad) {
        this.horarioActividad = horarioActividad;
    }

    /**
     * @return the horarioFuncion
     */
    public String getHorarioFuncion() {
        return horarioFuncion;
    }

    /**
     * @param horarioFuncion the horarioFuncion to set
     */
    public void setHorarioFuncion(String horarioFuncion) {
        this.horarioFuncion = horarioFuncion;
    }

    /**
     * @return the recomendacionSeguridad
     */
    public String getRecomendacionSeguridad() {
        return recomendacionSeguridad;
    }

    /**
     * @param recomendacionSeguridad the recomendacionSeguridad to set
     */
    public void setRecomendacionSeguridad(String recomendacionSeguridad) {
        this.recomendacionSeguridad = recomendacionSeguridad;
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
