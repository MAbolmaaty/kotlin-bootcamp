import java.util.*
import kotlin.math.pow

fun main() {
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
}