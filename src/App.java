import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        boolean isDuplicate = false;

        List <String> firstArray = new ArrayList<>();
        firstArray.add("Morango");
        firstArray.add("Uva");
        firstArray.add("Acerola");
        firstArray.add("Manga");

        List <String> secondArray = new ArrayList<>();
        secondArray.add("Pêra");
        secondArray.add("Caju");
        secondArray.add("Morango");
        secondArray.add("Kiwi");

        for (int i = 0; i < firstArray.size(); i++) {
            String element = firstArray.get(i);

            if (secondArray.contains(element)) {
                    System.out.println(element);
                    isDuplicate = true;
            }
        }

        if (!isDuplicate) {
            System.out.println("Não há itens duplicados!");
        }
    }
}