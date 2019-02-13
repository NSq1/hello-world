public class BottlesOfBeer {
	public static void main(String[] args) {
		System.out.println("Hello World!");
		for (int i = 99; i > 1;) {
			System.out.println(i + " bottles of beer on the wall, " + i + " bottles of beer. \nTake one down and pass it around - " + --i + " bottles of beer on the wall.\n");
		}
		System.out.println("1 bottle of beer on the wall, 1 bottle of beer. \nTake it down and pass it around - no more bottles of beer on the wall.");
	}
}