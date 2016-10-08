/**
  * Created by FRESHIELD on 2016/10/7.
  */
package bobsrockets3{
  package navigation3{
    private [bobsrockets3] class Navigator2{
      protected [navigation3] def useStarChart(){println("here")}
      private [bobsrockets3] class LegOfJourney{
        private [bobsrockets3] val distance = 100
      }
      private [bobsrockets3] var speed = 200
    }
    package launch{

      //import navigation3._
      object Vehicle{
        def main(args: Array[String]) {
          val guide = new Navigator2
          guide.useStarChart()

          val test = new guide.LegOfJourney
          println(test.distance)
        }
      }
    }
  }
}
