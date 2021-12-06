package controller;

import model.ValueToConvert;
import view.Display;

public class Controller {
	static Display display;
	static ValueToConvert vtc;
	static double meter;
	static double feet;
	static double cm;

	/**
	 * Instantiates a new controller.
	 */
	public Controller() {
		display = new Display();
		vtc = new ValueToConvert(Double.parseDouble(display.getCMText()));
		
		display.setListener(e -> {
			cm = Double.parseDouble(display.getCMText());
			meter = vtc.getMETER(cm);
			feet = vtc.getFEET(cm);
			display.updateValues(meter, feet);
		});
	}

	public void updateListener() {
		
	}
}
