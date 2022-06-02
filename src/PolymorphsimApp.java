public class PolymorphsimApp {
    public static void main(String[] args) {

        Employee employee = new Employee("ilham");
        employee.sayHello("ardi");

        employee = new Manager("hap");
        employee.sayHello("ardi");

        employee = new VicePresident("ardians");
        employee.sayHello("ardi");

        sayHello(new Employee("ilham"));
        sayHello(new Manager("ardi"));
        sayHello(new VicePresident("haphap"));

    }

    static void sayHello(Employee employee){
        if (employee instanceof VicePresident){
            VicePresident vp = (VicePresident) employee;
            System.out.println("hello VP "+  employee.name);
        } else if (employee instanceof  Manager) {
            Manager mg = (Manager) employee;
            System.out.println("hello Manager "+  employee.name);
        }else {
            System.out.println("hello "+  employee.name);
        }
    }
}
