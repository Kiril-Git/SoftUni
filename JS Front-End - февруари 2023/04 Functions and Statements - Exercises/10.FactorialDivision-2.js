function solve(a, b){

    return factorialCalc(a) / factorialCalc(b).toFixed(2)

}
console.log(solve(5, 2));
console.log(solve(6, 2));





function factorialCalc(n){

    let sum = n;

    for (let i = n-1; i > 0; i--) {

        sum *= i;

    }
    return(sum)
}


