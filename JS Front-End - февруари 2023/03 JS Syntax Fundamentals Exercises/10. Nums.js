function solve(num){

    let result = 0;
    let iterations = 0;
    let number = 0;   

    let flag;

    if(num === 0){

        flag = 'true';
    }

    while(num !== 0){

    let temp = num % 10;
    number = temp;
    iterations ++;

    num = Math.floor(num/10);

    result += temp;

}
    if (result / iterations === number || flag === 'true'){
        console.log('true')
    }
    else{
        console.log(false)
    }
    console.log(result);
    
}
solve(0000)
solve(2222222)
solve(1234)
