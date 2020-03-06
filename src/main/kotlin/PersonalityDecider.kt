class PersonalityDecider {
    fun computeScores(vararg trait: String): PersonalityResult {
        return PersonalityResult(
            mapOf(
                frequencyForPersonalityType(trait, PersonalityType.RED),
                frequencyForPersonalityType(trait, PersonalityType.YELLOW),
                frequencyForPersonalityType(trait, PersonalityType.GREEN),
                frequencyForPersonalityType(trait, PersonalityType.BLUE)
            )
        )
    }

    private fun frequencyForPersonalityType(trait: Array<out String>, personalityType: PersonalityType) =
        personalityType to trait.filter { Trait.valueOf(it).personalityType == personalityType }.size
}

data class PersonalityResult(val scores: Map<PersonalityType, Int>) {
    fun getScore(type: PersonalityType): Int = scores[type] ?: 0
}

enum class PersonalityType { RED, YELLOW, GREEN, BLUE }

enum class Trait(val personalityType: PersonalityType) {
    // Red
    `Aggressive`(PersonalityType.RED),
    `Ambitious`(PersonalityType.RED),
    `String-willed`(PersonalityType.RED),
    `Goal-oriented`(PersonalityType.RED),
    `Pushing`(PersonalityType.RED),
    `Problem-solver`(PersonalityType.RED),
    `Pioneer`(PersonalityType.RED),
    `Decisive`(PersonalityType.RED),
    `Innovator`(PersonalityType.RED),
    `Impatient`(PersonalityType.RED),
    `Controlling`(PersonalityType.RED),
    `Performance-oriented`(PersonalityType.RED),
    `Powerful`(PersonalityType.RED),
    `Results-oriented`(PersonalityType.RED),
    `Initiator`(PersonalityType.RED),
    `Speed`(PersonalityType.RED),
    `Timekeeper`(PersonalityType.RED),
    `Intense`(PersonalityType.RED),
    `Opinionated`(PersonalityType.RED),
    `Straightforward`(PersonalityType.RED),
    `Independent`(PersonalityType.RED),
    // Yellow
    `Talkative`(PersonalityType.YELLOW),
    `Enthusiastic`(PersonalityType.YELLOW),
    `Persuasive`(PersonalityType.YELLOW),
    `Creative`(PersonalityType.YELLOW),
    `Optimistic`(PersonalityType.YELLOW),
    `Social`(PersonalityType.YELLOW),
    `Spontaneous`(PersonalityType.YELLOW),
    `Expressive`(PersonalityType.YELLOW),
    `Charming`(PersonalityType.YELLOW),
    `Full of vitality`(PersonalityType.YELLOW),
    `Self-centered`(PersonalityType.YELLOW),
    `Sensitive`(PersonalityType.YELLOW),
    `Adaptable`(PersonalityType.YELLOW),
    `Inspiring`(PersonalityType.YELLOW),
    `Needs attention`(PersonalityType.YELLOW),
    `Encouraging`(PersonalityType.YELLOW),
    `Communicative`(PersonalityType.YELLOW),
    `Flexible`(PersonalityType.YELLOW),
    `Open`(PersonalityType.YELLOW),
    `Sociable`(PersonalityType.YELLOW),
    `Imaginative`(PersonalityType.YELLOW),
    `Easygoing`(PersonalityType.YELLOW),
    // Green
    `Patient`(PersonalityType.GREEN),
    `Relaxed`(PersonalityType.GREEN),
    `Self-controlled`(PersonalityType.GREEN),
    `Reliable`(PersonalityType.GREEN),
    `Composed`(PersonalityType.GREEN),
    `Loyal`(PersonalityType.GREEN),
    `Modest`(PersonalityType.GREEN),
    `Understanding`(PersonalityType.GREEN),
    `Lengthy`(PersonalityType.GREEN),
    `Stable`(PersonalityType.GREEN),
    `Prudent`(PersonalityType.GREEN),
    `Discreet`(PersonalityType.GREEN),
    `Supportive`(PersonalityType.GREEN),
    `Good listener`(PersonalityType.GREEN),
    `Helpful`(PersonalityType.GREEN),
    `Producer`(PersonalityType.GREEN),
    `Persistent`(PersonalityType.GREEN),
    `Reluctant`(PersonalityType.GREEN),
    `Thoughtful`(PersonalityType.GREEN),
    `Conceals feelings`(PersonalityType.GREEN),
    `Considerate`(PersonalityType.GREEN),
    `Kind`(PersonalityType.GREEN),
    // Blue
    `Conscientious`(PersonalityType.BLUE),
    `Systetmatic`(PersonalityType.BLUE),
    `Distant`(PersonalityType.BLUE),
    `Correct`(PersonalityType.BLUE),
    `Conventional`(PersonalityType.BLUE),
    `Seems insecure`(PersonalityType.BLUE),
    `Objective`(PersonalityType.BLUE),
    `Structured`(PersonalityType.BLUE),
    `Analytical`(PersonalityType.BLUE),
    `Perfectionist`(PersonalityType.BLUE),
    `Needs time`(PersonalityType.BLUE),
    `Reflecting`(PersonalityType.BLUE),
    `Methodical`(PersonalityType.BLUE),
    `Seeks facts`(PersonalityType.BLUE),
    `Quality-oriented`(PersonalityType.BLUE),
    `Scrutinizes`(PersonalityType.BLUE),
    `Follows rules`(PersonalityType.BLUE),
    `Logical`(PersonalityType.BLUE),
    `Questioning`(PersonalityType.BLUE),
    `Meticulous`(PersonalityType.BLUE),
    `Reserved`(PersonalityType.BLUE)
    ;
}