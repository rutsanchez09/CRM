import java.util.List;

public class ReporteMensual implements GeneradorReporte {
    @Override
    public void generar(List<Cliente> clientes) {
        int cerradas = 0;
        double montoTotal = 0;

        for (Cliente cliente : clientes) {
            for (Oportunidad op : cliente.getOportunidades()) {
                if (op.getEstado() == EstadoOportunidad.CERRADA) {
                    cerradas++;
                    montoTotal += op.getMonto();
                }
            }
        }

        System.out.println(">>> REPORTE MENSUAL <<<");
        System.out.println("Oportunidades cerradas: " + cerradas);
        System.out.println("Monto total acumulado: $" + montoTotal);
    }
}
