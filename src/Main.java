import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Stan on 01.08.2016.
 */
//Есть List<String> names. Удалить из него все элементы включающие букву “S”
public class Main {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Stas");
        names.add("Kola");
        names.add("Vola");
        names.add("Dima");
        names.add("Petia");
        for (int i = 0; i <4 ; i++) {
            if (names.get(i).contains("S")){
                names.remove(i);
            }
        }
        names.sort(String::compareTo);
        System.out.println("lastIndexOf" + names);


    }
}
