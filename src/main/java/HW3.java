package com.example;
//import java.util.Scanner;

public class HW3 {
  //以1:1:1.414能判為直角三角形為定的誤差
  private static final double DEFAULT_ERROR = 0.001;
  
  /**
   * main.
 * @throws WrongSideException 
   * 
   */
  
  /*public static void main(String[] args) throws Exception {
    Scanner scanner = new Scanner(System.in);
    final double a = scanner.nextDouble();
    final double b = scanner.nextDouble();
    final double c = scanner.nextDouble();
    scanner.close();
    
    HW3 check = new HW3();
    String whichTriangle = check.checkTriangle(a,b,c);
    System.out.print(whichTriangle);
  }*/
  
  /**
   * 判斷是何種三角形.
 * @throws WrongSideException 
   * 
   */
  public String checkTriangle(double a,double b,double c) throws Exception {
    if ((a <= 0) || (b <= 0) || (c <= 0)) {
      throw new Exception("三邊長不得有任一邊<=0");
    } else if ((a + b <= c) || (b + c <= a) || (a + c <= b)) {
      throw new Exception("三角形兩邊長和>第三邊");
    } else if ((a == b) && (b == c)) {    //正三角形(三邊相同)
      return "正三角形";
    } else if (((a == b) || (b == c) || (a == c))    //等腰直角三角形(有兩邊相容且a^2+b^2=c^2)
        && ((Math.abs(a * a + b * b - c * c) < DEFAULT_ERROR)
        || (Math.abs(b * b + c * c - a * a) < DEFAULT_ERROR)
        || (Math.abs(a * a + c * c - b * b) < DEFAULT_ERROR))) {
      return "等腰直角三角形";
    } else if ((Math.abs(a * a + b * b - c * c) < DEFAULT_ERROR)  //直角三角形(a^2+b^2=c^2)
        || (Math.abs(b * b + c * c - a * a) < DEFAULT_ERROR)
        || (Math.abs(a * a + c * c - b * b) < DEFAULT_ERROR)) {
      return "直角三角形";
    } else if ((a == b) || (b == c) || (a == c)) {    //等腰三角形(只要有兩邊相同)
      return "等腰三角形";
    } else {
      return "三角形";
    }
  }
}
