fun main(args: Array<String>) {
    println("Yo!")
    println("hello world") // println for a new line

    var x = 5
    println("this is a $x string") // this is called string templates
    println("this is ${x.div(4)}")

    //declaring explicit variables
    var y: Int = 3
    val z: Int = 4 // val is the constant datatype whose value won't change

    //now we'll see nullpointerexception handling
    var myname: String? = null // ? means a null type variable

    // Conditional Statements can return a datatype after execution
    val a2m: Int = if (true) {
        print("inside rtue")
        10 // this 10 is returned
    } else {
        print("false")
        0 // this is returned
    }

    val name = "Tushar"
    // 'when' can also be used just like switch-case
    when (name) {
        "Tushar" -> {
            println("correct")
        }
        else -> {
            print("yoo else")
        }
    }

    // arrayOf functionality
    val names = arrayOf(1,2,3)

}