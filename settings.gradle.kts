rootProject.buildFileName = "build.gradle.kts"

include(":app")
include(":domain")
include(":presentation:common", ":presentation:login")
include(":data:server")

include(":server")
