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
    val names = arrayOf(1, 2, 3)

    for (nm in names) {
        print(nm)
    }

    println()

    // below functionla code is a loop itself. it will print all the numbers
    names.forEach {
        print(it)
    }

    // Ranges - new thing in kotlin
    for (i in 0..3) { // both 0&3 are inclusive
        print(i)
    }
    println()

    // if we want to skip two numbers
    for (i in 0..3 step 2) {
        print(i)
    }
    println()

    // some other uses of range feature
    val test = 3
    if (test in 0..10) {
        print(true)
    }

    // opposite of in is !in
    // next comes collections like List, Map, Set etc...

    // next is functions
    fun add(a: Int, b: Int): Int {
        return a + b
    }

    println(add(2, 3))

    // passing default value in a function
    fun greeting(greet: String = "Good Night") {
        print("Hello, $greet")
    }

    // moving on to higher order funcions - passing functions as input to another functions


    val output = operation(2, 3, { a, b ->
        print("adding these two numbers...")
        a + b
    }) // a and b are newly defined

    val p1 = person("Tushar")
    print(p1.name)

}

fun operation(a: Int, b: Int, add: (Int, Int) -> Int): Int { // Unit means it returns nothing
    return add(a, b)
}

class TestClass // this is also a valid class

class person(providedname: String) { // this parenthesis defines a constructor
    val name: String
    init {
        name = providedname
    }
}

// even more concise code can be written for above class. I'll be using student instead of person
class student(val name: String) // and that's it'

// making POJO(Plain Old Java Object) classes we have data classes in kotlin
data class stud(val name: String, val id: Int) // that's it
