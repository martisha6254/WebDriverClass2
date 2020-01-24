import org.testng.annotations.Test;

public class Day1 {



@Test
public void testPrintEvenNumbers() {
        for (int i = 1; i <= 10; i++) {
        if (i%2==0) System.out.println(i);
        }
        }


        @Test
        public void printHelloAtEvenNumbers() {
                for (int i = 1; i <= 10; i++) {
                        if (i%2==0) System.out.println("hello world");
                }
        }

        @Test
        public void test003() {
                                String[][] names = {
                                        {"Mr. ", "Mrs. ", "Ms. "},
                                        {"Smith", "Jones"}
                                };
                                // Mr. Smith
                                System.out.println(names[0][0] + names[1][0]);
                                // Ms. Jones
                                System.out.println(names[0][2] + names[1][1]);
                System.out.println(names[0].length);
                        }

        @Test
        public void test004() {
                char[] copyFrom = { 'd', 'e', 'c', 'a', 'f', 'f', 'e',
                        'i', 'n', 'a', 't', 'e', 'd' };
                char[] copyTo = new char[5];

                System.arraycopy(copyFrom, 0, copyTo, 0, 5);
                System.out.println(new String(copyTo));
        }
}