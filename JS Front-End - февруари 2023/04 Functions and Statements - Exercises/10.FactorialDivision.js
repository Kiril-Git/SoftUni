function solve(a, b){

    let n1 = factorialCalc(a);
    let n2 = factorialCalc(b);

    let sum = n1 / n2;

    console.log(sum.toFixed(2));
}

solve(5, 2);
solve(6, 2);




function factorialCalc(n){

    let sum = n;

    for (let i = n-1; i > 0; i--) {

        sum *= i;

    }
    return(sum)
}


