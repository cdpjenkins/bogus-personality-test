fun main(args: Array<String>) {

    val numberOfQuestions = 10


    val traits = Trait.values().toList().shuffled().take(numberOfQuestions)

    val responses = traits.map { trait ->
        val response: Boolean = askOneQuestion(trait.toString())
        trait to response
    }
        .filter { it.second}
        .map { it.first.toString() }

    val scores: PersonalityResult = PersonalityDecider().computeScores(* responses.toTypedArray<String>())

    println(scores)

    println("Here are your scores:")
    PersonalityType.values().forEach {
        val type = it
        val score = scores.getScore(it)

        val thingie = score.toDouble() / numberOfQuestions
        println("$type: $thingie")
    }
}

private fun askOneQuestion(question: String): Boolean {
    println(question)
    val something = readLine()
    return something == "y" || something == "yes"
}
