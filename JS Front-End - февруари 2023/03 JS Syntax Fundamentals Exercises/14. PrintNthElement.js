function solve(arr, num){

    // let iterations = arr.length % num;       - avoiding unnecessary iterations 

    let result = [];

    for (let i = 0; i < arr.length; i+=num) {

        let temp = arr[i];

        result.push(temp);
        
        
    }
    console.log(result)
}

solve(['5', '20', '31', '4', '20'], 2)
solve(['dsa','asd', 'test', 'tset'], 2)
solve(['1', '2','3', '4', '5'], 6)