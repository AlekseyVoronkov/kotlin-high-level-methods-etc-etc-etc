fun main() {
    val userInput = readLine()!!
    val result = userInput.split(" ").sorted()
    var frequencyMap = mutableMapOf<String, Int>()

    result.forEach { word ->
        frequencyMap[word] = (frequencyMap[word] ?: 0) + 1
    }

    result.distinct().forEach { word ->
        println(word + " ${frequencyMap[word]}")
    }
}