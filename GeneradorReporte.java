import java.util.List;

public interface GeneradorReporte {
    // Método que cualquier reporte debe implementar
    void generar(List<Cliente> clientes);
}