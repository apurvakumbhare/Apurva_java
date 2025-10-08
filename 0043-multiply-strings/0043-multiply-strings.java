 import java.math.BigInteger; 
class Solution {
      // ✅ Added import for BigInteger

public String multiply(String num1, String num2) {
    // ❌ Using int will overflow for large numbers
    // ✅ Changed 'int' to 'BigInteger' for safe large-number multiplication
    BigInteger a = BigInteger.ZERO; // changed
    for (int i = 0; i < num1.length(); i++) {
        a = a.multiply(BigInteger.TEN).add(BigInteger.valueOf(num1.charAt(i) - '0')); // changed
    }

    BigInteger b = BigInteger.ZERO; // changed
    for (int i = 0; i < num2.length(); i++) {
        b = b.multiply(BigInteger.TEN).add(BigInteger.valueOf(num2.charAt(i) - '0')); // changed
    }

    // ✅ Changed Integer.toString() to a.multiply(b).toString() for BigInteger result
    return a.multiply(b).toString(); // changed
}

}