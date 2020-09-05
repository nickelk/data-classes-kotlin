class Some {
    companion object{ //static objects
        var count = 0
    }

    init {
        count++
        if(count == 1) println("1 object created")
        else println("$count objects created")
    }
}

fun main(args: Array<String>) {
    //Some.count = 5
    val some = Some()
    val some_2 = Some()
    val some_3 = Some()
    val some_4 = Some()
}