job('First-Maven_project-Via-DSL') {
   description("First Maven job generated by DSL on ${new Date()}")
    scm {
        github('https://github.com/akalam007/time-tracker.git', 'master')
    }
    triggers {
        scm('* * * * *')
    }
    steps {
        maven('clean package')
    }
    publishers {
        archiveArtifacts('**/*.war')
    }

}