import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        // Simulación de base de datos usando identificador válido
        Map<String, Cliente> repoClientes = new HashMap<>();

        // 1. Crear cliente con 10 dígitos
        Cliente c1 = new Cliente("CLI-01", "Google", "5512345678", "hr@google.com", "2023-01-01");
        
        // 2. Agregar oportunidades
        c1.agregarOportunidad(new Oportunidad("OP-01", 15000, "2023-05-01", EstadoOportunidad.CERRADA));
        c1.agregarOportunidad(new Oportunidad("OP-02", 10000, "2023-05-15", EstadoOportunidad.CERRADA));
        
        repoClientes.put(c1.getId(), c1);

        // 3. Consultar mediante identificador válido (Requerimiento del profe)
        Cliente consultado = repoClientes.get("CLI-01");

        if (consultado != null) {
            // 4. Generar reporte
            GeneradorReporte miReporte = new ReporteMensual();
            List<Cliente> listaParaReporte = new ArrayList<>();
            listaParaReporte.add(consultado);
            miReporte.generar(listaParaReporte);
        }
    }
}
