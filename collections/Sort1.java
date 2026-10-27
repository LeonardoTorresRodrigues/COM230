import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Sort1 {
    private static final String suits[] = { "Hearts", "Diamonds", "Clubs", "Spades" };

    public void printElements() { // exibe elementos do array
        List<String> list = Arrays.asList(suits);
        System.out.printf("Unsorted array elements:\n%s\n", list);
        Collections.sort(list); // classifica ArrayList
        System.out.printf("Sorted array elements;\n%s\n", list); // gera saída da lista
    } // fim do método printElements

    public static void main(String args[]) {
        Sort1 sort1 = new Sort1();
        sort1.printElements();
    } // fim do main
} // fim da classe Sort1