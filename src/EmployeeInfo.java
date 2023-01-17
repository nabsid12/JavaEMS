

public class EmployeeInfo {

    
    // ATTRIBUTES
    public int empNum;
    public String firstName;
    public String lastName;
    public int gender; // encode e.g. 0 for M, 1 for F, etc.
    public int workLoc; // encode e.g. 0 for Mississauga, etc.
    public double deductRate; // e.g. 0.21 for 21%
    
    
    // CONSTRUCTORS
    
    public EmployeeInfo() {}
    
    public EmployeeInfo(int eN, String fN, String lN, int g, int wL, double dR) {
    	empNum = eN;
    	firstName = fN;
    	lastName = lN;
    	gender = g;
    	workLoc = wL;
    	deductRate = dR;
    }
    
    
    // METHODS
    
    public int getEmpNum() {
    	return empNum;
    }
    
    public String getFirstName() {
    	return firstName;
    }
    
    public String getLastName() {
    	return lastName;
    }
 
    public String getGender() {
        String strGender="";
        if (gender==0)
            strGender = "Male";
        else if (gender==1)
            strGender = "Female";
        else if (gender==2)
            strGender = "Other";
        return strGender;
    }
 
    public String getWorkLocation() {
        String strWorkLoc="";
        if (workLoc==0)
            strWorkLoc = "Mississauga";
        else if (workLoc==1)
            strWorkLoc = "Ottawa";
        else if (workLoc==2)
            strWorkLoc = "Chicago";
        else if (workLoc==3)
            strWorkLoc = "Edmonton";
        else if (workLoc==4)
            strWorkLoc = "Victoria";
        else if (workLoc==5)
            strWorkLoc = "Toronto";
        else if (workLoc==6)
            strWorkLoc = "Quebec City";
        else if (workLoc==7)
            strWorkLoc = "Regina";
        else if (workLoc==8)
            strWorkLoc = "Winnipeg";
        else if (workLoc==9)
            strWorkLoc = "Halifax";
        else if (workLoc==10)
            strWorkLoc = "Charlottetown";        
        return strWorkLoc;
    }

    public double getDeductionRate() {
    	return deductRate;
    }    
}
