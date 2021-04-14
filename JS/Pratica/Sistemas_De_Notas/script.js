let score = 87;
let scoreA = score >= 90;
let scoreB = score >= 80 && score < 90;
let scoreC = score >= 70 && score < 80;
let scoreD = score >= 60 && score < 70;
let scoreE = score >= 50 && score < 60;

if(scoreA){
    console.log('A')
}else if(scoreB){
    console.log('B')
}else if(scoreC){
    console.log('C')
}else if(scoreD){
    console.log('D')
}else{
    console.log('E')
}