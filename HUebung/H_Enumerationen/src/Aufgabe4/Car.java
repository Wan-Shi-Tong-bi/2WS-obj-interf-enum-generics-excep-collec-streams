package Aufgabe4;

public class Car {

	color color;
	String type;
	int yearOfConstruction;
	int km;

	public Car() {

	}

	public Car(color color, String type, int yearOfConstruction, int km) {
		this.color = color;
		this.type = type;
		this.yearOfConstruction = yearOfConstruction;
		this.km = km;
	}

	@Override
	public String toString() {
		return "Car{" + "color=" + color + ", type=" + type + ", yearOfConstruction=" + yearOfConstruction + ", km=" + km + '}';
	}
}
