package SquareRoot

class SquareRoot
{
  def CalculateSquareRoot(n :Double): Double
  = {
  /*We are using n itself as initial approximation
   This can definitely be improved */
  var x: Double = n
  var y: Double = 1
  var e: Double = 0.000001 /* e decides the accuracy level*/
  while(x - y > e)
  {
    x = (x + y)/2
    y = n/x
  }
  return x
}
}

object SquareRoot
{
  def main(args: Array[String]): Unit ={
    var number= new SquareRoot();
    println("Square Root of number 5677 is " +number.CalculateSquareRoot(5677))
    
  }
}