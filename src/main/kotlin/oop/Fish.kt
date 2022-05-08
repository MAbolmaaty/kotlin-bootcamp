package oop

class Fish(val friendly: Boolean = true, volumeNeeded: Int) {
    val size: Int

    /**
     * Secondary Constructor,
     * if you do declare a secondary constructor,
     * it must contain a call to the primary constructor by using this,
     * You also have to pass any required arguments
     * */

    constructor() : this(true, 9) {
        println("running secondary constructor")
    }

    /**
     * (init) works just like a constructor and that we can put
     * logic in it to initialize our properties
     * same way you would use a constructor body in other languages
     * you can have more than one init block and they always
     * run before any secondary constructors,
     * and they can be almost anywhere in your class,
     * they're executed in order from the top of the class to
     * the bottom.
     * */

    init {
        if (friendly){
            size = volumeNeeded
        } else {
            size = volumeNeeded * 2
        }
    }

    init {
        println("constructed fish of size $volumeNeeded final size ${this.size}")
    }

    init {
        println("last init block")
    }
}
/**
 * If you make a secondary constructor consider making a helper method instead
 * */

fun makeDefaultFish() = Fish(true, 50)

fun fishExample() {
    val fish = Fish(true, 20)
    println("Is the fish friendly? ${fish.friendly}. It needs volume ${fish.size}")
}

