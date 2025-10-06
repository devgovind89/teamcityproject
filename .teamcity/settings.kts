import jetbrains.buildServer.configs.kotlin.v2019_2.*
import jetbrains.buildServer.configs.kotlin.v2019_2.buildSteps.script

version = "2019.2"

project {
    vcsRoot(GitVcs)

    buildType(Build)
}

object GitVcs : GitVcsRoot({
    name = "origin"
    url = "https://github.com/youruser/teamcityproject.git" // <-- change to your repo
    branch = "refs/heads/main"
})

object Build : BuildType({
    name = "Node.js: test"

    vcs {
        root(GitVcs)
    }

    steps {
        script {
            name = "Install"
            scriptContent = "npm install"
        }
        script {
            name = "Test"
            scriptContent = "npm test"
        }
    }

    triggers {
        vcs {
        }
    }
})
