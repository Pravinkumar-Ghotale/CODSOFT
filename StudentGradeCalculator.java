import java.util.*;

public class StudentGradeCalculator {
    public static void main(String arg[]) {
        int Marks[] = new int[6];
        int Total_Marks = 0;
        float Avg = 0;

        Scanner Sobj = new Scanner(System.in);

        int i = 0;

        while (i < 6) {
            System.out.println("Enter Marks of subject " + (i + 1) + " is ");
            Marks[i] = Sobj.nextInt();

            Total_Marks = Total_Marks + Marks[i];

            i++;
        }
        System.out.print("Total Marks are : " + Total_Marks + "\n");

        Avg = Total_Marks / 6;

        System.out.print("Avg Marks are : " + Avg + "\n");

        if (Avg >= 80) {
            System.out.println("Student passed with 'A' Grade");
        } else if (Avg < 80 && Avg >= 60) {
            System.out.println("Student passed with 'B' Grade");
        } else if (Avg < 60 && Avg >= 40) {
            System.out.println("Student passed with 'C' Grade");
        } else {
            System.out.println("Student passed with 'D' Grade");
        }

    }
}