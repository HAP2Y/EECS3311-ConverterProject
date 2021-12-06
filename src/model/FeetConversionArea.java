package model;

import javax.swing.*;
import java.awt.*;

public class FeetConversionArea extends JTextArea {
	final static int HEIGHT = 200;
	final static int WIDTH = 200;

	/**
	 * Instantiates a new rectangle to display Feet.
	 */
	public FeetConversionArea() {
		Rectangle rect = new Rectangle(10, 10, HEIGHT, WIDTH);
		this.setBounds(rect);
		this.setText(0 + " ft");
		this.setBackground(Color.green);
	}
	
	/**
	 * Update method to update the feet.
	 *
	 * @param feet of type double
	 */
	public void update(double feet){
        this.setText(feet + " ft");
    }
}
