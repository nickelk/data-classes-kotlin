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

    val db = Db.MongoDb(5, "mongo")
    val db2 = Db.PostgreSQL(6, "postgre", true)

    val dbCopy = db.copy(id = 7, conn = "done")
    if(db == dbCopy) println("They are equal")
    else println("They are not equal")

    if(db is Db.MongoDb){
        db.printInfo()
    }
    //Some.count = 5
//    val some = Some()
//    val some_2 = Some()
//    val some_3 = Some()
//    val some_4 = Some()
}