



public class CarroFactory implements VeiculoFactory {
  
       @Override
    public Veiculo criarVeiculo(String nomeCondutor, String horaEntrada, String placaCarro) {
        return new Carro(nomeCondutor, horaEntrada, placaCarro);
    }
}