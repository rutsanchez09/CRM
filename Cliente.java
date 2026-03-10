import java.util.ArrayList;
import java.util.List;

public class Cliente extends EntidadBase {
    private String nombreEmpresa;
    private String telefono;
    private String email;
    private String fechaRegistro;
    private List<Oportunidad> oportunidades;

    public Cliente(String id, String nombre, String telefono, String email, String fecha) {
        super(id);
        this.nombreEmpresa = nombre;
        setTelefono(telefono); // Validación inmediata
        this.email = email;
        this.fechaRegistro = fecha;
        this.oportunidades = new ArrayList<>();
    }

    public void setTelefono(String telefono) {
        if (telefono != null && telefono.length() == 10) {
            this.telefono = telefono;
        } else {
            throw new IllegalArgumentException("Error: El teléfono debe tener 10 dígitos.");
        }
    }

    public void agregarOportunidad(Oportunidad op) {
        this.oportunidades.add(op);
    }

    // Getters
    public List<Oportunidad> getOportunidades() { return oportunidades; }
    public String getNombreEmpresa() { return nombreEmpresa; }
}