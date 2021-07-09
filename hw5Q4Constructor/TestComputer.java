package hw5Q4Constructor;

public class TestComputer {

	public static void main(String[] args) {
		Computer com1 = new Computer();
		Computer com2 = new Computer("Apple", "MacBookAir", "MacOS Mojave", 800, 'C', false);
		Computer com3 = new Computer("Apple", "MacBook Pro", "MacOS BigSur", 1400, 'B', true);
		Computer com4 = new Computer("HP");
		Computer com5 = new Computer("HP", "Laptop 500", 1000);
		Computer com6 = new Computer("Apple", "MacOS BigSur", 1400, true, 'A');

	}

}
