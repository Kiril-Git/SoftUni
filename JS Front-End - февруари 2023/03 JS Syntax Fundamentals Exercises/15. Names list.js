function solve(arr){

    let sortedArr = arr.sort((a, b) => a.localeCompare(b));

    let counter = 0;

    for (let i = 0; i < sortedArr.length; i++) {

        counter++;
        let temp = sortedArr[i];
        
        console.log(`${counter}.${temp}`)
    }
}


solve(["John", "Bob", "Christina", "Ema"])