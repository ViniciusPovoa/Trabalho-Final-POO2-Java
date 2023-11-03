

public class CarroPagamentoStrategy implements PagamentoStrategy {
    
    
    @Override
    public double calcularPagamento(String horasUtilizadas, String minutosUtilizados) {
        int horas = Integer.parseInt(horasUtilizadas);
        int minutos = Integer.parseInt(minutosUtilizados);

        // Converter o tempo total em minutos
        int tempoTotalMin = horas * 60 + minutos;

        double valor = 0.0;

        // Lógica de cálculo para carros
        if (tempoTotalMin < 60) {
            valor = 2.00;
        } else if (tempoTotalMin == 60) {
            valor = 4.00;
        } else if (tempoTotalMin > 60 && tempoTotalMin < 120) {
            valor = 6.00;
        } else {
            // Cálculo adicional, se necessário
            valor = tempoTotalMin * 0.066;
        }

        return valor;
    }
}







