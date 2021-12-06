package model;

public class ValueToConvert {
	final double denoMETER = 100.00;
	final double denoFEET = 30.48;
	double METER;
	double FEET;
	
	// Constructor to initialize the feet and meter to 0.0
	public ValueToConvert(double cm) {
		this.FEET = 0.0;
		this.METER = 0.0;
	}

	// method to get the meter value of input centimeter
	public double getMETER(double cm) {
		this.METER = cm / this.denoMETER;
		return this.METER;
	}

	// method to get the feet value of input centimeter
	public double getFEET(double cm) {
		this.FEET = cm / this.denoFEET;
		return this.FEET;
	}
}
