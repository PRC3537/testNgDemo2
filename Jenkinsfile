pipeline{    agent {        docker { image 'maven' }    }    stage('mvn build'){        //mvn构建        sh "ls -la"        sh "pwd"        sh "mvn clean install -Dmaven.test.skip=true"    }    stage('deploy'){        //执行部署脚本        echo "deploy ......"    }}