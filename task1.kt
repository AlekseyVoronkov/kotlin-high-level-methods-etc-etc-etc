fun main() {
    val userInput = readLine()!!
    val result = userInput.split(" ")

    result.forEach { word ->
        println(word)
    }
}