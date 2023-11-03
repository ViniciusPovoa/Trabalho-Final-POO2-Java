

public class MotoPagamentoStrategy implements PagamentoStrategy {


    @Override
    public double calcularPagamento(String horasUtilizadas, String minutosUtilizados) {
        int horas = Integer.parseInt(horasUtilizadas);
        int minutos = Integer.parseInt(minutosUtilizados);

        // converte o tempo total em minutos
        int tempoTotalMin = horas * 60 + minutos;

        double valor = 0.0;

 
        if (tempoTotalMin < 60) {
            valor = 1.00;
        } else if (tempoTotalMin == 60) {
            valor = 2.00;
        } else if (tempoTotalMin > 60 && tempoTotalMin < 120) {
            valor = 3.00;
        } else {

            valor = tempoTotalMin * 0.033;
        }

        return valor;
    }
}