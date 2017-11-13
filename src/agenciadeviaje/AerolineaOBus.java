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
public class AerolineaOBus extends Transporte {
    private String horarioSalida;
    private String horarioLlegada;

    /**
     * @return the horarioSalida
     */
    public String getHorarioSalida() {
        return horarioSalida;
    }

    /**
     * @param horarioSalida the horarioSalida to set
     */
    public void setHorarioSalida(String horarioSalida) {
        this.horarioSalida = horarioSalida;
    }

    /**
     * @return the horarioLlegada
     */
    public String getHorarioLlegada() {
        return horarioLlegada;
    }

    /**
     * @param horarioLlegada the horarioLlegada to set
     */
    public void setHorarioLlegada(String horarioLlegada) {
        this.horarioLlegada = horarioLlegada;
    }
}
