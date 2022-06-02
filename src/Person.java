class Person {
    String name;
    String address;
    final String country = "indonesia";

    Person(String name, String address){
        this.name = name;
        this.address = name;
    }


    Person(String paramName) {
        this(paramName, null);

    }

    Person(){
        this(null);
    }

    void sayHello(String name){
        System.out.println("hello " + name + "My Name Is " + this.name);
    }

}
