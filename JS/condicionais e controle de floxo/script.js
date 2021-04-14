/*
//IF ELSE
let temperature = 36.3

if(temperature >=37){
    console.log('febre');
}else if(temperature >=37.5){
    console.log('febre alta')
}else {
    console.log('Saudável')
}
//SWOTCH
let number1 = 13;
let number2 = 7;
let operator = '-';

function Calculate(number1, operator, number2){
    let result

    switch(operator){
        case '+':
            console.log(number1 + number2);
            break;
        case '-':
            console.log(number1 - number2);
            break;
        case '*':
            console.log(number1 * number2);
            break;       
        case '/':
            console.log(number1 / number2);
            break;
        default:
            console.log('operador invalido')
            break;
    }
}

Calculate(number1, operator, number2);
*/
//THROW
function sayMyName (name = ''){
    if(name == ''){
        throw 'nome é obrigatorio'
    }
    console.log('depois do erro')
}
//TRY... CATCH
try{
    sayMyName()
}catch(e){
    console.log(e)
}