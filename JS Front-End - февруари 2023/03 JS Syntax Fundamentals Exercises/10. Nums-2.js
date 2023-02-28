function solve(num){

    let arr = Array.from(String(num));

    let result = 0;
    let flag = 'true';
    let number = Number(arr[0]);

    for(const i of arr){

        let temp = Number(i);

        result += temp;

        if(temp !== number){
            flag = 'false'
        }
    }

    console.log(flag)
    console.log(result)

}
solve(0)
solve(000)
solve(011)
solve(0111)

solve(2222222)
solve(1234)


