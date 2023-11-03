


public interface VeiculoVisitor {
    void visit(Carro carro);
    void visit(Moto moto);
    
    String getNomeCondutor(); 
    String getAutomovel();
    String getPlacaVeiculo(); 
    String getHoraEntrada();
}