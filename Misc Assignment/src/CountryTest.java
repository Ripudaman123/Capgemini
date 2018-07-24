import java.util.Scanner;
//To test the Country Class
public class CountryTest {

	public static void main(String[] args) {

		Country country1 = new Country();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of countries");
		int number = scanner.nextInt();
		
		String names[] = new String[number];
		double areas[] = new double[number];
		int populations[] = new int[number];

		Country country[] = new Country[number];
		int i;
		
		for (i = 0; i < number; i++) {
			System.out.println("Enter Country name, area and population ");
			country[i] = new Country();
			names[i] = scanner.next();
			areas[i] = scanner.nextDouble();
			populations[i] = scanner.nextInt();

			country[i].setName(names[i]);
			country[i].setArea(areas[i]);
			country[i].setPopulation(populations[i]);
		}

		double largestArea = 0.0;
		int largestPopulation = 0;
		
		for (int j = 0; j < number; j++) {

			largestArea = country1.largestArea(largestArea, country[j].getArea());

			largestPopulation = country1.largestPopulation(largestPopulation, country[j].getPopulation());

			country1 = Country.maxPopulationDensity(country1, country[j]);

		}
		System.out.println("Largest Area: " + largestArea);
		System.out.println("Largest Population: " + largestPopulation);
		System.out.println("Country with maximum Population density: " + country1);
	}

}
