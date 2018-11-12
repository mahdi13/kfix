package perfect.ktor

fun main() {
    val c: Client = Client("127.0.0.1", 5001)
    c.connect()
    while (true) {
//        Keep Alive
    }
}