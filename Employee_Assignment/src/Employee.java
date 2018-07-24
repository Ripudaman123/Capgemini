//To calculate various components of salary
public class Employee {

	static int id;
	String name;
	static double monthlyBasic;

	
	static double getAnnualBasic() {
		return 12 * monthlyBasic;
	}

	static double getMonthlyGrossSalary() {
		return monthlyBasic + (50 / 100) * monthlyBasic + 1250 + 800;
	}

	static double getAnnualGrossSalary() {
		return 12 * (monthlyBasic + (50 / 100) * monthlyBasic + 1250 + 800);
	}

	static double getMonthlyDeductions() {
		double pf, esic, proftax;
		if ((10 / 100) * monthlyBasic < 6500) {
			pf = (10 / 100) * monthlyBasic;
		} else
			pf = 6500;
		if (monthlyBasic <= 5000) {
			esic = (4.75 / 100) * monthlyBasic;
		} else {
			esic = (8.75 / 100) * monthlyBasic;
		}
		if (monthlyBasic <= 10000) {
			proftax = 50;
		} else {
			proftax = 100;
		}
		return pf + esic + proftax;
	}

	static double getMonthlyTakeHome() {
		return (getMonthlyGrossSalary() - getMonthlyDeductions());
	}

	static double getAnnualTakeHome() {
		return (12 * getMonthlyTakeHome());
	}

	// To test the Employee class
	public static void main(String[] args) {

		monthlyBasic = 10000;

		System.out.println("Annual Basic " + getAnnualBasic());
		System.out.println("Monthly Gross " + getMonthlyGrossSalary());
		System.out.println("Annual Gross " + getAnnualGrossSalary());
		System.out.println("Monthly Deduction " + getMonthlyDeductions());
		System.out.println("Monthly Take Home " + getMonthlyTakeHome());
		System.out.println("Annual Take Home " + getAnnualTakeHome());

	}

}
