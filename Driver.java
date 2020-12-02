package assignmentFinal;
import java.util.Scanner;
public class Driver {
    public static void main(String args []){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the name of the first task");
        String tn = s.nextLine();
        System.out.println("Enter the priority of the first  task (high/low)");
        String tp = s.nextLine();
        Task t = new Task(tn, tp);
        System.out.println("Enter the name of the second task");
        tn = s.nextLine();
        System.out.println("Enter the priority of the second  task (high/low)");
        tp = s.nextLine();
        Task t2 = new Task("Celebrate end of term", "low");
        System.out.println("To-do List:\n" + t.toString() + "\n" + t2.toString());
    }
}
