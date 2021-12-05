package view;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import java.awt.event.*;
import model.CentimetersConversionArea;
import model.FeetConversionArea;
import model.MeterConversionArea;

public class Display extends JFrame {
	final static int HEIGHT = 600;
	final static int WIDTH = 600;
	private static final FeetConversionArea FEET = new FeetConversionArea();
	private static final MeterConversionArea METER = new MeterConversionArea();
	private static final CentimetersConversionArea CM = new CentimetersConversionArea();
	private final JMenuItem listener;
	
	public Display() {		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Update Model");
		JPanel panel = new JPanel();

		this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.listener = new JMenuItem("Save input centimeters");
		this.add(menu);
		this.setJMenuBar(menuBar);
		this.add(listener);
		this.add(FEET);
		this.add(METER);
		this.add(CM);
		this.add(panel);
		
		this.setBounds(0,0, HEIGHT, WIDTH);
		this.setTitle("");
		this.setVisible(true);
	}
	
	public void setListener(ActionListener e) {
		listener.addActionListener(e);
	}
	
	public void updateValues(double meter, double feet) {
		METER.update(meter);
		FEET.update(feet);
	}

	public String getCMText() {
		return CM.getText();
	}
}
