package hw11Abstraction;

public interface Hospital {

	public void emergencyRoom();

	public void surgeryRoom();

	public void cafeteria();

	public static void morgue() {

	}

	public default void pharmacy() {

	}

}
