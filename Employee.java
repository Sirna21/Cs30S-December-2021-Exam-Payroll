/********************************************************************
 * Programmer:    Sirna Tafese
 * Class:  CS30S
 *
 * Assignment: December Exam
 *
 * Description: This class will house the employee details
 ***********************************************************************/

// import libraries as needed here

public class Employee {
    //*** Class Variables ***

    private static int nextID = 1001;       // unique id for next employee
    final double MAXHOUR = 40;              // The maximum hours for regular hours
    final double OVERTIMERATE = 1.5;        // The overtime rate applied to the wage

    //*** Instance Variables ***
    private String banner = "";          // output banner
    private  double HoursWorked;         //Hours worked for employee
    private  double HourlyWage;         // Hourly wage for employee
    private  int id;                    //id of employee
    private String nl = System.lineSeparator(); // new line seperator

    //*** Constructors ***

    public Employee(){
        id = nextID++;          // set unique id of employee object
        // and increment nextID so the next object
        HoursWorked = 0.0;      // setting hourse worked to 0
        HourlyWage = 0.0;       // setting hourly wage to 0

    }// end default/no-arg constructor

    // full arg constructor
    public Employee(double hw, double hlw){
        id = nextID++;          // set unique id for emplyee object
        // and increment nextID so the next object

        this.HourlyWage = hlw;  //setting variables 
        this.HoursWorked = hw;  //setting variables

    }// end full arg constructor

    //*** Getters ***
    /*****************************************
     * Description: get employee id
     * 
     * Interface:
     * 
     * @return       int: id number
     * ****************************************/
    public int getId(){
        return id;
    }// end getId
    /*****************************************
     * Description: get empolyee hourly wage
     * 
     * Interface:

     * @return      double: hourly wage of employee
     * ****************************************/
    public double getHlw(){
        return this.HourlyWage;
    }//end of getHlw
    /*****************************************
     * Description: get empolyee Hours Worked
     * 
     * Interface:

     * @return      double: hours employee has worked
     * ****************************************/
    public double getHw(){
        return this.HoursWorked;
    }//end of getHw
    /*****************************************
     * Description: Regular Pay emplyee will earn based on their hours worked
     * 
     * Interface:

     * @return      int: Regular Pay
     * ****************************************/
    public double getRegularPay(){
        double OvertimeHours = getHw() - MAXHOUR;         //getting the overtime hours worked
        double regularhours = getHw() - OvertimeHours;    //finding the reglular hours worked

        //making sure employee has worked
        if(regularhours < 0){
            regularhours = 0;
        }//end of if statement

        double RegularPay = regularhours * getHlw();      //findng the regular pay
        return RegularPay;
    }//end of getRegularPay
    /*****************************************
     * Description: get empolyee Overtime Pay
     * 
     * Interface:

     * @return      double: overtime pay
     * ****************************************/
    public double getOvertimePay(){
        double OvertimeHours = getHw() - MAXHOUR;         //finding overtime hours worked
        double OvertimeWage = getHlw() * OVERTIMERATE;    //calculating the overtime rate

        //making sure if no overtime is worked otpay is 0
        if(OvertimeHours < 0){
            OvertimeHours = 0; 
        }

        double OtPay = OvertimeHours * OvertimeWage;      //calcuating overtime pay

        return OtPay;
    }//End of OverTimePay
    /*****************************************
     * Description: get empolyee Gross Pay
     * 
     * Interface:

     * @return      double: GrossPay 
     * ****************************************/
    public double getGrossPay(){
        double GrossPay = getOvertimePay() + getRegularPay();     //adding Regular pay with Ot pay to get the gross pay
        return GrossPay;
    }//End of GrossPay

    //*** Setters ***

    /*****************************************
     * Description: set product HoursWorked to new HoursWorked
     * 
     * Interface:
     * 
     * @param        String: new HoursWorked for employee
     * 
     * ****************************************/
    public void  setHw(int HHw){
        this.HoursWorked = HHw;
    }//End of setHw
    /*****************************************
     * Description: set HourlyWage to new HourlyWage
     * 
     * Interface:
     * 
     * @param        double: new HourlyWage for employee
     * 
     * ****************************************/
    public void  setHlw(double HHlw){
        this.HourlyWage = HHlw;
    }//end of setHlw
    // other methods
    @Override
    public String toString(){
        //using toString to format output 
        //as well as printing out output together

        StringBuilder St = new StringBuilder();
        St.append(String.format ( "ID of Employee \t" + getId() + "\n"));
        St.append(String.format("%-2s %.0f %s", "Hours Worked \t", this.getHw(), "\n"));
        St.append(String.format("%-2s %.2f %s", "Hourly Wage \t $", this.getHlw(), "\n"));
        St.append(String.format("%-2s %.2f %s", "Regular Pay: \t $", getRegularPay(), "\n"));
        St.append(String.format("%-2s %.2f %s", "Overtime Pay: \t $", getOvertimePay(), "\n"));
        St.append(String.format("%-2s %.2f %s", "Gross Pay: \t $", getGrossPay(), "\n"));

        return St.toString(); 
    }//end of toString
}// end of class
