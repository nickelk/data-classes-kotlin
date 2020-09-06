sealed class Db {
    data class MySQL(val id: Int, val conn: String): Db()
    data class MongoDb(val id: Int, val conn: String): Db(){
//        fun printInfo(){
//            println("MongoDb has id: $id and connection: $conn")
  //      }
    }
    data class PostgreSQL(val id: Int, val conn: String, val isDone: Boolean): Db()
    object Help : Db(){
        val conn = "Connection done"
    }
}

val Db.MongoDb.info: String
    get() = "MongoDb has id: $id and connection: $conn"

fun Db.MongoDb.printInfo() {
    println(info)
}