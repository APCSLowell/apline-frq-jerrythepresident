public class APLine
{
  private int A;
  private int B;
  private int C;
  public APLine(int a, int b, int c){
   A=a;
   B=b;
   C=c;
  }
  public double getSlope(){
    return -1 * (double) B/A;
  }
  public boolean isOnLine(int a, int b){
    return 0 == A*a+B*b+C;
  }
}
