//To perform operations of television remote
public class Television {

	boolean state; //State of T.V. whether On or Off
	int volume;//Volume of the T.V.
	int channel;//Channel Number of the T.V.

	int increaseVolume() {
		volume++;
		return volume;
	}

	int decreaseVolume() {
		volume--;
		return volume;
	}

	public boolean isState() {
		return state;
	}

	public int getVolume() {
		return volume;
	}

	public int getChannel() {
		return channel;
	}

	boolean stateOn() {
		state = true;
		return state;
	}

	boolean stateOff() {
		state = false;
		return state;
	}

	int setChannel(int channel) {
		this.channel = channel;
		return channel;
	}

	int increaseChannel() {
		channel++;
		return channel;
	}

	int decreaseChannel() {
		channel--;
		return channel;
	}

}
