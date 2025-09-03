fun main() {
    val userInput = readLine()!!
    val result = userInput.split(" ").sorted().distinct()

    result.forEach { word ->
        println(word)
    }
}