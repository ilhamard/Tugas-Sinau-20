class VicePresident extends Manager{

    VicePresident(String name){
        super(name);
    }
    void sayHello(String name){
        System.out.println("hi " + name + ", my names is VP " +this.name);

    }
}
