package Estructura;


import java.time.LocalDate;

public class AsociadoNatural extends Asociados {

    private long monto_totalAportaciones;
    private int cantidad_Aportaciones;
    private LocalDate fechaUltimaAportacion;
    private int contador_AsociadosNaturales;
    
    public long getMonto_totalAportaciones() {
        return monto_totalAportaciones;
    }
    public void setMonto_totalAportaciones(long monto_totalAportaciones) {
        this.monto_totalAportaciones = monto_totalAportaciones;
    }
    public int getCantidad_Aportaciones() {
        return cantidad_Aportaciones;
    }
    public void setCantidad_Aportaciones(int cantidad_Aportaciones) {
        this.cantidad_Aportaciones = cantidad_Aportaciones;
    }
    public LocalDate getFechaUltimaAportacion() {
        return fechaUltimaAportacion;
    }
    public void setFechaUltimaAportacion(LocalDate fechaUltimaAportacion) {
        this.fechaUltimaAportacion = fechaUltimaAportacion;
    }
    public int getContador_AsociadosNaturales() {
        return contador_AsociadosNaturales;
    }
    public void setContador_AsociadosNaturales(int contador_AsociadosNaturales) {
        this.contador_AsociadosNaturales = contador_AsociadosNaturales;
    }
   

    public AsociadoNatural(int num_socio, String nombre, long l, LocalDate fecha_ingreso,
            long monto_totalAportaciones, int cantidad_Aportaciones, LocalDate fechaUltimaAportacion) {
        super(num_socio, nombre, l, fecha_ingreso);
        this.monto_totalAportaciones = monto_totalAportaciones;
        this.cantidad_Aportaciones = cantidad_Aportaciones;
        this.fechaUltimaAportacion = fechaUltimaAportacion;
        
        
    }

    @Override
    public String toString() {
        return super.toString() + "Monto totalAportaciones: " + monto_totalAportaciones + "\nCantidad Aportaciones"
                + cantidad_Aportaciones + "\nfecha Ultima Aportacion: " + fechaUltimaAportacion;
    }

    

    
    
    



}
