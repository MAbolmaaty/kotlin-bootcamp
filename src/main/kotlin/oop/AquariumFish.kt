package oop

abstract class AquariumFish {
    abstract val color: String
}

class Shark: AquariumFish(), FishAction{
    override val color = "gray"

    override fun eat() {
        println("hunt and eat fish")
    }

    override fun jump() {
        TODO("Not yet implemented")
    }

    override fun clean() {
        TODO("Not yet implemented")
    }

    override fun catchFish() {
        TODO("Not yet implemented")
    }
}

class Plecostomus: AquariumFish(), FishAction{
    override val color = "gold"
    override fun eat() {
        println("much on algae")
    }

    override fun jump() {
        TODO("Not yet implemented")
    }

    override fun clean() {
        TODO("Not yet implemented")
    }

    override fun catchFish() {
        TODO("Not yet implemented")
    }
}

interface FishAction {
    fun eat()
    fun jump()
    fun clean()
    fun catchFish()
    fun swim() {
        println("swim")
    }
}