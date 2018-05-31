object App {
  def main(args: Array[String]): Unit = {
    var drzewo = RTree.empty[Int]
    drzewo = drzewo.insert(Element(Box(0.2F, 0.4F, 1.0F, 1.1F), 1))
    //print(drzewo.print)
    drzewo = drzewo.insert(Element(Box(0.7F, 0.72F, 0.0F, 0.02F), 2))
    //print(drzewo.print)
    drzewo = drzewo.insert(Element(Box(0.1F, 0.3F, 0.5F, 0.7F), 3))
    //print(drzewo.print)
    drzewo = drzewo.insert(Element(Box(0.3F, 1.0F, 0.2F, 0.4F), 4))
    //print(drzewo.print)
    drzewo = drzewo.insert(Element(Box(0.9F, 1.2F, 0.25F, 0.42F), 5))
    //print(drzewo.print)

    val result = drzewo.search(Box(0.401F, 0.7F, 0.0f, 2.0F))
    result.foreach((element : Element[Int]) => {
      println(element.value)
    })
  }
}