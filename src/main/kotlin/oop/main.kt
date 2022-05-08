package oop

fun main(args: Array<String>){
    buildAquarium()
}

fun buildAquarium(){
//    val myAquarium = Aquarium()
//    println("Length: ${myAquarium.length} " +
//    "Width: ${myAquarium.width} " +
//    "Height: ${myAquarium.height}")
//
//    myAquarium.height = 80
//    println("Height: ${myAquarium.height} cm")
//
//    println("Volume: ${myAquarium.volume} liters")
//
//    val simpleSpice = SimpleSpice()
//    println("${simpleSpice.name} ${simpleSpice.heat}")
//
//    val smallAquarium = Aquarium(length = 20, width = 15, height = 30)
//    println("Small Aquarium: ${smallAquarium.volume} liters")

//    val myAquarium2 = Aquarium(numberOfFish = 9)
//    println("Small Aquarium 2: ${myAquarium2.volume} liters with " +
//    "length ${myAquarium2.length} " + "width ${myAquarium2.width} " +
//    "height ${myAquarium2.height} ")

//    val spices1 = listOf(
//        Spice("curry", "mild"),
//        Spice("pepper", "medium"),
//        Spice("cayenne", "spicy"),
//        Spice("ginger", "mild"),
//        Spice("red curry", "medium"),
//        Spice("green curry", "mild"),
//        Spice("hot pepper", "extremely spicy")
//    )
//
//    val spice = Spice("cayenne", spiciness = "spicy")
//
//    val spicelist = spices1.filter { it.heat < 5 }
    makeFish()
}

fun feedFish(fish: FishAction){
    fish.eat()
}

fun makeFish(){
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color} \n Plecostomus: ${pleco.color}")

    shark.eat()
    pleco.eat()
}