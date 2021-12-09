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
    
    private static int nextID = 1000;       // unique id for next employee

    //*** Instance Variables ***
    
    private static int HoursWorked;         //Hours worked for employee
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
    public Employee(int hw, double hlw){
        id = nextID++;          // set unique id for emplyee object
                                // and increment nextID so the next object
        
        this.HourlyWage = hlw;
        this.HoursWorked = hw;
        
    }// end default/no-arg constructor
    
    //*** Getters ***
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
    public int getHw(){
      return this.HoursWorked;
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
} // end of public class