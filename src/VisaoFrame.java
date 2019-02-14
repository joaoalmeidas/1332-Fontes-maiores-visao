import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VisaoFrame extends JFrame {
	
	private static String[] tiposFonte = {"Serif", "SansSerif", "Monospaced"};
	
	private JPanel panelControle;
	private VisaoPanel panelVisao;
	
	private JComboBox <String> comboFontes;
	private JCheckBox checkNegrito;
	private JButton aumentaFonte;
	private JButton diminuiFonte;
	
	public VisaoFrame() {
		
		panelControle = new JPanel(new FlowLayout());
		
		panelVisao = new VisaoPanel();
		comboFontes = new JComboBox<String>(tiposFonte);
		checkNegrito = new JCheckBox("Negrito");
		aumentaFonte = new JButton("Aumenta Fonte");
		diminuiFonte = new JButton("Diminui Fonte");
		
		panelControle.add(comboFontes);
		panelControle.add(checkNegrito);
		panelControle.add(aumentaFonte);
		panelControle.add(diminuiFonte);
		
		add(panelControle, BorderLayout.NORTH);
		add(panelVisao);
	}
	
	
}
