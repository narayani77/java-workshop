public class SquareTest {
public static void main(String[] args) {
    Square.square=(int x)-> x*x;
    Assert.AssetEquals(30,Square.findsquare(6));
    
}
}
