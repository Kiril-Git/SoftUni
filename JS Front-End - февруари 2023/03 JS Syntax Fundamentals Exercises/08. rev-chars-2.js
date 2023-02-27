function solve(first, second, third){

    let arr = [first, second, third];
    let arr2 = [];

    for (let i = 0; i < arr.length; i++) {

        let temp = arr.pop();       // pop the last el

        arr.unshift(temp);          //  return the last at the front

        arr2.push (temp);           //  push in the new arr

    }

    
    console.log(arr2.join(' '))

}
solve('A', 'B', 'C')
solve('1', 'L', '&')