public class APLine
{
  private int A, B, C;
  public APLine(int a, int b, int c){
   A=a;
   B=b;
   C=c;
  }
  public double getSlope(){
    return (double) -A/B;
  }
  public boolean isOnLine(int a, int b){
    return 0 == A*a+B*b+C;
  }
}
