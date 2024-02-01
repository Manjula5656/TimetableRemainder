

import javax.security.auth.Subject;
import java.util.ArrayList;
import java.util.Scanner;

    public class Timetable {
        public Timetable(String text) {

        }

        public static void main(String[] args) {
            String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
            String[] times = {"09:00 - 10:00", "10:00 - 11:00", "11:00 - 12:00", "12:00 - 01:00", "01:00 - 01:45", "01:45 - 02:40", "02:40 - 03:35", "03:35 - 04:30"};
            String [] names = {"Bhanu", "Brindha", "Chinna", "Manju", "Nandy","Swe","Sj","Divya"};
            ArrayList<String> subjects = new ArrayList<String>();
            Scanner scanner = new Scanner(System.in);
            int index = 0;
            System.out.println("Timetable creator ");
            for (String date : days)
                System.out.println("\nRoutine for " + date + "\n");
            for (String time : times) {
                System.out.println(time);
                String input = scanner.nextLine();
                String s = String.valueOf(input);
            }
            for (String day : days) {
                System.out.println("\n Routine for " + day + "\n");
                String Subjects = null;
            }
            for (String name : names) {
                System.out.println("\n Routine for " + name + "\n" );
                scanner.nextLine();
            }
        }
    }



