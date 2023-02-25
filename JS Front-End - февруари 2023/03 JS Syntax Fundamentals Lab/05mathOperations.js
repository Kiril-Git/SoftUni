function solve(firstN, secondN, operator){

    let result;

    switch(operator){

        case '+':
            result = firstN + secondN;
            break;
        case '-':
            result = firstN - secondN;
            break;
        case '*':
            result = firstN * secondN;
            break    ; 
        case '/':
                result = firstN / secondN;
            break;
        case '%':
            result = firstN % secondN;
            break    ; 
        case '**':
                result = firstN ** secondN;
            break;                       
    }
    console.log(result)
}
solve(5, 6, '+')

solve(3, 5.5, '*')