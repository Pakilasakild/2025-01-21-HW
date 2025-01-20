import java.time.LocalDate;
import java.time.LocalTime;

public class App {
    public static void main(String[] args) throws Exception {
        Category category = new Category("Hello", "hell nah");
        Concert e1 = new Concert(64, "sure", "Nop", LocalDate.of(2025, 4, 15), LocalTime.of(13, 15, 0));
        Workshop e2 = new Workshop(1, "komputer", "Make komputer", LocalDate.of(2025, 5, 30), LocalTime.of(12, 35, 0));
        category.addEvent(e1);
        category.addEvent(e2);
        System.out.println(category.getCategoryInfo());

    }
}
