pipelineJob('job-dsl-plugin') {
  definition {
    cpsScm {
      scm {
        git {
          remote {
            url('https://github.com/steveb123/jenkins-test.git')
          }
          branch('*/master')
        }
      }
      scriptPath(jenkinsfiles/test1-jenkinsfile)
      lightweight()
    }
  }
}
