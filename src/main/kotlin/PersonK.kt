// constructor는 생략 가능
//class PersonK constructor(name: String, age: Int) {
//    val name = name
//    var age = age
//}

fun main() {
    val person = PersonK("jhw", 31)
    val person2 = PersonK("sam")
    // .set , .get 필요없이 바로 접근 가능
    println(person.name)
    person.age = 32
}
class PersonK(
    // 주생성자(primary constructor) : 반드시 존재해야 한다.
    name: String,
    var age: Int
) {
    // name을 받아 대문자로
    val name: String = name
        // field: 무한 루프를 막기 위한 예약어. 자기 자신을 가리킨다.
        get() = field.uppercase()

    // init(초기화) 블록은 생성자가 호출되는 시점에 호출된다.
    init {
        if (age < 0) {
            throw IllegalArgumentException("나이는${age}일 수 없습니다.")
        }
    }
    // 생성자 추가시 consturctor로 추가!
    constructor(name: String) : this(name, 1)
    // custom getter
    val isAdult: Boolean
        get() = this.age >= 20
}

