import java.util.Scanner;

//To test the television class
public class TelevisionTest {

	public static void main(String args[]) {
		Television television = new Television();
		int choice;
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter 1. to increase volume " + "\n    2. to decrease volume" + "\n    3. to switch on"
				+ "\n    4. to switch off" + "\n    5. to set channel" + "\n    6. to increase channel"
				+ "\n    7. to decrease channel" + "\n    8. to get information of TV");
		choice = scanner.nextInt();
        //Accessing the methods according to user choice
		while (choice != 0) {
			switch (choice) {
			case 1:
				System.out.println("Volume: " + television.increaseVolume());
				break;
			case 2:
				System.out.println("Volume: " + television.decreaseVolume());
				break;
			case 3:
				System.out.println("State :" + television.stateOn());
				break;
			case 4:
				System.out.println("State :" + television.stateOff());
				return;
			case 5:
				System.out.println("Enter channel number");
				int channel = scanner.nextInt();
				System.out.println("Channel :" + television.setChannel(channel));
				break;
			case 6:
				System.out.println("Channel :" + television.increaseChannel());
				break;
			case 7:
				System.out.println("Channel :" + television.decreaseChannel());
				break;
			case 8:
				System.out.println("Volume: " + television.getVolume());
				System.out.println("State :" + television.isState());
				System.out.println("Channel :" + television.getChannel());
				break;
			default:
				System.out.println("Enter valid number");
			}
			System.out.println("Enter 1. to increase volume " + "\n    2. to decrease volume" + "\n    3. to switch on"
					+ "\n    4. to switch off" + "\n    5. to set channel" + "\n    6. to increase channel"
					+ "\n    7. to decrease channel" + "\n    8. to get information of TV");
			choice = scanner.nextInt();
		}
		scanner.close();
	}
}
