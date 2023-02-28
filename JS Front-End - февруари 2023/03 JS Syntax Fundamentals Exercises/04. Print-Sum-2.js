function solve(firstN, lastN){

    let result = 0;

    let str = '';

    for (let i = firstN; i <= lastN; i++) {

        result += i;

        str += i + ' ';

    }
    // console.log(str)

    console.log(`${str.trim()}`)    // remove last space


    console.log(`Sum: ${result}`)


}
solve(5, 10)
solve(0, 26)