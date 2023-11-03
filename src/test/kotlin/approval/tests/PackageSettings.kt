package approval.tests

import org.approvaltests.reporters.JunitReporter

@Suppress("unused")
class PackageSettings {
    companion object {
        // Do not spawn an external process to show a diff.
        @JvmField
        var UseReporter = JunitReporter()

        // Store expected results in ./approvals subdirectory
        @JvmField
        var UseApprovalSubdirectory = "approvals"
    }
}
