import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Arrays;
import java.util.List;

public class App {
 public static void main(String[] args) {
        Concert concert1 = new Concert(1, "Rock Night", "A night of rock music", LocalDate.of(2025, 1, 25), LocalTime.of(19, 0));
        Workshop workshop1 = new Workshop(2, "Art Workshop", "Learn painting techniques", LocalDate.of(2025, 1, 26), LocalTime.of(10, 0));

        Category musicCategory = new Category("Music", "Music events and concerts");
        musicCategory.addEvent(concert1);

        Category artCategory = new Category("Art", "Workshops and art events");
        artCategory.addEvent(workshop1);

        musicCategory.getCategoryInfo();
        artCategory.getCategoryInfo();

        List<Event> allEvents = Arrays.asList(concert1, workshop1);
        Report report = new Report(allEvents);

        System.out.println("Events from 2025-01-24 to 2025-01-26:");
        List<Event> dateFilteredEvents = report.generateReportByDate(LocalDate.of(2025, 1, 24), LocalDate.of(2025, 1, 26));
        for (Event event : dateFilteredEvents) {
            System.out.println(event.getDetails());
        }

        System.out.println("\nSearch for events containing 'Art':");
        List<Event> nameFilteredEvents = report.findEventByName("Art");
        for (Event event : nameFilteredEvents) {
            System.out.println(event.getDetails());
        }

        System.out.println("\nEvent with ID 1:");
        Event foundEvent = report.findEventById(1);
        if (foundEvent != null) {
            System.out.println(foundEvent.getDetails());
        } else {
            System.out.println("Event not found.");
        }
    }
}
