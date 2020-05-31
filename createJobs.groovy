pipelineJob('pipelineJob') {
    definition {
        cps {
            script(readFileFromWorkspace('pipelineJob.groovy'))
            sandbox()
        }
    }
}
pipelineJob('jenkins-api-demo-job') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/rampravesh/jenkins-api-demo.git'
                    }
                    branch 'master'
                }
            }
        }
    }
}

pipelineJob('jenkins-api-demo-job-docker') {
    definition {
        cpsScm {
            scm {
                git {
                    remote {
                        url 'https://github.com/rampravesh/jenkins-api-demo.git'
                    }
                    branch 'master'
                    scriptPath 'Jenkinsfile-docker'
                }
            }
        }
    }
}