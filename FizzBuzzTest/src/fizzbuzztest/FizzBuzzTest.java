package fizzbuzztest;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.LayoutManager;
import java.util.StringJoiner;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class FizzBuzzTest {

    public static void main(String[] args) throws InterruptedException {
        int i = 1;
        while (true) {
            StringBuilder sb = new StringBuilder();
            if (i % 3 == 0) {
                sb.append("Fizz");
            }
            if (i % 5 == 0) {
                sb.append("Buzz");
            }
            if (i % 3 != 0 && i % 5 != 0) {
                sb.append(String.valueOf(i));
            }
            sb.append(", ");
            System.out.print(sb.toString());
            Thread.sleep(50);
            i++;
        }
    }
}
