public class EmployeeTest {

    int  empId;
    String empName;
    String empDepartment;
    long empSalary;

    EmployeeTest(int empId, String empName,String empDepartment,long empSalary ){
        this.empId=empId;
        this.empName = empName;
        this.empDepartment = empDepartment;
        this.empSalary = empSalary;
    }

    @Override
    public String toString() {
        return "EmployeeTest{" +
                "empId=" + empId +
                ", empName='" + empName + '\'' +
                ", empDepartment='" + empDepartment + '\'' +
                ", empSalary=" + empSalary +
                '}';
    }

    public static void main(String[] args) {

        EmployeeTest bharath = new EmployeeTest(1,"Bharath","Developer",34234454);
        System.out.println(bharath);

    }
}
