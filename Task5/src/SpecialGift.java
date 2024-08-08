import java.util.List;
import java.util.ArrayList;
import java.util.stream.Collectors;

public class SpecialGift
{
    public static void main(String[] args)
    {
        List <String> students = new ArrayList<>();

        students.add("Aron");
        students.add("Alex");
        students.add("Bliss");
        students.add("Ben");
        students.add("Alice");
        students.add("Chad");
        students.add("David");
        students.add("Elsa");
        students.add("Fin");
        students.add("Gal");

        List <String> studentsGetsSpecialGift = students.stream()
                                                        .filter(name -> name.startsWith("A"))
                                                        .collect(Collectors.toList());

        System.out.println("Students receiving special gifts are : " + studentsGetsSpecialGift);
    }
}
