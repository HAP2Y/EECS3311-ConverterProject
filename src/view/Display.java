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
	private static FeetConversionArea FEET = new FeetConversionArea();
	private static MeterConversionArea METER = new MeterConversionArea();
	private static CentimetersConversionArea CM = new CentimetersConversionArea();
	static JMenuItem listener;
	static JMenuBar menubar;
    static JMenu menu;
    static JPanel panel;
	
	public Display() {		
		this.setBounds(0, 0, HEIGHT, WIDTH);
		this.setTitle("");
		this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		menubar = new JMenuBar();
		panel = new JPanel();
		menu = new JMenu("Update Model");
		listener = new JMenuItem("Save input centimeters");
		
		menubar.add(menu);
		menu.add(listener);
		
		this.setJMenuBar(menubar);
		this.add(FEET);
		this.add(METER);
		this.add(CM);
		this.add(panel);
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
