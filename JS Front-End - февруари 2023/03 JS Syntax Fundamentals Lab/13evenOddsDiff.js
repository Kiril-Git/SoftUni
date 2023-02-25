function solve(arr){

    let evens = 0;
    let odds = 0;

    for(let i=0; i < arr.length; i++){

        let temp = arr[i];

        if (temp % 2 === 0) {
            evens += temp
        }
        else{
            odds += temp;
        }
    }
    console.log( evens - odds)

}
solve([1,2,3,4,5,6])
solve([3,5,7,9])
solve([2,4,6,8,10])