package spices

fun main(args: Array<String>){
//    val curry = Curry("1", "mild")
//    println(curry.color)

    val spiceCabinet = listOf(SpiceContainer(Curry("Yellow Curry", "mild")),
        SpiceContainer(Curry("Red Curry", "medium")),
        SpiceContainer(Curry("Green Curry", "spicy")))

    for (element in spiceCabinet) println(element.label)
}

abstract sealed class Spice(val name: String, val spiciness: String = "mild",
                     color: SpiceColor) : SpiceColor by color {
    val heat: Int
        get() {
            return when (spiciness){
                "mild" -> 1
                "medium" -> 3
                "spicy" -> 5
                "very spicy" -> 7
                "extremely spicy" -> 10
                else -> 0
            }
        }

    init {
        //println("$name $spiciness")
    }

    abstract fun prepareSpice ()
}

class Curry(name: String, spiciness: String,
            color: SpiceColor = YellowSpiceColor): Spice(name, spiciness, color), Grinder{

    override fun prepareSpice() {
        TODO("Not yet implemented")
    }

    override fun grind() {
        TODO("Not yet implemented")
    }
}

interface Grinder {
    fun grind()
}

interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
}

data class SpiceContainer(var spice: Spice){
    val label = spice.name
}

enum class Color(val rgb: Int) {
    RED(0xFF0000), GREEN(0x00FF00), BLUE(0x0000FF),
    YELLOW(0xFFFF00);
}