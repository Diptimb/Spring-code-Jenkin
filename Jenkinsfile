node{
stage('SCM Checkout'){
git 'https://github.com/Diptimb/Spring-code-Jenkin'
}
stage('Compile Package'){
def mvnHome= tool name: 'Maven 3', type: 'maven'
sh "${mvnHome}/bin/mvn package"
}
}
