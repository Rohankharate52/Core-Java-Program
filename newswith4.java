


//switch as an expression....

public class newswith4{
    
    //this is old switch staments
    ///new syntattaxx break line 
    
    public static void main (String [] args)
    {
    String day = "Sunday";
    String result = " ";

    
    switch(day)  
    { 
        case "Satuday" , "Sunday" -> result ="6am"; 
        case "Monday" -> result ="8am";
        default -> result = "7am";
    
    }
    System.out.println(result);
    
    }
    }