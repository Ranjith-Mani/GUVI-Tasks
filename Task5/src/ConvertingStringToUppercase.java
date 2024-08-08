import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConvertingStringToUppercase
{
    public static void main(String[] args)
    {
        //Converting strings to uppercase
        List <String> upperCase = Stream.of("aBc", "d", "ef")
                                        .map(String::toUpperCase)
                                        .collect(Collectors.toList());
        //Print the uppercased strings
        System.out.println(upperCase);
    }
}
