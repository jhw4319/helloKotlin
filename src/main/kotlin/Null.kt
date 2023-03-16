
fun main() {

    // Safe Call : null이 아닌경우에만 실행.
    val str: String? = "Safe"
    println(str?.length)
    // Elvis
    println(str?.length ?: 0)
}

fun startWithA(str: String?): Boolean {
    return str?.startsWith("A")
        ?: throw IllegalArgumentException("null이 들어왔습니다.")
}