def Build(){
    sh 'echo "Building......."'
}
def Test(){
    choice == '2' || choice == '3'
    sh 'echo "Testing........."'
}
def Deployed(){
    sh 'echo "deployed......."'
}