function solve(n){

    let arr = [];

    for (let i = 0; i < n; i++) {

        arr.push(n);                //  arr += n + ' ';

    }
    for (let j = 0; j < n; j++) {
        console.log(arr.join(' '))
    }
}
solve(3)