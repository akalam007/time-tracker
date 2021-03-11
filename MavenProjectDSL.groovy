job('First-Maven_project-Via-DSL') {
   description("First Maven job generated by DSL on ${new Date()}")
    scm {
        github('jenkinsci/job-dsl-plugin', 'master')
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
