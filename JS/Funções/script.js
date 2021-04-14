/*
//declaration 
function printPhrases () {
    console.log('Estudar é muito bom');
    console.log('Perseverança');
}
//execute, rum, call and invoke
printPhrases();

//function anonymous

const sum = function(A,B){
    console.log(A + B);
    //let total usar criação de variavel 
    return A+B;
}
sum(2,4); //ARGUMENT

let number1 = 35;
let number2 = 55;

sum(number1,number2);

console.log(`o numero 1 é ${number1}`);
console.log(`o numero 2 é ${number2}`);
console.log(`a soma é ${sum(number1,number2)}`);

function sayMyName(name){
    console.log('say my name!!')
    name();//function callback
    console.log('you goddamn right')
    console.log('função callBack executada')
}

sayMyName(
    () => {
        console.log('Tauan')
    }//function arrow
)
*/
//Função construtora

function Person(name){
    this.name=name;
    this.walk = function(){
        return this.name + " esta andando";
    }
}

const mayk = new Person("mayk");//instanciar new object
const joao = new Person("joao");

console.log(mayk);
console.log(joao.walk());

console.log('fim do programa');