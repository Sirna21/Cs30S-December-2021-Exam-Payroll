import java.util.Scanner;
import javax.swing.*;
import java.io.*;
import java.text.NumberFormat;
import java.util.ArrayList;
/** ***************************************************
 *  Name:           Sveinson
 *  Class:          CS30S
 * 
 *  Assignment:     Ax Qy
 * 
 *  Description:    Place a short description of your program here
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
        
        ArrayList<Employee> employee = new ArrayList<>();


        
        //BufferedReader fin = new BufferedReader(new FileReader("filename.txt"));
        //PrintWriter fout = new PrintWriter(new BufferedWriter(new FileWriter("outfle.txt")));
    
    // ***** print banners *****
    

    ProgramInfo B = new ProgramInfo("DecemberExam");
    
    System.out.println(B.getBanner());

        //fout.print(banner);
    
    // ***** Get Input *****
    
        // prompt for input
        // read input from keyboard
        // echo input back to console window

        
    // ***** Main Processing *****
    
    Employee employee1 = new Employee(35, 12.50);           //first employee data
    Employee employee2 = new Employee(40, 17.25);           //second employee data
    Employee employee3 = new Employee(45, 12.50);           //third employee data
    Employee employee4 = new Employee(40, 25.00);           //fourth employee data
    Employee employee5 = new Employee(46, 20.00);           //5th employee data
    Employee employee6 = new Employee(21, 18.75);           //6th employee data
    Employee employee7 = new Employee(48, 15.50);           //7th employee data
    Employee employee8 = new Employee(40, 32.75);           //8th employee data
    Employee employee9 = new Employee(41, 30.00);           //9th employee data
    
    employee.add(employee1);
    employee.add(employee2);
    employee.add(employee3);
    employee.add(employee4);
    employee.add(employee5);
    employee.add(employee6);
    employee.add(employee7);
    employee.add(employee8);
    employee.add(employee9);
    
    
    for(Employee e: employee){
      System.out.println(e);    
    }
    
    employee.get(8).setHw(40);
    employee.get(8).setHlw(21.00);
    System.out.println("________________________________" + nl);
    System.out.println("Hours Worked and Hourly Wage of Employee 1008 has been changed" + nl + nl);
    System.out.println(employee8 + nl + nl);
    
    
    System.out.println("________________________________" + nl);
    System.out.println("Here is Employee 1003 info as requested from record" + nl + nl);
    System.out.println(employee.get(2));
    
    System.out.println("________________________________" + nl + nl);
    System.out.println("Employee 1003 has been removed from record " + employee.remove(2));

    // ***** Print Formatted Output *****
    
    // ***** Closing Message *****
    

    System.out.println();
    System.out.println(B.getClosingMessage());
        

        //fout.println("End of Processing");
        
    // **** close io buffers *****
    
        //fin.close();
        //fout.close();
    } // end main 
    
} // end FormatTemplate
