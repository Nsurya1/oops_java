class Human {

    private int age;
    private String name;

    public int getAge() {
        return age;
    }

    public void SetAge(int age, Human obj) {
        // Human obj1=new Human(); // this is new object not the same object which
        // calling the setAge fun in main class so output is 0
        Human obj1 = obj; // obj is refrence object so it work but in java have another method to solve
                          // this by using this keyword
        obj1.age = age;
        // this.age=age;
    }

    // public void SetAge(int a)
    // {
    // age=a;
    // }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // public void setName(String n)
    // {
    // name=n;
    // }

}

public class ThisKeyword {
    public static void main(String[] args) {
        Human obj = new Human();

        obj.SetAge(30, obj);
        // obj.SetAge(30);
        obj.setName("Reddy");

        // System.out.println(obj.abc()+" : "+obj.getAge());
        System.out.println(obj.getName() + " : " + obj.getAge());

    }
}
