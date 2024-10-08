package Estructura;

import java.time.LocalDate;

public class AsociadoNatural extends Asociados {

    private long monto_totalAportaciones;
    private int cantidad_Aportaciones;
    private LocalDate fechaUltimaAportacion;

    public long getMontoAportaciones() {
        return monto_totalAportaciones;
    }

    public void setMontoAportaciones(long monto_totalAportaciones) {
        this.monto_totalAportaciones = monto_totalAportaciones;
    }

    public int getCantidadAportaciones() {
        return cantidad_Aportaciones;
    }

    public void setCantidadAportaciones(int cantidad_Aportaciones) {
        this.cantidad_Aportaciones = cantidad_Aportaciones;
    }

    public LocalDate getFechaUltimaAportacion() {
        return fechaUltimaAportacion;
    }

    public void setFechaUltimaAportacion(LocalDate fechaUltimaAportacion) {
        this.fechaUltimaAportacion = fechaUltimaAportacion;
    }

    public AsociadoNatural(int num_socio, String nombre, long telefono, LocalDate fecha_ingreso,
            long monto_totalAportaciones, int cantidad_Aportaciones, LocalDate fechaUltimaAportacion) {
        super(num_socio, nombre, telefono, fecha_ingreso);
        this.monto_totalAportaciones = monto_totalAportaciones;
        this.cantidad_Aportaciones = cantidad_Aportaciones;
        this.fechaUltimaAportacion = fechaUltimaAportacion;
    }

    @Override
    public String toString() {
        return super.toString() + "Monto total de aportaciones: " + monto_totalAportaciones + "\nCantidad de aportaciones: "
            + cantidad_Aportaciones + "\nFecha de la última aportación: " + fechaUltimaAportacion;
    }
}