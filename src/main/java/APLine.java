public class APLine
{
  private int A;
  private int B;
  private int C;
  public void APLine(int a, int b, int c){
    this.A=a;
    this.B=b;
    this.C=c;
  }
  public double getSlope(){
    return (double) this.B/this.A;
  }
  public boolean isOnline(int a, int b){
    if(this.A*a+this.B*b+this.C==0){
      return true;
    }
    return false;
  }
}
