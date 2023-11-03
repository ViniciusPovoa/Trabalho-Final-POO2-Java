
public class Carro extends Veiculo {

    public Carro(String nomeCondutor, String horaEntrada, String placaCarro) {
        super(nomeCondutor, horaEntrada, placaCarro, "Carro");
    }

    public void accept(VeiculoVisitor visitor) {
        visitor.visit(this);
    }
}
