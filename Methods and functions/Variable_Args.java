public class Variable_Args {
    
    // The three dots (...) signify a Varargs (Variable Arguments) parameter.
    // Behind the scenes, Java compiles 'int ...arr' into a standard array 'int[] arr'.
    public static int calculateSum(int ...arr) {
        int result = 0;
        
        // ENHANCED FOR-LOOP (For-Each):
        // This reads as: "For each integer 'a' inside the array 'arr'..."
        for (int a : arr) {
            result += a; // Accumulate the values
        }
        
        return result;
    }

    public static void main(String[] args) {
        // Look how clean the method call is! No need to declare an array first.
        // You can pass 3 numbers, 10 numbers, or absolutely nothing at all.
        System.out.println("The sum of 25, 1, 24 is: " + calculateSum(25, 1, 24));
        
        // Example of passing a completely different number of arguments to the same method:
        System.out.println("The sum of 5, 10 is:     " + calculateSum(5, 10));
    }     
}