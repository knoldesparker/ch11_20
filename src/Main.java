import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) throws FileNotFoundException{
            Scanner console = new Scanner(System.in);


            System.out.print("file #1 name? ");
            Scanner input1 = new Scanner(new File(console.nextLine()));
            System.out.print("file #2 name? ");
            Scanner input2 = new Scanner(new File(console.nextLine()));
            System.out.println();

            ArrayList<String> list1 = getWords(input1);
            ArrayList<String> list2 = getWords(input2);


        }
        public static ArrayList<String> getWords(Scanner input) {
            // read all words and sort
           Set<String> words = new TreeSet<>();
            while (input.hasNext()) {
                String next = input.next().toLowerCase();
                words.add(next);
            }
            System.out.println(words.size());
            return new ArrayList<>(words);
        }
    }
