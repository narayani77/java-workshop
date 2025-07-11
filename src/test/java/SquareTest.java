public class SquareTest {
public static void main(String[] args) {
   Square.square = (java.util.function.IntUnaryOperator) (int x) -> x * x;
        System.out.println(((java.util.function.IntUnaryOperator) Square.square).applyAsInt(5));
        // Use correct assertion and spelling
        // Assert.assertEquals(36, Square.findSquare(6));
    }

}


