package strategies;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by amen on 8/17/17.
 */
public class FileStrategy implements IInputStrategy {   // dane z pliku
    private Scanner scanner;
    public FileStrategy() {
        openFile();
    }

    private void openFile() {
        try {
            scanner = new Scanner(new FileReader("input.txt"));
        } catch (FileNotFoundException e) {
            System.err.println("Brak pliku.");
        }
    }

    @Override
    public int getInt() {
        Integer result = null;
        do {
            try {
                checkFile();
                result = scanner.nextInt();
            } catch (InputMismatchException ime) {
                System.err.println("Input mismatch: " + scanner.next());
            }
        } while (result == null);
        return result;
    }

    @Override
    public String getString() {
        checkFile();
        return scanner.next();
    }

    private void checkFile() {
        if (!scanner.hasNext()) {
            openFile();
        }
    }

    @Override
    public double getDouble() {
        Double result = null;
        do {
            try {
                checkFile();
                result = scanner.nextDouble();
            } catch (InputMismatchException ime) {
                System.err.println("Input mismatch." + scanner.next());
            }
        } while (result == null);
        return result;
    }

    @Override
    public void close() {
        scanner.close();
    }
}
