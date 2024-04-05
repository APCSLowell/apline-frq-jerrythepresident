public class APLine
{
  private double slope;
  private double a;
  private double b;
  private double c;
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
