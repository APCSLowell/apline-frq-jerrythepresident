public class APLine
{
  private double A;
  private double B;
  private double C;
  public void APLine(int a, int b, int c){
    A=a;
    B=b;
    C=c;
  }
  public double getSlope(){
    return B/A;
  }
  public boolean isOnline(int a, int b){
    if(A*a+B*b+C==0){
      return true;
    }
    return false;
  }
}
