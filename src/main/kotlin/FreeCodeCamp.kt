fun main(){
    /**
     * basic array*/
//    val interestingThings = arrayOf("Kotlin", "Programming", "Comic Books")
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

//    val map = mapOf(1 to "a", 2 to "b", 3 to "c")
//    map.forEach { key, value ->  println("$key -> $value") }

    /**
     * by default a collection type in kotlin is immutable
     * so that you can't add or subtract values from that collection
     * once it's initially created */

//    val interestingThings3 = mutableListOf("Kotlin", "Programming", "Comic Books")
//    interestingThings3.add("Dogs")
//
//    val map2 = mutableMapOf(1 to "a", 2 to "b", 3 to "c")
//    map2.put(4, "d")

}

fun sayHello(greeting: String, vararg itemsToGreet: String) {
    itemsToGreet.forEach {
        itemToGreet ->
        println("$greeting $itemToGreet")
    }
}

