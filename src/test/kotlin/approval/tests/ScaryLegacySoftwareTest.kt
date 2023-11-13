package approval.tests

import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import org.approvaltests.Approvals
import org.junit.jupiter.api.Test

class ScaryLegacySoftwareTest {


    @Test
    fun `a test`() {
        val scaryLegacySoftware = ScaryLegacySoftware()

        val result = scaryLegacySoftware.rollTheDice(0)
        Approvals.verify(result)
    }

    @Test
    fun `second`() {
        val scaryLegacySoftware = ScaryLegacySoftware()
        val results = (-100..100).map {
            scaryLegacySoftware.rollTheDice(it)
        }

        Approvals.verify(results)
    }

    @Test
    fun `pretty-print`() {
        val scaryLegacySoftware = ScaryLegacySoftware()

        val result = scaryLegacySoftware.rollTheDice(0)

        val objectMapper = jacksonObjectMapper()

        Approvals.verify(
            objectMapper
                .writerWithDefaultPrettyPrinter()
                .writeValueAsString(result)
        )
    }

}
