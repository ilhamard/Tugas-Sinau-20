public class PersonApp {
    public static void main(String[] args) {

        var person1 = new Person("ilham", "Bandung");

        System.out.println(person1.name);
        System.out.println(person1.address);
        System.out.println(person1.country);
        person1.sayHello("ardi ");

        Person person2 = new Person("ardiansyah");
        person2.name = "ardiansyah";
        System.out.println(person2.name);

        Person person3;
        person3 = new Person();
        person3.name = "ardians ";
        person3.sayHello("ardians");
    }
}
