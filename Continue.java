package classes;

public class Continue {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue; // Skip the current iteration when i equals 5
            }
            System.out.println(i);
        }
        System.out.println("Loop ended with continue.");
	}

}
