package soru4;

public class CarInsurance extends Insurance {

	@Override
	double calculate(double ratio) {

		return super.ücret * ratio;
	}

}
