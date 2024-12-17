import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        int length = MinimumElement.readInteger();
        int[] inputArray = MinimumElement.readElements(length);
        System.out.println(Arrays.toString(inputArray));
        System.out.println("Minimum element entered is " + MinimumElement.findMin(inputArray));
    }
}