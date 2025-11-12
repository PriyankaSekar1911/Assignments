package language.basics;

public class EmpGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 Employees EmpObj = new Employees();
 
 String[] EmployeeName = new String [3];
 
 EmployeeName[0]= EmpObj.Employee1;
 EmployeeName[1]= EmpObj.Employee2;
 EmployeeName[2]= EmpObj.Employee3;
 
 int[] EmployeeID = new int[3];
 
 EmployeeID[0]= EmpObj.EmployeeID1;
 EmployeeID[1]= EmpObj.EmployeeID2;
 EmployeeID[2]= EmpObj.EmployeeID3;
 
 System.out.println("EmployeeName : "+ EmployeeName[0] + ", EmployeeID : "+EmployeeID[0]);
 System.out.println("EmployeeName : "+ EmployeeName[1] + ", EmployeeID : "+EmployeeID[1]);
 System.out.println("EmployeeName : "+ EmployeeName[2] + ", EmployeeID : "+EmployeeID[2]);
	}

}
