public class ArrayOfBottlesOfBeer {
	public static void main(String[] args) {
		int numberOfBottles = 100;
		int numberOfDrinkers = 4;

		int[] drinkingRounds = new int[numberOfBottles / numberOfDrinkers];
		for (int i = 0; i < drinkingRounds.length; i++) {
			drinkingRounds[i] = numberOfBottles - (i * numberOfDrinkers);
		}

		System.out.println("Hello World!");
		for (int i = 0; i < drinkingRounds.length; i++) {
			System.out.println();
			int beersLeft = drinkingRounds[i];
			System.out.println(beersLeft + " bottles of beer on the wall, " + beersLeft + " bottles of beer.");
			for (int beersInRound = 1; beersInRound <= numberOfDrinkers; beersInRound++) {
				if (beersLeft - beersInRound > 0) {
					System.out.println(
							"Take one down and pass it around - " + (beersLeft - beersInRound) + " bottles of beer on the wall.");
				} else {
					System.out.println("Take it down and pass it around - no more bottles of beer on the wall.");
				}
			}
		}
	}
}