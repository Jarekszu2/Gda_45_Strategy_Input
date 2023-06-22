package strategies;


import java.util.Scanner;

/**
 * Created by amen on 8/17/17.
 */
public class StdInStrategy implements IInputStrategy {  // standardowe wejście (dane z konsoli)
    Scanner scanner = new Scanner(System.in);
    public StdInStrategy() {
    }

    @Override
    public int getInt() {
        System.out.println("Wpisz inta:");
        return scanner.nextInt();
    }

    @Override
    public String getString() {
        System.out.println("Wpisz Stringa:");
        return scanner.next();
    }

    @Override
    public double getDouble() {
        System.out.println("Wpisz doubla:");
        return scanner.nextDouble();
    }

    @Override
    public void close() {
        scanner.close();
    }
}
