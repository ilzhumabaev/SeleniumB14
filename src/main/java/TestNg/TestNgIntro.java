package TestNg;
import org.testng.annotations.Test;
public class TestNgIntro {
    @Test (priority = 2,invocationCount = 5)// kind of main method
 public void test1() {
     System.out.println("this is test 1");
 }

 @Test (priority = 3)
    public void test2() {
     System.out.println("this is test 2");
 }

@Test (priority = 1)
    public void test3(){
    System.out.println("This is test 3");
}

}
