
// 예외처리. new를 할필요가없다.
fun validateScore(score: Int) {
    if (score < 0) {
        throw IllegalArgumentException("${score}은 0보다 작을 수 없습니다.")
    }
}

// if else문
fun getPassOrFail (score: Int): String {
    return if (score >=50) {
        "P"
    } else {
        "F"
    }
}

// switch문. 코틀린에서는 when
fun getGradeSwtich(score: Int): String {
    return when (score) {
        in 90..99 -> "A"
        in 80..89 -> "B"
        else -> "F"
    }
}

// is String을통해 오브젝트가 String인걸 확인헀기때문에, 바로 startsWith을 사용할 수 있다.
fun startWithObj(obj: Any): Boolean {
    return when(obj) {
        is String -> obj.startsWith("A")
        else -> false
    }
}

// when()에 값없이 사용가능.
fun judgeNumber(number: Int) {
    when {
        number == 0 -> println("주어진 숫자는 0입니다.")
        number % 2 == 0 -> println("주어진 숫자는 짝수입니다.")
        else -> println("주어진 숫자는 홀수입니다.")
    }
}