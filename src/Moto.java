
public class Moto extends Veiculo {

    public Moto(String nomeCondutor, String horaEntrada, String placaMoto) {
        super(nomeCondutor, horaEntrada, placaMoto, "Moto");
    }

    public void accept(VeiculoVisitor visitor) {
        visitor.visit(this);
    }
}
