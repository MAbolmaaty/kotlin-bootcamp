import java.lang.Math.random
import java.util.*
import kotlin.math.pow

fun main(args: Array<String>) {
//    println(1/2)
//    println(1.0/2.0)

//    val fish = 6
//    println(fish * 2)

//    val fish = 2
//    println(fish.times(6))
//    println(fish.div(10))
//    println(fish.plus(3))
//    println(fish.minus(3))

    /**
     * Kotlin also supports object wrappers for numbers
     * All the numerical types in kotlin have a supertype called number
     * */

//    val boxed: Number = 1
//    // using object wrapper
//    // Boxing
//    println(boxed.toLong())

    /**
     * There are two types of variables in kotlin: changeable and unchangeable
     * */

//    // with val you can assign a value once
//    val aquarium = 1
//
//    // with var you can assign a value, and then you can change it
//    var fish = 2

    /**
     * Type Inference
     * means the compiler can figure out the type from the context
     * it becomes fixed at compile time and you can't change the type
     * of variable in kotlin once it's type has been determined
     * */

    /**
     * Number types won't implicitly convert to other types so you can't
     * assign a short value to a long value or a byte to an int
     * kotlin does this because implicit numerical conversion is a common
     * source of errors in programs, you can always assign them by casting
     * */

//    // error mismatch
//    val b: Byte = 1
//    val i: Int = b
//
//    // using casting
//    val i2: Int = b.toInt()

    /**
     * kotlin supports underscores in numbers
     * */

//    val oneMillion = 1_000_000
//    println(oneMillion)
//    val socialSecurityNumber = 999_99_9999L
//    val hexBytes = 0xFF_EC_DE_5E
//    val bytes = 0b11010010_01101001_10010100_10010010

    /**
     * Nullability, kotlin helps avoid null pointer exceptions
     * when you declare a variables, it's value can't be null
     * use the question mark operator to indicate that a variable can be null*/

//    // null can not be a value of a non-null type Int
//    var rocks: Int = null
//
//    var marbles: Int? = null

    /**
     * You can allow for the list to be null,
     * but if it is not null, its elements cannot be null,
     * or you can allow both the list or the elements to be null*/

//    var lotsOfFish: List<String?> = listOf(null, null)
//
//    var everMoreFish: List<String>? = null
//
//    var definitelyFish : List<String?>? = null
//
//    definitelyFish = listOf(null, null)

    /**
     * (!!) not null assertion operator can force pass nullable type in kotlin
     * In programming slang, the exclamation mark is often called Bang
     * (!!) = not null assertion operator = double bang */

    /**
     * null testing with the question mark operator,
     * you can check whether an object or variable is non null before
     * accessing one of its methods*/

//    var fishFoodTreats = 5
//    fishFoodTreats?.dec() ?: 0
//    // ?: Elvis operator

//    // Quiz
//    val fish = 2
//    var offspring = 71 + 233
//    offspring -= 13
//    val aquariums = offspring / 30
//    // solution
//    2.plus(71).plus(233).minus(13).div(30).plus(1)
//
//    var rainbowColor: String? = "Red"
//    rainbowColor = "Blue"
//
//    val blackColor = "Black"
//
//    rainbowColor = null
//
//    val greenColor = null
//    val blueColor: String? = null
//
//    listOf(null, null)
//    [null, null]
//    var list: List<String?> = listOf(null, null)
//    var list2: List<String>? = null
//
//    val nullTest: Int? = null
//    val result = nullTest?.inc() ?: 0
//    println(result)

    // Strings

//    println("Hello Fish")
//    println("Hello" + " fish")
//
//    val numberOfFish = 5
//    val numberOfPlants = 12
//
//    println("I have $numberOfFish fish and $numberOfPlants plants")

//    val fish = "fish"
//    val plant = "plant"
//    println(fish == plant)
//    println(fish != plant)

//    val numberOfFish = 50
//    val numberOfPlants = 23
//    if(numberOfFish > numberOfPlants) println("Good ratio!")
//    else println("unhealthy ratio")

//    // ////////////////////////////////////////// ranges
//    val fish = 50
//    if (fish in 1..50) println(fish)
//
    //for (i in 'b'..'g') print(i)
    //for (i in 1..5) println(i)
    //for (i in 5 downTo 1) println(i)
    //for (i in 3..10 step 2) print(i)

//    // (when) keyword is kotlin's way of doing switching
//    when(fish) {
//        0 -> println("Empty tank")
//        50 -> println("Full tank")
//        else -> println("Perfect!")
//    }

//    var welcomeMessage = "Hello and welcome to kotlin"
//    when (welcomeMessage.length) {
//        0 -> println("Nothing to say?")
//        in 1..50 -> println("Perfect")
//        else -> println("Too long!")
//    }

//    val trout: String = "trout"
//    val haddock: String = "haddock"
//    val snapper: String = "snapper"
//
//    println("i like eating $trout")
//    println("i don't like eating $haddock")
//    println("i like eating $snapper")

//    val fishName = "trout"
//
//    when(fishName.length){
//        0 -> println("Fish name cannot be empty")
//        in 3..12 -> println("Good fish name")
//        else -> println("Ok fish name")
//    }

    /**
     * If your val variable value is a reference, then you cannot assign it
     * a different reference later*/
//    val myList = mutableListOf("tuna","salmon","shark")
//    // error: val cannot be reassigned
//    //myList = mutableListOf("koi","goldfish")
    /**
     * But if you're referencing something that is not immutable,
     * it can still change
     * val only applies to the reference, and it doesn't make the object
     * it points to immutable*/
//    println(myList.remove("shark"))

//    // arrays
//    var fish = 12
//    var plants = 5
//    val swarm = listOf(fish, plants)
//    val school = arrayOf("tuna", "salmon", "shark")
//
//    // typed arrays
//    val numbers = intArrayOf(1,2,3)
//
//    // untyped arrays
//    val mix = arrayOf("fish", 2)
//
//    println(Arrays.toString(mix))

//    // nest arrays
//    var fish = 12
//    var plants = 5
//    val  swarm = listOf(fish, plants)
//    val bigSwarm = arrayOf(swarm, arrayOf("dolphin", "whale", "orka"))
//
////    for (element in swarm) println(element)
//
//    for ((index, element) in swarm.withIndex()){
//        println("Fish at $index is $element")
//    }
//
////    val array = Array(5) {it * 3}
////    println(array.asList())

//    //quiz
//    val array = Array(7){1000.0.pow(it)}
//    val sizes = arrayOf("byte", "kilobyte", "megabyte", "gigabyte", "terabyte",
//    "petabyte", "exabyte")
//
//    for ((i, value) in array.withIndex()){
//        println("1 ${sizes[i]} = ${value.toLong()} bytes")
//    }

//    val numbers: MutableList<Int> = mutableListOf()
//    for (i in 11..15)
//        numbers.add(i)
//
//    println(numbers.toString())

    //val strings: MutableList<String> = mutableListOf()

//    repeat(2) {
//        println("Happy Birthday!")
//    }

//    println("Hello, ${args[0]}")

//    val isUnit = println("This is an expression")
//    println(isUnit)

//    val temperature = 10
////    val isHot = if (temperature > 50) true else false
////    println(isHot)
//
//    val message = "You are ${ if (temperature > 50) "fried" else "safe" } fish"
//    println(message)

//    println(if (args[0].toInt() < 12) "Good morning, Kotlin" else "Good night, Kotlin")
//    swim(2)

    // filters
    /**
     * Filter, is a standard library function on list in kotlin
     * By default, filter on a list is eager, That means every time you call filter,
     * it creates a new list with the elements that pass through the filter*/
    //eagerExample()
    //val decorations = listOf ("rock", "pagoda", "plastic plant", "aligator", "flowerpot")
//    println(decorations.filter { it[0] == 'p' })
    /**
     * for lazy behavior, you can use sequences,
     * A sequence is a collection that can only look at one item at a time*/

    // apply filter lazily
    // filtered variable won't hold a new list, it'll hold a sequence of all
    // the list elements and knowledge of the filter to apply to its elements
    // whenever you access elements of the sequence, the filter is applied
    // and results are returned to you
//    val filtered = decorations.asSequence().filter { it[0] == 'p'}
//    println(filtered)
//    println(filtered.toList())

//    val spices = listOf("curry", "pepper", "cayenne", "ginger", "red curry",
//        "green curry", "red pepper")
//    println(spices.filter { it.contains("curry") }.sortedBy { it.length })
//    println(spices.filter { it.startsWith('c') && it.endsWith('e') })
//    spices.take(3).filter { it.startsWith('c') }

    /**
     * kotlin also supports lambdas, in other languages these are called
     * anonymous functions or function literals,
     * instead of declaring a named function, we declare a function that has no name*/
    //{ println("Hello") }()
//    val swim = {println("swim \n")}
//    swim()

    //println(waterFilter(dirty))

    /**
     * filter takes a lambda and uses it to filter a list*/
//    val list = listOf(1, 2, 3)
//    list.filter { it == 2 }

    /**
     * random1 has a value assigned at compile time, and the value never changes
     * when the variable is accessed
     * random2 has a lambda assigned at compile time, and the lambda is
     * executed every time the variable is referenced, returning a different value*/
//    val random1 = random()
//    val random2 = { random() }

//    val rollDice = {
//            sides: Int ->
//        if (sides == 0) 0
//        Random().nextInt(12) + 1}
//
//    val rollDice2: (Int) -> Int = { sides ->
//        if (sides == 0) 0
//        else Random().nextInt(sides) + 1
//    }


}

