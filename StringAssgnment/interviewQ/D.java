package StringAssgnment.interviewQ;

final public class D {
    //steps to create immutable class : it means that can be changed.
    //it will kinds of constant.
    private final int age;
    private final String name;
    public D(int age, String name){
        this.age=age;
        this.name=name;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        D d1=new D(23,"Suraj");
        System.out.println( d1.getAge());
        System.out.println( d1.getName());
    }
}
