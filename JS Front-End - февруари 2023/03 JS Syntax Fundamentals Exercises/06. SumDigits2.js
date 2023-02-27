function solve(num){

    let str = num.toString();   //  make num a string
    let result = 0;

    for(const i of str){

        let temp = Number(i);   //  restore the digit to a number

        result += temp;
    }
    console.log(result)
    }

solve(245678);
solve(97561);
solve(543);