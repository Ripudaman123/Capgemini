//To calculate population density of 2 countries and print the max 
public class Country {

	String name;
	int population;
	double area;

	public String getName() {
		return name;
	}

	public int getPopulation() {
		return population;
	}

	public void setPopulation(int population) {
		this.population = population;
	}

	public double getArea() {
		return area;
	}

	public void setArea(double area) {
		this.area = area;
	}

	double largestArea(double area1, double area2) {
		area = area1 > area2 ? area1 : area2;
		return area;
	}

	int largestPopulation(int population1, int population2) {
		population = population1 > population2 ? population1 : population2;
		return population;
	}

	static Country maxPopulationDensity(Country country1, Country country2) {
		Country country = new Country();
		if (country1.population / country1.area > country2.population / country2.area) {
			country = country1;
		} else {
			country = country2;
		}
		return country;
	}

	public void setName(String name2) {
		this.name = name2;
	}

	@Override
	public String toString() {
		return "Country [name=" + name + ", population=" + population + ", area=" + area + "]";
	}

}
