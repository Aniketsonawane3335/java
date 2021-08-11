import java.util.Scanner;

public class Student
{
public static void main(String args[])
{
int roll;
String name;
double avg;

Scanner stud = new Scanner(System.in);

System.out.println("enter roll no of student ");
roll=stud.nextInt();

System.out.println("enter name of student ");
name=stud.next();

System.out.println("enter avg of student ");
avg=stud.nextDouble();

System.out.println("roll no of student is = "+roll);
System.out.println("name of student is = "+name);
System.out.println("avrage of student is = "+avg);

}
}
