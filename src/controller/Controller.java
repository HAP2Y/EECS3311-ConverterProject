package controller;

import model.ValueToConvert;
import view.Display;

public class Controller {
	Display display;
	ValueToConvert vtc;
	double meter;
	double feet;
	double cm;

	public Controller() {
		this.display = new Display();
		cm = Double.parseDouble(this.display.getCMText());
		
		this.vtc = new ValueToConvert(cm);
		this.meter = this.vtc.getMETER();
		this.feet = this.vtc.getFEET();
		display.updateValues(meter, feet);
		updateListener();
	}

	public void updateListener() {
		this.display.setListener(e -> {
			this.vtc.setCM(this.cm);
			this.display.updateValues(meter, feet);
		});
	}
}
