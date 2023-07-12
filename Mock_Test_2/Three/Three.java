class Person{

    private String name;
    private int age;
    private String address;

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }

    public void setAddress(String address){
        this.address = address;
    }
    public String getAddress(){
        return address;
    }



}


public class Three {
    public static void main(String[] args) {
        Person p1 = new Person();

        //setter execution
        p1.setName("iNeuron");
        p1.setAge(4);
        p1.setAddress("Bengaluru");

        //getter execution
        System.out.println("Name is: " + p1.getName());
        System.out.println("Age is: " + p1.getAge());
        System.out.println("Address is: " + p1.getAddress());

    }
}
