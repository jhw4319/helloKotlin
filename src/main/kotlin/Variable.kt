

fun main() {

    // 가변 변수
    // JAVA -> long number1 = 10L;
    // 타입 지정 안해도된다. 컴파일러가 값을 토대로 타입을 추론.
    var number1 = 10L
    // 타입 지정
    var number2: Long = 5
    println(number2)

    // 불변 변수
    // JAVA -> final long number3 = 20L;
    val number3 = 20L

    // 내부적으로 상황에 따라서 코틀린이 알아서 primitive타입을 사용한다
    // JAVA -> Long number4 = 1_000L;
    var number4: Long = 1_000L

    // nullable 변수
    // null이 변수에 들어갈 수 있다면 "타입?"를 사용해야한다
    var number5: Long?
    number5 = null

    // 객체 인스턴스화
    // 객체 인스턴스화 할 때에는 new를 붙이지 않아야 한다.
    // JAVA -> Person person = new Person("jhw");
    val person = Person("jhw")
    println(person.name)

}