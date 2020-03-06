import com.natpryce.hamkrest.assertion.assertThat
import com.natpryce.hamkrest.equalTo
import org.junit.jupiter.api.Test

class PersonalityDeciderTest {
    val personalityDecider = PersonalityDecider()

    @Test
    internal fun `Agressive is a Red trait`() {
        val result = personalityDecider.computeScores("Aggressive")
        assertThat(result.getScore(PersonalityType.RED), equalTo(1))
        assertThat(result.getScore(PersonalityType.YELLOW), equalTo(0))
        assertThat(result.getScore(PersonalityType.GREEN), equalTo(0))
        assertThat(result.getScore(PersonalityType.BLUE), equalTo(0))
    }

    @Test
    internal fun `Talkative is a Yellow trait`() {
        val result = personalityDecider.computeScores("Talkative")
        assertThat(result.getScore(PersonalityType.RED), equalTo(0))
        assertThat(result.getScore(PersonalityType.YELLOW), equalTo(1))
        assertThat(result.getScore(PersonalityType.GREEN), equalTo(0))
        assertThat(result.getScore(PersonalityType.BLUE), equalTo(0))
    }

    @Test
    internal fun `Patient is a Green trait`() {
        val result = personalityDecider.computeScores("Patient")
        assertThat(result.getScore(PersonalityType.RED), equalTo(0))
        assertThat(result.getScore(PersonalityType.YELLOW), equalTo(0))
        assertThat(result.getScore(PersonalityType.GREEN), equalTo(1))
        assertThat(result.getScore(PersonalityType.BLUE), equalTo(0))
    }

    @Test
    internal fun `Conscientious is a Blue trait`() {
        val result = personalityDecider.computeScores("Conscientious")
        assertThat(result.getScore(PersonalityType.RED), equalTo(0))
        assertThat(result.getScore(PersonalityType.YELLOW), equalTo(0))
        assertThat(result.getScore(PersonalityType.GREEN), equalTo(0))
        assertThat(result.getScore(PersonalityType.BLUE), equalTo(1))
    }

    @Test
    internal fun `A combination of traits`() {
        val result = personalityDecider.computeScores(
            "Impatient",
            "Talkative", "Self-centered",
            "Modest", "Understanding", "Supportive",
            "Analytical", "Follows rules", "Logical", "Reserved"
        )

        assertThat(result.getScore(PersonalityType.RED), equalTo(1))
        assertThat(result.getScore(PersonalityType.YELLOW), equalTo(2))
        assertThat(result.getScore(PersonalityType.GREEN), equalTo(3))
        assertThat(result.getScore(PersonalityType.BLUE), equalTo(4))
    }
}

