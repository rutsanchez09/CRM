// Enum para tipar los estados y evitar errores de dedo
enum EstadoOportunidad {
    CONTACTO_INICIAL, PROPUESTA, NEGOCIACION, CERRADA
}

public class Oportunidad extends EntidadBase {
    private double monto;
    private String fechaCreacion;
    private EstadoOportunidad estado;

    public Oportunidad(String id, double monto, String fecha, EstadoOportunidad estado) {
        super(id);
        this.monto = monto;
        this.fechaCreacion = fecha;
        this.estado = estado;
    }

    public double getMonto() { return monto; }
    public EstadoOportunidad getEstado() { return estado; }
}
