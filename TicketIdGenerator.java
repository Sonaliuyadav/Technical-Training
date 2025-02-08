import java.util.Random;

public class TicketIdGenerator {

    public static String generateTicketId(String customerName) {
      
        String baseId = "TKT_" + customerName + "-";

       
        Random random = new Random();
        int randomNumber = random.nextInt(9000) + 1000; // 9000 possible numbers (0-8999) + 1000 = 1000-9999


        String ticketId = baseId + randomNumber;

        return ticketId;
    }

    public static void main(String[] args) {
     
        String customer1 = "Alice";
        String customer2 = "Bob";

        String ticketId1 = generateTicketId(customer1);
        String ticketId2 = generateTicketId(customer2);

        System.out.println("Ticket ID for " + customer1 + ": " + ticketId1);
        System.out.println("Ticket ID for " + customer2 + ": " + ticketId2);
    }
}
