fun main(){
    /**
     * basic array*/
    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
    val interestingThings2 = listOf("Kotlin", "Programming", "Comic Books")
//    println(interestingThings.size)
//    println(interestingThings[0])
//    println(interestingThings.get(0))
//
//    for (interestingThing in interestingThings){
//        println(interestingThing)
//    }

//    interestingThings.forEach {
//        // (it) is the default name for each element int the array
//        // that is passed into this lambda function
//        println(it)
//    }

    /**
     * If you have a function and it's only parameter is another function, then you can omit
     * the parentheses all together*/
//    interestingThings.forEach {
//        interestingThing -> println(interestingThing)
//    }
    
//    interestingThings.forEachIndexed { index, interestingThing ->
//        println("$interestingThing is at index $index")
//    }

    /**
     * maps*/

    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
    map.forEach { key, value ->  println("$key -> $value") }
}