function solve(...nums){

    return nums
        .filter((i) => i % 2 === 0)
}
console.log(solve(3, 7, 9, 100).join(', '))