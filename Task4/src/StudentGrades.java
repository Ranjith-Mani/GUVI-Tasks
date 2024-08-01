//Imports
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

//StudentGrades class
public class StudentGrades
{
        private final Map<String,Integer> grades;

        public StudentGrades()
        {
            grades = new HashMap<>();
        }

        public void addStudent(String name, int grade)
        {
            grades.put(name, grade);
            System.out.println("Added student: " + name + " with grade: " + grade);
        }

        public void removeStudent(String name)
        {
            if (grades.containsKey(name))
            {
                grades.remove(name);
                System.out.println("Removed student: " + name);
            }
            else
            {
                System.out.println("Student " + name + " not found.");
            }
        }

        public void displayGrade(String name)
        {
            Integer grade = grades.get(name);
            if (grade != null)
            {
                System.out.println(name + "'s grade is: " + grade);
            }
            else
            {
                System.out.println("Student " + name + " not found.");
            }
        }

        //Main class
        public static void main(String[] args)
        {
            StudentGrades sg = new StudentGrades();

            System.out.println("____________________________________________");
            System.out.println("STUDENT GRADING AND DATABASE");
            System.out.println("____________________________________________");
            Scanner student = new Scanner(System.in);
            //To enter the name of the student
            System.out.println("Enter students name : ");
            String name1 = student.next();
            String name2 = student.next();
            String name3 = student.next();
            System.out.println();
            //To enter the grade of the student
            System.out.println("Enter students grade : ");
            int grade1 = student.nextInt();
            int grade2 = student.nextInt();
            int grade3 = student.nextInt();
            //To add students
            System.out.println("____________________________________________");
            System.out.println("Adding students : ");
            System.out.println();
            sg.addStudent(name1,grade1);
            sg.addStudent(name2,grade2);
            sg.addStudent(name3,grade3);
            //To display student's grade
            System.out.println("____________________________________________");
            System.out.println("Displaying student's grade : ");
            System.out.println();
            sg.displayGrade(name1);
            sg.displayGrade(name2);
            sg.displayGrade(name3);
            System.out.println("____________________________________________");
            //To remove a student
            System.out.println("Removing Student : ");
            System.out.println();
            System.out.println("Enter the name of the student to remove : ");
            String remove = student.next();
            sg.removeStudent(remove);
            System.out.println("____________________________________________");
        }
}
