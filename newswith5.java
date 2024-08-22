




//switch as an expression....

public class newswith5{ 
    
    //this is old switch staments
    ///new syntattaxx break line 
    
    public static void main (String [] args)
    {
    String day = "Wed";
    String result = " ";

    
    result = switch(day)  
    { 
        case "Satuday" , "Sunday" : yield  "6am"; 
        case "Monday" :  yield  "8am";
        default : yield  "7am";
    
    };
    System.out.println(result);
    
    }
    }