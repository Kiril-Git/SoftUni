function solve(arr){

    let sortedArr = [...arr].sort((a, b) => a - b);

    let result = [];

    while ( 0 !== sortedArr.length) {

        let temp1 = sortedArr.shift();
        let temp2 = sortedArr.pop();

        result.push(temp1);
        result.push(temp2);

    }

    console.log(result);


}
solve([1, 65, 3, 52, 48, 63, 31, -3, 18, 56])