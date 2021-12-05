package model;

import javax.swing.*;
import java.awt.*;

public class FeetConversionArea extends JTextArea {
	final static int HEIGHT = 200;
	final static int WIDTH = 200;

	public FeetConversionArea() {
		Rectangle rect = new Rectangle(10, 10, HEIGHT, WIDTH);
		this.setBounds(rect);
		this.setText("0");
		this.setBackground(Color.green);
	}
	
	public void update(double feet){
        setText(feet + " ft");
    }
}
