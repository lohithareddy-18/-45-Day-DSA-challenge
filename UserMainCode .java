import java.io.*;
import java.util.*;

// Read only region start

class UserMainCode {

    public int findKey(int input1, int input2, int input3) {
        // Read only region end
        
        // Calculate and return the sum of the inputs
        return input1 + input2 + input3;
    }

    public static void main(String[] args) {
        // Example usage
        UserMainCode umc = new UserMainCode();
        int result = umc.findKey(1, 2, 3);
        System.out.println("Result: " + result); // Output: Result: 6
    }
}
