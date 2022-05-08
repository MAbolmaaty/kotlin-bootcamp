package oop

import java.lang.Math.PI

/**
 * In kotlin, everything is public by default,
 * That means all of your variables and classes can be accessed everywhere
 * */

/**
 * (internal) visible anywhere in the same module
 * */

/**
 * subclasses cannot see private members
 * (protected) the same as private,
 * but members are also visible to subclasses
 * */

/**
 * This class inherits from the top level class (Any)
 * To be able to inherit from a class, make the class open,
 * By default, classes are not subclassible, we have to explicitly allow it
 * */

open class Aquarium (var length: Int = 100, var width: Int = 20, var height: Int = 40) {

    open var volume: Int
        get() = width * height * length / 1000
        set(value) {height = (value * 1000) / (width * length)}

    open var water = volume * 0.9

    constructor(numberOfFish: Int): this() {
        val water: Int = numberOfFish * 2000
        val tank: Double = water + water * 0.1
        height = (tank / (length * width)).toInt()
    }
}

class TowerTank(): Aquarium() {
    /**
     * Just like classes, members are not available for subclassing by default,
     * this so we don't leak implementation details without meaning to*/
   override var water = volume * 0.8

   override var volume: Int
        get() = (width * height * length / 1000 * PI).toInt()
        set(value) {height = (value * 1000) / (width * length)}
}