import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CheckingStringIsEmptyOrNot
{
    public static void main(String[] args)
    {
        List<String> stringList= Arrays.asList("abc", "", "bc", "efg", "ab cd", "", "jkl");

        // Filter the list to get only non-empty strings
        List<String> nonEmptyStrings = stringList.stream()
                                                 .filter(s -> ! s.isEmpty())
                                                 .collect(Collectors.toList());

        // Print the list of non-empty strings
        System.out.println(nonEmptyStrings);
    }
}