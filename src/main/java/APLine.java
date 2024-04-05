public class APLine
{
  private double slope;
  private double A;
  private double B;
  private double C;
  public void APLine(int a, int b, int c){
    slope=b/a;
    A=a;
    B=b;
    C=c;
  }
  public double getSlope(){
    return slope;
  }
  public boolean isOnline(int a, int b){
    if(A*a+B*b+C==0){
      return true;
    }
    return false;
  }
}
