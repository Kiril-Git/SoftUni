function solve(firstN, secondN, thirdN){

    let result;

    if(firstN > secondN && firstN > thirdN){
        result = firstN;
    }
    else if(secondN > firstN && secondN > thirdN){
        result = secondN;
    }
    else{
        result = thirdN;
    }
    console.log(`The largest number is ${result}.`)
}

solve(5, -3, 16)
solve(-3, -5, -22.5)