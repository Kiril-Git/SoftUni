function solve(firstN, lastN){

    let result = 0;
    let arr = [];

    // let str = '';

    for (let i = firstN; i <= lastN; i++) {

        result += i;
        arr.push(i);

        // str += i + ' ';

    }
    console.log(`${arr.join(' ')}`)
    console.log(`Sum: ${result}`)

    // console.log(str)

}
solve(5, 10)
solve(0, 26)