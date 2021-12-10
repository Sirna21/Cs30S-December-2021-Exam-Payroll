import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;
/** ***************************************************
 *  Name:           Sirna Tafese
 *  Class:          CS30S
 * 
 *  Assignment:     December Exam
 * 
 *  Description:    Main Client code for objects
 * 
 *************************************************************/

public class EmployeeClient {

    public static void main(String[] args) throws IOException{
        // ***** constants *******

        // ***** variables *****

        String banner = "";             // output banner
        String prompt = "";             // prompt for user input

        String strin = "";              // string fro keyboard input
        String strout = "";             // string for formatted output

        String delim = "[ ]+";          // delimiter for splitting input records
        String[] tokens = null;         // used to split input records

        // a new line character that works on every computer system
        String nl = System.lineSeparator();

        // ***** objects *****

        //Scanner scanner = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();

        // file io buffers for reading and writing to text files

        //creating array list
        ArrayList<Employee> employee = new ArrayList<>();

        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));

        // ***** print banners *****
        //instanciating as well as printing banner

        ProgramInfo B = new ProgramInfo("DecemberExam");
        System.out.println(B.getBanner());

        // ***** Main Processing *****

        //creating differnet employees using data from text file
        Employee employee1 = new Employee(35, 12.50);           //first employee data
        Employee employee2 = new Employee(40, 17.25);           //second employee data
        Employee employee3 = new Employee(45, 12.50);           //third employee data
        Employee employee4 = new Employee(40, 25.00);           //fourth employee data
        Employee employee5 = new Employee(46, 20.00);           //5th employee data
        Employee employee6 = new Employee(21, 18.75);           //6th employee data
        Employee employee7 = new Employee(48, 15.50);           //7th employee data
        Employee employee8 = new Employee(40, 32.75);           //8th employee data
        Employee employee9 = new Employee(41, 30.00);           //9th employee data

        //adding employees
        employee.add(employee1);
        employee.add(employee2);
        employee.add(employee3);
        employee.add(employee4);
        employee.add(employee5);
        employee.add(employee6);
        employee.add(employee7);
        employee.add(employee8);
        employee.add(employee9);

        //using enhanced for loop to print out employee details
        for(Employee e: employee){
            System.out.println(e);    
        }//end of printing out employee details

        //changing hw and hlw of employee 1008
        employee.get(8).setHw(40);
        employee.get(8).setHlw(21.00);
        //printing out new details of employee 1008
        System.out.println("________________________________" + nl);
        System.out.println("Hours Worked and Hourly Wage of Employee 1008 has been changed" + nl + nl);
        System.out.println(employee8 + nl + nl);

        //getting employee 1003 details and printing them out
        System.out.println("________________________________" + nl);
        System.out.println("Here is Employee 1003 info as requested from record" + nl + nl);
        System.out.println(employee.get(2));

        //Removing employee 1003 from record (ArrayList).
        System.out.println("________________________________" + nl + nl);
        System.out.println("Employee 1003 has been removed from record " + employee.remove(2));
        // ***** Print Formatted Output *****

        // ***** Closing Message *****

        //Printing out closing message
        System.out.println();
        System.out.println(B.getClosingMessage());

    } // end main 

} // end FormatTemplate
