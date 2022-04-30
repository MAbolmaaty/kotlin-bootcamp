import java.util.Random
import kotlin.math.tan

fun main(args: Array<String>) {
//    println("Hello, ${args[0]}")
    //feedTheFish()
//    var fortune: String
//    for (i in 1..10) {
//        fortune = getFortuneCookie(getBirthday())
//        println("\nYour fortune is: $fortune")
//        if (fortune.contains("Take it easy")) break
//    }
    //println(fitMoreFish(10.0, listOf(), 7, true))
    //println(whatShouldIDoToday(getMood()))

//    var bubbles = 0
//    while (bubbles < 50) {
//        bubbles++
//    }

//        repeat(10) {
//            var fortune = getFortuneCookie(getBirthday())
//            println("\nYour fortune is: $fortune")
//            if (fortune.contains("Take it easy")) break
//        }

//    var fortune = ""
//    while(!fortune.contains("Take it easy")) {
//        fortune = getFortuneCookie(getBirthday())
//        println("\nYour fortune is: $fortune")
//        if (fortune.contains("Take it easy")) break
//    }


}

fun fitMoreFish(
    tankSize: Double,
    currentFish: List<Int>,
    fishSize: Int = 2,
    hasDecorations: Boolean = true): Boolean{

    if (hasDecorations){
        var total = 0
        for (fish in currentFish) total += fish
        total += fishSize
        return total <= tankSize.times(0.8)
    } else {
        var total = 0
        for (fish in currentFish) total += fish
        total += fishSize
        return total <= tankSize
    }
}

/**
 * sum() function in the list adds up all elements in a list
 * */

fun canAddFish(tankSize: Double, currentFish: List<Int>,
               fishSize: Int = 2, hasDecorations: Boolean = true): Boolean{
    return (tankSize * if (hasDecorations) 0.8 else 1.0) >= (currentFish.sum() + fishSize)
}

fun getDirtySensorReading() = 20

fun shouldChangeWater (
    day: String,
    temperature: Int = 22,
    dirty: Int = getDirtySensorReading()
) : Boolean {

    val isTooHot = temperature > 30
    val isDirty = dirty > 30
    val isSunday = day == "Sunday"

    return when {
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

/**
 * return type is boolean
 * You can declare functions this way whenever they have a single expression
 * in their body
 * Examples of expensive operations include reading files or allocating
 * a lot of memory
 * (Any) can hold any type of object
 * */

fun isTooHot(temperature: Int) = temperature > 30

fun isDirty(dirty: Int) = dirty > 30

fun isSunday(day: String) = day == "Sunday"

fun shouldChangeWater2(
    temperature: Int = 22,
    dirty: Int = 20,
    day: String
){}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")
    shouldChangeWater(day, 20, 50)
    shouldChangeWater(day)
    shouldChangeWater(day, dirty = 50)
    shouldChangeWater2(day = "Monday")

    if (shouldChangeWater(day)){
        println("Change the water today")
    }
}

fun randomDay(): String {
    val week = listOf("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday")
    return week[Random().nextInt(7)]
}

fun fishFood(day: String): String {
    return when (day) {
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Friday" -> "mosquitoes"
        "Saturday" -> "lettuce"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}

fun getFortuneCookie(birthday: Int): String {
    val fortunes = listOf(
        "You will have a great day!",
        "Things will go well for you today.",
        "Enjoy a wonderful day of success.",
        "Be humble and all will turn out well.",
        "Today is a good day for exercising restraint.",
        "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune."
    )

    val index = when(birthday) {
        28, 31 -> 2
        in 1..7 -> 4
        else -> birthday.rem(fortunes.size)
    }

    return fortunes[index]
}

fun getBirthday(): Int {
    print("Enter your birthday:")
    return readLine()?.toIntOrNull() ?: 1
}

fun whatShouldIDoToday(mood: String, weather: String = "sunny", temperature: Int = 24): String{
    return when {
        goWalk(mood, weather) -> "go for a walk"
        stayBed(mood, weather, temperature) -> "stay in bed"
        swim(temperature) -> "go swimming"
        else -> "Stay home and read."
    }
}

fun goWalk (mood: String, weather: String) = mood == "happy" && weather == "sunny"
fun stayBed (mood: String, weather: String, temperature: Int) =
    mood == "sad" && weather == "rainy" && temperature == 0
fun swim (temperature: Int) = temperature > 35

fun getMood(): String{
    println("Enter mood:")
    val mood = readLine()
    return mood!!
}