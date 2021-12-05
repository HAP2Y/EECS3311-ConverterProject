package model;

import javax.swing.*;
import java.awt.*;

public class MeterConversionArea extends JTextArea {
	final static int HEIGHT = 200;
	final static int WIDTH = 200;

	public MeterConversionArea() {
		Rectangle rect = new Rectangle(220, 10, HEIGHT, WIDTH);
		this.setBounds(rect);
		this.setText("0");
		this.setBackground(Color.orange);
	}

	public void update(double meter){
        setText(meter + " ft");
    }
}
