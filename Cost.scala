object Bookstore {
   def main(args: Array[String]) : Unit = {
      println( "Total wholesale cost  : " + CalCost(24.95, 60) );
   }
   
   def CalCost( C:Double, N:Int ) : Double = {
      var S50:Int = 3
	  var SR:Double = 0.75
	  var TC:Double = 0
      TC = ((C*N*0.6) + (S50*50) + ((N-50)*SR))

      return TC
   }
}