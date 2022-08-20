package Day_19_Aug_19.JAVA8.DK;

public interface A {
    public void test1();
//    public void test1(){
//      //error we can not make complete method like this
//      if we have to make complete method in interface then we have to use default keyword
//    }
    default void test2(){
        System.out.println(2);
    }
    default public void test3(){
        System.out.println(3);
    }
//    default protected void test4(){ //we can not use protected and private with default keyword else it will give error
//        System.out.println(4);
//    }
//    default private void test5(){
//        System.out.println(5);
//    }
}
