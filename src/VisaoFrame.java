import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VisaoFrame extends JFrame {
	
	private static String[] tiposFonte = {"Serif", "SansSerif", "Monospaced"};
	
	private final JPanel panelControle;
	private final VisaoPanel panelVisao;
	
	private final JComboBox <String> comboFontes;
	private final JCheckBox checkNegrito;
	private final JButton aumentaFonte;
	private final JButton diminuiFonte;
	private final Font fonteControle;
	
	public VisaoFrame() {
		
		
		
		panelControle = new JPanel(new FlowLayout());
		fonteControle = new Font("SansSerif", Font.PLAIN, 20);
		
		panelVisao = new VisaoPanel();
		comboFontes = new JComboBox<String>(tiposFonte);
		checkNegrito = new JCheckBox("Negrito");
		aumentaFonte = new JButton("Aumenta Fonte");
		diminuiFonte = new JButton("Diminui Fonte");
		
		comboFontes.setFont(fonteControle);
		checkNegrito.setFont(fonteControle);
		aumentaFonte.setFont(fonteControle);
		diminuiFonte.setFont(fonteControle);
		
		panelControle.add(comboFontes);
		panelControle.add(checkNegrito);
		panelControle.add(aumentaFonte);
		panelControle.add(diminuiFonte);
		
		add(panelControle, BorderLayout.NORTH);
		add(panelVisao);
	}
	
	
}
