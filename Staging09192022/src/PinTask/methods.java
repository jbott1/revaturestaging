package PinTask;

public class methods {

	public static boolean validate(String pin) {

		boolean validPin = false;

		if (pin.length() == 4 || pin.length() == 6) {

			if (pin.matches(("[0-9]+"))) {

				validPin = true;

			}

		}

		return validPin;

	}

}
