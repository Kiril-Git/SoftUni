function mathPow(num, pow){

    let result = 1;

    for (let i = 0; i < pow; i++) {
        

        result *= num;

    }
    return(result);
}


function calcSum(first, second, third){

    return first + second + third;

}

console.log(calcSum(10, 5, mathPow(5, 2)));