package model;

public class ValueToConvert {
	final double denoMETER = 100.00;
	final double denoFEET = 30.48;
	double METER;
	double FEET;

	public ValueToConvert(double cm) {
		this.FEET = 0.0;
		this.METER = 0.0;
	}

	public double getMETER(double cm) {
		this.METER = cm / this.denoMETER;
		return this.METER;
	}

	public double getFEET(double cm) {
		this.FEET = cm / this.denoFEET;
		return this.FEET;
	}
}
