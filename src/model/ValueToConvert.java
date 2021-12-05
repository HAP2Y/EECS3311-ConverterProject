package model;

public class ValueToConvert {
	final double denoMETER = 100.00;
	final double denoFEET = 30.48;
	double CM;
	double METER;
	double FEET;

	public ValueToConvert(double cm) {
		CM = cm;
	}

	public double getCM() {
		return CM;
	}

	public void setCM(double cm) {
		CM = cm;
	}

	public double getMETER() {
		METER = CM / denoMETER;
		return METER;
	}

	public void setMETER(double meter) {
		METER = meter;
	}

	public double getFEET() {
		FEET = CM / denoFEET;
		return FEET;
	}

	public void setFEET(double feet) {
		FEET = feet;
	}
	
	
}
