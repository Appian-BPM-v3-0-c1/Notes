import org.junit.jupiter.api.Test;

public class ModifyTest {
    Modify modify = new Modify();
    private Object Assert;
    Object expected;


    @Test
    public void reverse() {
        String test1 = "my";
        String test2 = "our";
        String test3 = "your";
        String test4 = "too";
        String test5 = "out";


      Assert.assertEquals(expected: "ym", modify.reverse(test1));
      Assert.assertEquals(expected: "ruo", modify.reverse(test2));
      Assert.assertEquals(expected: "ruoy", modify.reverse(test3));
      Assert.assertEquals(expected: "oot", modify.reverse(test4));
      Assert.assertEquals(expected: "tuo", modify.reverse(test5));

        }
    }


