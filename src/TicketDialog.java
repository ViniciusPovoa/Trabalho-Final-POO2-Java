
import javax.swing.*;
import java.awt.*;

public class TicketDialog extends JDialog {

    public TicketDialog(Veiculo veiculo, VeiculoVisitor visitor) {
        setTitle("Easy Park - Ticket de Veículo");
        ImageIcon icon = new ImageIcon(getClass().getResource("/resources/trabalho.png"));
        setIconImage(icon.getImage());
        setSize(400, 200);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(4, 2));

        veiculo.accept(visitor); // visita o veiculo com visitor

        panel.add(new JLabel("Nome do Condutor:"));
        panel.add(new JLabel(visitor.getNomeCondutor()));

        panel.add(new JLabel("Automóvel:"));
        panel.add(new JLabel(visitor.getAutomovel()));

        panel.add(new JLabel("Placa:"));
        panel.add(new JLabel(visitor.getPlacaVeiculo()));

        panel.add(new JLabel("Hora de Entrada:"));
        panel.add(new JLabel(visitor.getHoraEntrada()));

        add(panel);
    }
}
