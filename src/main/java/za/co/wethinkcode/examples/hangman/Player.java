package za.co.wethinkcode.examples.hangman;

import javax.swing.table.TableRowSorter;
import java.io.InputStream;
import java.util.Scanner;

public class Player {
    private boolean quit = false;
    private int chances = 5;
    private final Scanner scanner;
    public int getChances() {
        return chances;
    }

    public void lostChance() {
        this.chances --;
    }

    public boolean hasNoChances() {
        return this.getChances() == 0;
    }

    public Player(InputStream in) {
        this.scanner = new Scanner(in);
    }

    public Player() {
        this.scanner = new Scanner(System.in);
    }

    public String getWordsFile() {
        String filename = scanner.nextLine();
        return filename.isBlank() ? "short_words.txt" : filename;
    }

    public String getWordsFake(String words) {
        return words;
    }

    public String getGuess() {
        String text = scanner.nextLine();
        if (text.equalsIgnoreCase("exit")) {
            this.quit = true;
        } else {
            if (text.equalsIgnoreCase("quit")) {
                this.quit = true;
            }
        }
        return text;
    }

    public boolean wantsToQuit() {
        return this.quit;
    }



}
