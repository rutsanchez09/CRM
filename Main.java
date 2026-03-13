import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        try{  
            Map<String, Cliente> repoClientes = new HashMap<>();

            // 1. Crear cliente con 10 dígitos
            Cliente c1 = new Cliente("CLI-01", "Google", "5512345678", "hr@google.com", "2023-01-01");
            
            // 2. Agregar oportunidades
            c1.agregarOportunidad(new Oportunidad("OP-01", 15000, "2023-05-01", EstadoOportunidad.CERRADA));
            c1.agregarOportunidad(new Oportunidad("OP-02", 40000, "2023-05-15", EstadoOportunidad.CERRADA));
            
            repoClientes.put(c1.getId(), c1);

            // 3. Consultar mediante identificador válido 
            Cliente consultado = repoClientes.get("CLI-01");

            if (consultado != null) {
                GeneradorReporte miReporte = new ReporteMensual();
                List<Cliente> listaParaReporte = new ArrayList<>();
                listaParaReporte.add(consultado);
                miReporte.generar(listaParaReporte);
            }
        }catch (IllegalArgumentException e){
            System.out.println("ERROR DE VALIDACIÓN: " + e.getMessage());
        }catch (Exception e) {
            System.out.println("ERROR DEL SISTEMA: " + e.getLocalizedMessage());
        }
    }
}
