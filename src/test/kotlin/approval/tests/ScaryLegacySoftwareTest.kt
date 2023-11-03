package approval.tests

import org.approvaltests.Approvals
import org.junit.jupiter.api.Test

class ScaryLegacySoftwareTest {


    @Test
    fun `a test`() {
        val scaryLegacySoftware = ScaryLegacySoftware()
        val results = (1..100).map {testValue ->
            scaryLegacySoftware.rollTheDice(testValue)
        }

        Approvals.verify(results.joinToString("\n"))
    }

}
