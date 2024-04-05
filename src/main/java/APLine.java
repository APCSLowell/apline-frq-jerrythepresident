public class APLine
{
  private int A;
  private int B;
  private int C;
  public void APLine(int a, int b, int c){
   A=a;
   B=b;
   C=c;
  }
  public double getSlope(){
    return (double) B/A;
  }
  public boolean isOnline(int a, int b){
    if(A*a+B*b+C==0){
      return true;
    }
    return false;
  }
}
