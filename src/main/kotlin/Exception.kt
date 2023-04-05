import java.io.BufferedReader
import java.io.File
import java.io.FileReader
import java.lang.NumberFormatException

fun parseIntOrThrow (str: String): Int {
    try {
        // 기본 타입과의 형변환은 toType을 사용
        return str.toInt()
    } catch (e: NumberFormatException) {
        throw IllegalArgumentException("주어진 ${str}는 숫자가 아닙니다.")
    }
}

// try catch 구문 역시 expression이기 때문에, return 한번으로 가능
fun parseIntOrThrowNull (str: String): Int? {
    return try {
        str.toInt()
    } catch (e: NumberFormatException) {
        null
    }
}

// Checked Exception , Unchecked Exception 구분하지 않는다.
// 모두 Unchecked Exception 이다. throws 작성 불필요.
fun readFile() {
    val currentFile = File(".")
    val file = File(currentFile.absolutePath + "/a.txt")
    val reader = BufferedReader(FileReader(file))
    println(reader.readLine())
    reader.close()
}