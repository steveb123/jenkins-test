pipelineJob('test-pipeline-2') {
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
      scriptPath('jenkinsfiles/test2-jenkinsfile')
      lightweight()
    }
  }
}
