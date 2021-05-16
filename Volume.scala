object Sphere {
   def main(args: Array[String]) : Unit = {
      println( "Volume : " + Volume(5) );
   }
   
   def Volume( R:Int ) : Double = {
      var V:Double = 0
	  var Pi:Double = 3.14
      V = 4*Pi*R*R*R/3

      return V
   }
}