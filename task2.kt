fun main() {
    val userInput = readLine()!!
    val result = userInput.split(" ").sorted()

    result.forEach { word ->
        println(word)
    }
}