/**
 * Every function in kotlin returns something even when nothing
 * is explicitly specified, A function like main returns a type
 * unit which is kotlin's way of saying no value, And when a function
 * returns unit, you don't have to specify it explicitly*/

fun dayOfWeek() {
    println("What day is it today?")
    val day = Calendar.getInstance().get(Calendar.DAY_OF_WEEK)
    println(when(day){
        1 -> "Sunday"
        2 -> "Monday"
        3 -> "Tuesday"
        4 -> "Wednesday"
        5 -> "Thursday"
        6 -> "Friday"
        7 -> "Saturday"
        else -> "Time has stopped"
    })
}

/**
 * Parameters in kotlin can have a default value, This means when you call
 * the function you don't have to specify a value every time for those parameters
 * If the is missing, the default value is used*/

fun swim(time: Int, speed: String = "fast"){
    println("swimming $speed")
}

/**
 * It is a best practice to put arguments without defaults first
 * and then the ones with the defaults afterwards */

fun eagerExample() {
    val decorations = listOf("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
    // variable eager here will hold a new list
    val eager = decorations.filter { it[0] == 'p'}
    println(eager)
}
/**
 * A higher-order function is really just any function that takes
 * a function as the argument
 * kotlin prefers function arguments to be the last parameter
 * */
fun feedFish(dirty: Int) = dirty + 10
fun updateDirty(dirty: Int, operation: (Int) -> Int): Int {
    return operation(dirty)
}
var dirty = 20
val waterFilter: (Int) -> Int = { dirty -> dirty / 2 }

fun dirtyProcessor() {
    dirty = updateDirty(dirty, waterFilter)
    // since feedFish is a name function and not a lambda, you'll need
    // to use a double colon to pass it
    dirty = updateDirty(dirty, ::feedFish)
    /**
     * when you combine higher-order functions with lambdas*/
    dirty = updateDirty(dirty) {dirty -> dirty +50}
}


/**
 * if you have too many parameters in your function, it might be an indicator
 * that your function is doing too much*/

/**
 * Free functions or top level functions are functions that can be defined
 * outside any in closing class */

/**
 * Abstract classes and interfaces
 * Both are classes that cannot be instantiated on their own,
 * which means you cannot create objects of those types,
 * The difference is that abstract classes have constructors while interfaces
 * can't have any constructor logic
 * Both interfaces and abstract classes can contain implementations of methods.
 * On interfaces, we call them default implementations */

/**
 * Special Purpose classes
 * Singletons
 * Enums
 * to create a singleton use the object keyword when you declare your class
 * */

object MobyDickWhale {
    val author = "Herman Melville"
    fun jump() {
        // ...
    }
}

enum class Color(val rgb: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

/**
 * sealed class
 * It's a class that can be subclassed but only inside the file
 * which it's declared
 * If you try to subclass it in a different file, you'll get an error
 * Because the class and subclasses are in the same file
 * kotlin will be able to know all subclasses statically
 * that is at compile time
 * */

sealed class Seal

class SeaLion: Seal()
class Walrus: Seal()


/**
 * (lateinit) promises the kotlin compiler that the variable will be initialized
 * before calling any operations on it*/
