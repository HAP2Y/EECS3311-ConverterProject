package model;

import javax.swing.*;
import java.awt.*;

public class MeterConversionArea extends JTextArea {
	final static int HEIGHT = 200;
	final static int WIDTH = 200;

	/**
	 * Instantiates a new rectangle to display Meters.
	 */
	public MeterConversionArea() {
		Rectangle rect = new Rectangle(220, 10, HEIGHT, WIDTH);
		this.setBounds(rect);
		this.setText(0 + " m");
		this.setBackground(Color.orange);
	}

	/**
	 * Update method to update the feet.
	 *
	 * @param meter of type double
	 */
	public void update(double meter){
        this.setText(meter + " m");
    }
}
