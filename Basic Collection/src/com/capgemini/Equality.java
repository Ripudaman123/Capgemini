package com.capgemini;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

//To test for Equality by implementing hashcode and equals.
public class Equality {

	public static void main(String[] args) {

		// Test Class to test the ArrayList of different types.
		Set<Laptop> laptop = new HashSet<>();

		laptop.add(new Laptop("HP", "pavillion"));
		laptop.add(new Laptop("Dell", "inspiron"));
		for (Laptop laptop1 : laptop) {
			System.out.println(laptop1);
		}

		Set<Car> car = new HashSet<>();

		car.add(new Car("Honda", "Honda City"));
		car.add(new Car("Audi", "A4"));
		car.add(new Car("Audi", "A4"));

		for (Car car1 : car) {
			System.out.println(car1);
		}

		Set<Television> television = new HashSet<>();

		television.add(new Television("Samsung", "LCD", 12000));
		television.add(new Television("Sony", "Plasma", 50000));
		television.add(new Television("Samsung", "LCD", 12000));

		for (Television television1 : television) {
			System.out.println(television1);
		}

		Set<Cellphone> cellphone = new HashSet<>();

		cellphone.add(new Cellphone("Samsung", "S8", "android"));
		cellphone.add(new Cellphone("One Plus", "One Plus 5", "android"));
		cellphone.add(new Cellphone("One Plus", "One Plus 6", "android"));

		for (Cellphone cellphone1 : cellphone) {
			System.out.println(cellphone1);
		}

		Set<School> school = new HashSet<>();

		school.add(new School("DAV", "Delhi", "New Delhi"));
		school.add(new School("SBS", "Jaipur", "Jaipur"));
		school.add(new School("HFS", "Thane", "Thane"));

		for (School school1 : school) {
			System.out.println(school1);
		}

	}

}

class Laptop {

	String company;
	String model;

	public Laptop(String company, String model) {
		this.company = company;
		this.model = model;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Laptop other = (Laptop) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Laptop [company=" + company + ", model=" + model + "]";
	}

}

class Car {

	String make;
	String model;

	public Car(String make, String model) {
		this.make = make;
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((make == null) ? 0 : make.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Car other = (Car) obj;
		if (make == null) {
			if (other.make != null)
				return false;
		} else if (!make.equals(other.make))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		return true;
	}

}

class Television {

	String company;
	String type;
	float price;

	public Television(String company, String type, float price) {

		this.company = company;
		this.type = type;
		this.price = price;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + Float.floatToIntBits(price);
		result = prime * result + ((type == null) ? 0 : type.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Television other = (Television) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (Float.floatToIntBits(price) != Float.floatToIntBits(other.price))
			return false;
		if (type == null) {
			if (other.type != null)
				return false;
		} else if (!type.equals(other.type))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Television [company=" + company + ", type=" + type + ", price=" + price + "]";
	}

}

class Cellphone {
	String company;
	String model;
	String operatingSystem;

	public Cellphone(String company, String model, String operatingSystem) {

		this.company = company;
		this.model = model;
		this.operatingSystem = operatingSystem;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((company == null) ? 0 : company.hashCode());
		result = prime * result + ((model == null) ? 0 : model.hashCode());
		result = prime * result + ((operatingSystem == null) ? 0 : operatingSystem.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cellphone other = (Cellphone) obj;
		if (company == null) {
			if (other.company != null)
				return false;
		} else if (!company.equals(other.company))
			return false;
		if (model == null) {
			if (other.model != null)
				return false;
		} else if (!model.equals(other.model))
			return false;
		if (operatingSystem == null) {
			if (other.operatingSystem != null)
				return false;
		} else if (!operatingSystem.equals(other.operatingSystem))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Cellphone [company=" + company + ", model=" + model + ", operatingSystem=" + operatingSystem + "]";
	}

}

class School {

	String name;
	String city;
	String schooldistrict;

	public School(String name, String city, String schooldistrict) {

		this.name = name;
		this.city = city;
		this.schooldistrict = schooldistrict;

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((schooldistrict == null) ? 0 : schooldistrict.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		School other = (School) obj;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (schooldistrict == null) {
			if (other.schooldistrict != null)
				return false;
		} else if (!schooldistrict.equals(other.schooldistrict))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "School [name=" + name + ", city=" + city + ", schooldistrict=" + schooldistrict + "]";
	}

}
