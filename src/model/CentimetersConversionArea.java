package model;

import javax.swing.*;
import java.awt.*;

public class CentimetersConversionArea extends JTextArea {
	final static int HEIGHT = 200;
	final static int WIDTH = 200;
	
	public CentimetersConversionArea() {
		Rectangle rect = new Rectangle(110, 220, HEIGHT, WIDTH);
		this.setBounds(rect);
		this.setText("0");
		this.setBackground(Color.yellow);
	}
}
