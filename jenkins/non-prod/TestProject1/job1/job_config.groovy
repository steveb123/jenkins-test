folder('TestProject1') {
    displayName('TestProject1')
    description('Folder for TestProject1 jobs')
}
pipelineJob('TestProject1/job1') {
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
      scriptPath('jenkins/non-prod/TestProject1/job1/Jenkinsfile')
      lightweight()
    }
  }
}
