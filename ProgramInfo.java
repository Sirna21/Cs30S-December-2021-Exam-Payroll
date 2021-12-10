/********************************************************************
 * Programmer:    Sirna Tafese
 * Class: CS30S
 *
 * Assignment: ProgramInfo
 *
 * Description: program information class to print banner and closing message
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
     * @return      String: Banner
     * ****************************************/

    //*** Getters ***
    public String getBanner(){
        String nl = System.lineSeparator();     //line seperator
        String ba;                              //String used to return banner

        ba = "*****************************" + nl;
        ba += "Name:        Sirna Tafese" + nl;
        ba += "Class:       CS30S" + nl;
        ba += "Assignment:  "+ assignment + nl;
        ba += "*****************************" + nl + nl;

        return ba;
    }// end getBanner()

    /*****************************************
     * Description: Will return end of processing
     * 
     * Interface:
     * 
     * @return      String: ClosingMessage
     * ****************************************/
    //*** Getters ***
    public String getClosingMessage(){
        String cm;                               //String used to return closing message
        String nl = System.lineSeparator();      //used to sperate lines

        cm = "end of processing";
        return cm;
    }// end getClosingMessage()
} // end of public class