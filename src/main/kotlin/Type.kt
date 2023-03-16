
fun main() {
    // 기본 타입
    val number1: Int? = 1
    val number2: Long = number1?.toLong() ?: 0L

}

fun printAge(obj: Any) {
    // is -> Java의 instanceof: obj가 Person이면 true. 아니면 false
    // !is -> 반대의 경우
    if (obj is Person) {
        // as -> 타입 캐스팅. obj를 Person타입으로 간주한다.
        //        // as? -> obj가 null이거나 Person타입이 아니면 null
        val person = obj as Person
        println(person.name)
    }
}