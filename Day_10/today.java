import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class today{

    public static void main(String[] args){
    LocalDateTime now = LocalDateTime.now();

DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm");

String result = now.format(format);
System.out.println(result);
    }
}