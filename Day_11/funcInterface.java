import java.util.function.Supplier;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;

public class funcInterface{
    public static void main(String[] args) {

        
        Supplier<String> usernameGenerator = () -> "Coder_2026";
        String username = usernameGenerator.get();
        System.out.println("1. Generated Username: " + username);


       
        Predicate<String> isValidUser = (name) -> name.length() > 5;
        boolean status = isValidUser.test(username);
        System.out.println("2. Is username valid? " + status);


        
        Function<String, String> welcomeMessage = (name) -> "Welcome to Java, " + name + "!";
        String finalMessage = welcomeMessage.apply(username);
        System.out.println("3. Transformed Message: " + finalMessage);


      
        Consumer<String> displayer = (msg) -> System.out.println("4. Consumer Output -> " + msg);
        displayer.accept(finalMessage);
    }
}
