// 함수 선언 문법
fun main() {
    // named argument : 매개변수 이름을 통해 값을 직접 지정
    // builder를 직접 만들지 않고, builder의 장점을 가지게 된다
    repeat("Hello Kotlin", useNewLine = false)

    // 가변인자로 사용 할 경우, 스프레드 연산자(*)를 붙여줘야한다.
    val array = arrayOf("Apple", "Banana", "Grape")
    printAll(*array)
}
// 함수가 하나의 결과값이면 block 대신 = 사용 가능.
// = 을 사용하는 경우, 반환 타입 생략 가능.
// public의 경우 생략가능
public fun max (a: Int, b: Int) = if (a > b) a else b

// default parameter
fun repeat (
    str: String,
    num: Int = 3, // 밖에서 파라미터를 넣어주지 않으면 기본값을 사용
    useNewLine: Boolean = true
) {
    for (i in 1..num) {
        if (useNewLine) {
            println(str)
        } else {
            println(str)
        }
    }
}

// 같은 타입의 여러 파라미터 받기 (가변인자)
fun printAll(vararg strings: String) {
    for (str in strings) {
        println(str)
    }
}