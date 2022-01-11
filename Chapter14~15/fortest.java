class Car{
}

class SuperCar extends Car{
}

class fortest{
	public static void main(String[] args){
		Car car = new Car();
		SuperCar scar = new SuperCar();
		test(car);
		test(scar);
	}
	public static void test(Car a){
		System.out.println(a);
	}
}