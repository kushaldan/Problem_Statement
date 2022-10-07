package gl;

class SuperDepartment{
    public void departmentName() {
    System.out.println("Super Department");
  }
  public void getTodaysWork(){
  System.out.println("No Work as of now");
  }
  public void getWorkDeadline(){
  System.out.println("Nil");
  }
  public void isTodayHoliday(){
  System.out.println("Today is not a holiday");
  }
  
}

class AdminDepartment extends SuperDepartment {
    public void departmentName() {
    System.out.println("Admin Department");
  }
  public void getTodaysWork(){
  System.out.println("Complete your documents submission");
  }
  public void getWorkDeadline(){
  System.out.println("Complete by EOD");
  }
  }
class HrDepartment extends SuperDepartment {
    public void departmentName() {
    System.out.println("HR Department");
  }
  public void getTodaysWork(){
  System.out.println("Fill today's timesheet and mark your attendence");
  }
  public void getWorkDeadline(){
  System.out.println("Complete by EOD");
  }
  public void doActivitye(){
	  System.out.println("Team Lunch");
	  }
  }
class TechDepartment extends SuperDepartment {
    public void departmentName() {
    System.out.println("Tech Department");
  }
  public void getTodaysWork(){
  System.out.println("Complete Coding of module 1");
  }
  public void getWorkDeadline(){
  System.out.println("Complete by EOD");
  }
  public void getTechStackInformation(){
	  System.out.println("Core Java");
	  }
  }
  
  public class Super {
	public static void main(String[]args) {
		AdminDepartment admin = new AdminDepartment();
		admin.departmentName();
	}
	

}
