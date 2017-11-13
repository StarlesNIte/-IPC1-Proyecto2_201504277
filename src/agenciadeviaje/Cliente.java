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
public class Cliente {
    private int codigo;
    private String nombre;
    private String apellido;
    private int codigoTarjeta;
    private String fechaNacimiento;
    private int telefono;
    private int movil;
    private String direccionHabitacion;
    private String clasificacionFrecuencia;
    private String clasificacionMonoto;

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
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido
     */
    public String getApellido() {
        return apellido;
    }

    /**
     * @param apellido the apellido to set
     */
    public void setApellido(String apellido) {
        this.apellido = apellido;
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
     * @return the fechaNacimiento
     */
    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    /**
     * @param fechaNacimiento the fechaNacimiento to set
     */
    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    /**
     * @return the telefono
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the movil
     */
    public int getMovil() {
        return movil;
    }

    /**
     * @param movil the movil to set
     */
    public void setMovil(int movil) {
        this.movil = movil;
    }

    /**
     * @return the direccionHabitacion
     */
    public String getDireccionHabitacion() {
        return direccionHabitacion;
    }

    /**
     * @param direccionHabitacion the direccionHabitacion to set
     */
    public void setDireccionHabitacion(String direccionHabitacion) {
        this.direccionHabitacion = direccionHabitacion;
    }

    /**
     * @return the clasificacionFrecuencia
     */
    public String getClasificacionFrecuencia() {
        return clasificacionFrecuencia;
    }

    /**
     * @param clasificacionFrecuencia the clasificacionFrecuencia to set
     */
    public void setClasificacionFrecuencia(String clasificacionFrecuencia) {
        this.clasificacionFrecuencia = clasificacionFrecuencia;
    }

    /**
     * @return the clasificacionMonoto
     */
    public String getClasificacionMonoto() {
        return clasificacionMonoto;
    }

    /**
     * @param clasificacionMonoto the clasificacionMonoto to set
     */
    public void setClasificacionMonoto(String clasificacionMonoto) {
        this.clasificacionMonoto = clasificacionMonoto;
    }
}
