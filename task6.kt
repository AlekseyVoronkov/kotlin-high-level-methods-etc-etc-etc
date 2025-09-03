fun main(args: Array<String>) {
    val inputLine: String = if (args.isNotEmpty()) {
        args.joinToString(" ")
    } else {
        readLine() ?: ""
    }

    val splittedInput = inputLine.split(" ")
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