package PinTask;

public class Main {

	public static void main(String[] args) {

		/*
		 * validate("121317") -- true validate("1234") -- true validate("45135") --
		 * false validate("89abc1") -- false validate("900876") -- true validate("
		 * 4983") -- false
		 */

		System.out.println(validate("121317"));
		System.out.println(validate("1234"));
		System.out.println(validate("45135"));
		System.out.println(validate("89abc1"));
		System.out.println(validate("900876"));
		System.out.println(validate(" 4983"));

		System.out.println("Methods class: " + methods.validate("123456"));

	}

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
