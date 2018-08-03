package com.capgemini;

import java.util.Set;
import java.util.TreeSet;

//Test class for set creation and printing
public class CarTreeSet {

	public static void main(String args[]) {

		Set<Car1> Car1 = new TreeSet<>();

		Car1.add(new Car1("Ford", "Figo", 1972, 200000));
		Car1.add(new Car1("Tata", "Indigo", 2006, 800000));
		Car1.add(new Car1("Audi", "A4", 2006, 2500000));

		for (Car1 Car11 : Car1) {
			System.out.println(Car11);
		}
	}

}

//Details of a Car.
class Car1 implements Comparable<Car1> {

	String make;
	String model;
	int year;
	float price;

	public Car1(String make, String model, int year, float price) {

		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	@Override
	public int compareTo(Car1 Car1) {

		return this.make.compareTo(Car1.make);

	}

	@Override
	public String toString() {
		return "Car1 [make= " + make + ", model= " + model + ", year= " + year + ", price= Rs. " + price + "]";
	}

}