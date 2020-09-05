sealed class Db {
    data class MySQL(val id: Int, val conn: String): Db()
    data class MongoDb(val id: Int, val conn: String): Db()
    data class PostgreSQL(val id: Int, val conn: String, val isDone: Boolean): Db()
}