


import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public abstract class Veiculo {
     private String nomeCondutor, horaEntrada, placaCarro, automovel;
     private List<VeiculoObserver> observadores = new ArrayList<>();
     
  

    public Veiculo (String nomeCondutor, String horaEntrada, String placaCarro, String automovel) {
        this.nomeCondutor = nomeCondutor;
        this.horaEntrada = horaEntrada;
        this.placaCarro = placaCarro;
        this.automovel = automovel;
    }

    
    public void getLabel(String label){
        System.out.println(label);
    }
    
    
    public String getAutomovel() {
        return automovel;
    }

    
    public void setAutomovel(String automovel) {
        this.automovel = automovel;
    }

        public String obterHora() {

        Date data = new Date();
        SimpleDateFormat formatar = new SimpleDateFormat("HH:mm");
        String dataFormatada = formatar.format(data);
        return dataFormatada;
    }
    
    
    
    public String getNomeCondutor() {
        return nomeCondutor;
    }

    public void setNomeCondutor(String nomeCondutor) {
        this.nomeCondutor = nomeCondutor;
    }

    public String getHoraEntrada() {
        return horaEntrada;
    }

    public void setHoraEntrada(String horaEntrada) {
        this.horaEntrada = horaEntrada;
    }

    public String getPlacaVeiculo() {
        return placaCarro;
    }

    public void setPlacaVeiculo(String placaCarro) {
        this.placaCarro = placaCarro;
    }
    
    public void adicionarObservador(VeiculoObserver observador) {
        observadores.add(observador);
    }

    public void atualizarVeiculo(String nome, String tipo, String placa, String hora) {
        this.nomeCondutor = nome;
        this.automovel = tipo;
        this.placaCarro = placa;
        this.horaEntrada = hora;
        notificarObservadores();
    }

    private void notificarObservadores() {
        for (VeiculoObserver observador : observadores) {
            observador.veiculoAtualizado(nomeCondutor, automovel, placaCarro, horaEntrada);
        }
    }
    
    public abstract void accept(VeiculoVisitor visitor);
     
     

    
}
