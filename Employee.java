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
    
    private static int nextID = 1;       // unique id for next employee
    final double MAXHOUR = 40;
    final double OVERTIMERATE = 1.5;
    //*** Instance Variables ***
    
    private static double HoursWorked;         //Hours worked for employee
    private static double HourlyWage;      // Hourly wage for employee
    private static int id;                 //id of employee
    
    //*** Constructors ***
    
    public Employee(){
        id = nextID++;          // set unique id of employee object
                                // and increment nextID so the next object
        HoursWorked = 0;
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
    
    //toString
     /*****************************************
    * Description: override toString
    * 
    * Interface:
    * 
    * 
    * @return               String: Hourly wage and Hours Worked
    * ****************************************/
    // other methods
    @Override
  public String toString(){
      
        StringBuilder St = new StringBuilder();
        //St.append(String.format ( "ID of Employee" + id()));
        St.append(String.format("Hours Worked" + this.getHw()));
        St.append(String.format( " $" + this.getHlw()));
            
        return St.toString(); 
    }
}// end of class
