public class VeiculoInfoVisitor implements VeiculoVisitor {
    private String nomeCondutor;
    private String automovel;
    private String placaVeiculo;
    private String horaEntrada;

    @Override
    public void visit(Carro carro) {
        nomeCondutor = carro.getNomeCondutor();
        automovel = carro.getAutomovel();
        placaVeiculo = carro.getPlacaVeiculo();
        horaEntrada = carro.getHoraEntrada();
    }

    @Override
    public void visit(Moto moto) {
        nomeCondutor = moto.getNomeCondutor();
        automovel = moto.getAutomovel();
        placaVeiculo = moto.getPlacaVeiculo();
        horaEntrada = moto.getHoraEntrada();
    }

    // métodos para acessar as informações após a visita
    public String getNomeCondutor() {
        return nomeCondutor;
    }

    public String getAutomovel() {
        return automovel;
    }

    public String getPlacaVeiculo() {
        return placaVeiculo;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }
}
