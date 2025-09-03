fun main() {
    val userInput = readLine()!!
    val splittedInput = userInput.split(" ")
    val frequencyMap = mutableMapOf<String, Int>()

    splittedInput.forEach { word ->
        frequencyMap[word] = (frequencyMap[word] ?: 0) + 1
    }

    val distinctWords = splittedInput.distinct()
    val sortedWords = distinctWords.sortedWith(
        compareByDescending<String> { frequencyMap[it] }.thenBy { it }
    )

    sortedWords.forEach { word ->
        println("$word ${frequencyMap[word]}")
    }
}