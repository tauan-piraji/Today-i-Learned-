let family = {
    incomes: [2500, 3000, 257.90],
    expenses: [320.80, 815.55, 100]
}

function sum(array){
    let total = 0

    for(let value of array){
        total += value;
    }

    return total;
}

function calculateBalance(){
    const calculateIncomes = sum(family.incomes);
    const calculateExpenses = sum(family.expenses);
    const total = calculateBalances - calculateExpenses;
    const itsOk = total >= 0;

    let balanceText = "negativo"

    if(itsOk){
        balanceText = "positivo"
    }

    console.log(`seu saldo é ${balanceText}: &{total}`)
}