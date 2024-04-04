package org.launchcode;
import java.util.Scanner;

public class Alice {

    public static void main(String[] args) {
        Alice alice = new Alice();
        String searchTerm = alice.askUserForSearchTerm();
        Boolean myReturnedResult = alice.searchAliceQuote(searchTerm);
        if (myReturnedResult) {
            alice.getWordIndex(searchTerm);
            alice.removeWordFromQuote(searchTerm);
        }
        System.out.println("Your search term is: " + myReturnedResult);
    }

    public void removeWordFromQuote(String searchTerm) {
        String quote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
        String quoteLowerCase = quote.toLowerCase();
        String searchTermLowerCase = searchTerm.toLowerCase();

        String modifiedSentence = quoteLowerCase.replace(searchTermLowerCase, "");
        System.out.println(modifiedSentence);

    }

    public void getWordIndex(String searchTerm){
        String quote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
        String quoteLowerCase = quote.toLowerCase();
        String searchTermLowerCase = searchTerm.toLowerCase();

        int theIndex = quoteLowerCase.indexOf(searchTermLowerCase);
        System.out.println("The index is: " + theIndex + " and the length is: " + searchTermLowerCase.length());
    }



    public String askUserForSearchTerm() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your search term:");

        String searchTerm = scanner.nextLine();
        System.out.println("Your search term is: " + searchTerm);
        scanner.close();
        return searchTerm;
    }


public boolean searchAliceQuote(String searchTerm){
        String quote = "Alice was beginning to get very tired of sitting by her sister on the bank, and of having nothing to do: once or twice she had peeped into the book her sister was reading, but it had no pictures or conversations in it, ‘and what is the use of a book,’ thought Alice ‘without pictures or conversation?’";
        String quoteLowerCase = quote.toLowerCase();
        String searchTermLowerCase = searchTerm.toLowerCase();
        Boolean result = quoteLowerCase.contains(searchTermLowerCase);
        return result;
}
}
