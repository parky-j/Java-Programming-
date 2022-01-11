class Car{
	int gasolineGauge;
	Car(int gasolineGauge){
		this.gasolineGauge=gasolineGauge;
	}
}

class HybridCar extends Car{
	int electricGauge;
	HybridCar(int gasolineGauge, int electricGauge){
		super(gasolineGauge);
		this.electricGauge=electricGauge;
	}
}

class HybridWaterCar extends HybridCar{
	int waterGauge;
	HybridWaterCar(int gasolineGauge, int electricGauge, int waterGauge){
		super(gasolineGauge, electricGauge);
		this.waterGauge=waterGauge;
	}
	public void showCurrentGauge(){
		System.out.println("remaining gasolin: "+gasolineGauge);
		System.out.println("remaining electric: "+electricGauge);
		System.out.println("remaining water: "+waterGauge);
	}
}

class question14{
	public static void main(String[] args){
		HybridWaterCar car = new HybridWaterCar(80,100,70);
		car.showCurrentGauge();
	}
}
