/********************************************************************
 * Programmer:    sveinson
 * Class:  CS30S
 *
 * Assignment: AxQy
 *
 * Description: brief description of class
 ***********************************************************************/

// import libraries as needed here

public class Employee {
    //*** Class Variables ***
    
    private static int nextID = 1001;       // unique id for next employee
    final double MAXHOUR = 40;
    final double OVERTIMERATE = 1.5;
    //*** Instance Variables ***
    private String banner = "";             // output banner
    private  double HoursWorked;         //Hours worked for employee
    private  double HourlyWage;      // Hourly wage for employee
    private  int id;                 //id of employee
    private String nl = System.lineSeparator();
    
    //*** Constructors ***
    
    public Employee(){
        id = nextID++;          // set unique id of employee object
                                // and increment nextID so the next object
        HoursWorked = 0.0;
        HourlyWage = 0.0;
        
    }// end default/no-arg constructor
    
    // full arg constructor
    public Employee(double hw, double hlw){
        id = nextID++;          // set unique id for emplyee object
                                // and increment nextID so the next object
        
        this.HourlyWage = hlw;
        this.HoursWorked = hw;
        
    }// end default/no-arg constructor
    
    //*** Getters ***
    /*****************************************
    * Description: get employee id
    * 
    * Interface:
    * 
    * @return       int: id number
    * ****************************************/
    public String getBanner(){
        banner = "*****************************" + nl;
        banner += "Name:        Sveinson" + nl;
        banner += "Class:       CS30S" + nl;
        banner += "Assignment:  Ax Qy" + nl;
        banner += "*****************************" + nl + nl;
        return banner;
    }// end getId
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
    }
    /*****************************************
    * Description: get empolyee HoursWorked
    * 
    * Interface:
    
    * @return      int: hours employee has worked
    * ****************************************/
    public double getHw(){
      return this.HoursWorked;
    }
    /*****************************************
    * Description: Regular Pay emplyee will earn based on their hours worked
    * 
    * Interface:
    
    * @return      int: Regular Pay
    * ****************************************/
    public double getRegularPay(){
      double OvertimeHours = getHw() - MAXHOUR;
      double regularhours = getHw() - OvertimeHours;
      
      if(regularhours < 0){
        regularhours = 0;
      }
      
      double RegularPay = regularhours * getHlw();
      return RegularPay;
    }
    /*****************************************
    * Description: get empolyee Overtime Pay
    * 
    * Interface:
    
    * @return      int: overtime 
    * ****************************************/
    public double getOvertimePay(){
      double OvertimeHours = getHw() - MAXHOUR;
      double OvertimeWage = getHlw() * OVERTIMERATE;
      
      if(OvertimeHours < 0){
         OvertimeHours = 0; 
      }
      
      double OtPay = OvertimeHours * OvertimeWage;
      
      
      
      return OtPay;
    }
    /*****************************************
    * Description: get empolyee Overtime Pay
    * 
    * Interface:
    
    * @return      int: overtime 
    * ****************************************/
    public double getGrossPay(){
      double GrossPay = getOvertimePay() + getRegularPay();
      return GrossPay;
    }
    
    //*** Setters ***
    
    /*****************************************
    * Description: set product HoursWorked to new HoursWorked
    * 
    * Interface:
    * 
    * @param        String: new HoursWorked for product
    * 
    * ****************************************/
    public void  setHw(int HHw){
      this.HoursWorked = HHw;
    }
    /*****************************************
    * Description: set HourlyWage to new HourlyWage
    * 
    * Interface:
    * 
    * @param        double: new HourlyWage for product
    * 
    * ****************************************/
    public void  setHlw(double HHlw){
      this.HourlyWage = HHlw;
    }
    // other methods
    @Override
    public String toString(){

        StringBuilder St = new StringBuilder();
        St.append(String.format ( "ID of Employee \t" + getId() + "\n"));
        St.append(String.format("%-2s %.0f %s", "Hours Worked \t", this.getHw(), "\n"));
        St.append(String.format("%-2s %.2f %s", "Hourly Wage \t $", this.getHlw(), "\n"));
        St.append(String.format("%-2s %.2f %s", "Regular Pay: \t $", getRegularPay(), "\n"));
        St.append(String.format("%-2s %.2f %s", "Overtime Pay: \t $", getOvertimePay(), "\n"));
        St.append(String.format("%-2s %.2f %s", "Gross Pay: \t $", getGrossPay(), "\n"));

        return St.toString(); 
    }
}// end of class
