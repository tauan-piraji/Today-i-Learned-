let Celsius = '34c';
let fahrenheit = '50f';

function transformDegree (degree){
    const celsiusExists = degree.toUpperCase().includes('C');
    const fahrenheitExists = degree.toUpperCase().includes('F');

    if(!celsiusExists && !fahrenheitExists){
        throw new Error('Grau não indentificado');
    }

    let updateDegree = Number(degree.toUpperCase().replace("F",""));
    let formula = (fahrenheit) => (fahrenheit-32) * 5/9;
    let degreeSing = 'C';

    if(celsiusExists){
        updateDegree = Number(degree.toUpperCase().replace("C",""));
        formula = (celsius) => celsius * 9/5 +32;
        degreeSing = 'F';
    }

    return formula(updateDegree) + degreeSing;
}

try{
    transformDegree('50f');
}catch(error){
    console.log(error);
}