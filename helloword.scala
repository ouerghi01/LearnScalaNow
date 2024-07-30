object HelloWorld {
  def main(args: Array[String]): Unit = {
    var x: Int = 10
    var y: Int = 20
    def add(x:Int, y:Int):Int = x + y // function
    // u can also do this 
    def add_1(x:Int, y:Int):Int = {
      return x + y
    }
    //println(add_1(x, y)) // print 30 
    // lets use list in scala  
    var numbers = List(1, 2, 3, 4, 5)
    var result=numbers.map((x:Int) => add(x, x)+x)
    result.foreach(x=>println(x))

}
}