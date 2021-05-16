object Temp {
   def main(args: Array[String]) : Unit = {
      println( "In Fahrenheit : " + CtoF(35) );
   }
   
   def CtoF( C:Int ) : Double = {
      var F:Double = 0
      F = C * 1.8000 + 32.00

      return F
   }
}