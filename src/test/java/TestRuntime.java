import org.testng.annotations.Test;/** * @program: testNgDemo2 * @description: TestRuntime * @author: gonghuihui * @create: 2018-07-23 20:01 **/public class TestRuntime {    @Test(expectedExceptions = ArithmeticException.class)    public void divisionWithException() {        int i = 1 / 0;        System.out.println("After division the value of i is :"+ i);    }}