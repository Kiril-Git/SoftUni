function solve(num){

    let result = 0;

    while (num !== 0){

        let temp = 0;

        temp = num % 10;

        result += temp;

        // num /= 10;

        num = Math.floor(num / 10);

        // num = parseInt(num)
    }
    console.log(result)
}
solve(245678);
solve(97561);
solve(543);