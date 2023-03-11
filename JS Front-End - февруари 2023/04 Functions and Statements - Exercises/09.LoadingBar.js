function solve(n){

    let result = '';

    let loaded = n/10;

    for (let i = 0; i < loaded; i++) {

        result += '%';

    }
    for (let i = loaded; i < 10; i++) {
        result += '.';

    }
    if (n === 100){
        console.log(`100% Complete!`)
    }
    else {
        console.log(`${n}% [${result}]`)
        console.log(`Still loading...`)
    }
}

solve(30)
solve(100)
solve(0)
