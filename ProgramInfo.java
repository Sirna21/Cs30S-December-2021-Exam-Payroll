/********************************************************************
 * Programmer:    Naga Assefa
 * Class: CS30S
 *
 * Assignment: ProgramInfo
 *
 * Description: program information class to print
 *  banner cand closing message
 ***********************************************************************/

// import libraries as needed here

public class ProgramInfo {
    //*** Class Variables ***
    
    //*** Instance Variables ***
    
     private String assignment;               // the name of the assignent for the banner
     
    //*** Constructors ***
    
    public ProgramInfo(String DecemberExam){
        assignment = DecemberExam;
        
    }  // end full arg constructor
    /*****************************************
    * Description: create the banner information
    * 
    * Interface:
    * 
    * @return      String: banner info
    * ****************************************/
    
    //*** Getters ***
    // special  'getters'
    public String getBanner(){
        String nl = System.lineSeparator();
        String ba;
        
        ba = "*****************************" + nl;
        ba += "Name:        Sirna Tafese" + nl;
        ba += "Class:       CS30S" + nl;
        ba += "Assignment:  "+ assignment + nl;
        ba += "*****************************" + nl + nl;
        
       return ba;
    }// end getBanner()
    
    /*****************************************
    * Description: creat the banner information
    * 
    * Interface:
    * 
    * @return      String: banner info
    * ****************************************/
    
    //*** Getters ***
    // spetial  'getters'
    public String getClosingMessage(){
       String cm;
       String nl = System.lineSeparator();
       
       cm = "end of processing";
       return cm;
    }// end getBanner()
    
    //*** Setters ***
    
} // end of public class
