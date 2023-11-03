


public class MotoFactory implements VeiculoFactory {
   
    
    
    @Override
    public Veiculo criarVeiculo(String nomeCondutor, String horaEntrada, String placaCarro) {
        return new Moto(nomeCondutor, horaEntrada, placaCarro);
    }
}