package codingexercise;


class AsciiToInteger {

	public static void main(String[] args) {

		System.out.println(Atoi("-56657"));

	}

	public static int Atoi(String str) {

		int res = 0;

		boolean isNegative = false;

		str = str.trim();

		char[] chars = str.toCharArray();

		int index = 0;

		if (chars[index] == '-') {

			isNegative = true;

			index++;

		}

		while (index < chars.length && chars[index] >= '0' && chars[index] <= '9') {

			res = res * 10 + chars[index] - '0';//'1'-'0'=

			index++;

		}

		return isNegative ? -1 * res : res;

	}

}