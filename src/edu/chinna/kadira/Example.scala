class Person(theAge: Int) {
  private val age : Int = theAge

  def paly ( buddy: Person): Unit ={
    println(s" I am  ${age} year(s) Old ! ")
    println(s" I am  ${buddy.age} year(s) Old ! ")
  }
}



object HelloWorld {
  def main(args: Array[String]) {
    val chaild1 = new Person(5)
    val chaild2 = new Person(6)

    chaild1.paly(chaild2)
  }
}