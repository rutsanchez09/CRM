// Enum para tipar los estados y evitar errores de dedo
import java.time.LocalDate;

enum EstadoOportunidad {
    CONTACTO_INICIAL, PROPUESTA, NEGOCIACION, CERRADA
}

public class Oportunidad extends EntidadBase {
    private double monto;
    private LocalDate fechaCreacion;
    private EstadoOportunidad estado;

    public Oportunidad(String id, double monto, String fecha, EstadoOportunidad estado) {
        super(id);
        setMonto(monto);
        setFechaCreacion(fecha);
        this.estado = estado;
    }

    public void setMonto (double monto){
        if (monto<0){
            throw new IllegalArgumentException("El monto no puede ser negativo");
        }
        this.monto = monto;
    }
    
    public void setFechaCreacion(String fechaStr) {
        LocalDate fecha = LocalDate.parse(fechaStr);
        if (fecha.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha de creación no puede ser futura.");
        }
        this.fechaCreacion = fecha;
    }

    public double getMonto() { return monto; }
    public EstadoOportunidad getEstado() { return estado; }
}
