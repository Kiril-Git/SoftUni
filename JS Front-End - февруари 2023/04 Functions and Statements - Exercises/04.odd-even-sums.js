function solve(num){
    sumOdds = 0;
    sumEvens = 0;

    for (let i of num.toString()) {

        temp = Number(i);

        if (temp % 2 === 0){
            sumEvens += temp
        }
        else {
            sumOdds += temp
        }

    }
    console.log(`Odd sum = ${sumOdds}, Even sum = ${sumEvens}`)

}
solve(1000435)
solve(3495892137259234)