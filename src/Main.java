import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
            Scanner console = new Scanner(System.in);

            System.out.print("file #1 name? ");
            Scanner input1 = new Scanner(new File(console.nextLine())); //ask for file name "hamlet.txt"
            System.out.print("file #2 name? ");
            Scanner input2 = new Scanner(new File(console.nextLine())); //ask for file name "mobydick.txt"
            System.out.println();

            ArrayList<String> list1 = getWords(input1); //Takes the input and reads the file with that name "hamlet.txt"
            ArrayList<String> list2 = getWords(input2); //Takes the input and reads the file with that name "mobydick.txt"
        }

        public static ArrayList<String> getWords(Scanner input) {
            // read all words and sort
           Set<String> words = new TreeSet<>();
            while (input.hasNext()) {
                String next = input.next().toLowerCase(); // Makes all words lowercase to match
                words.add(next);
            }
            System.out.println(words.size()); //prints the size of the set words that cointains uniq words
            return new ArrayList<>(words); //Returns a new arratlist with the words found in the set
        }
    }
