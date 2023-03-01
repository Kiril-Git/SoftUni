const numbers = [2, 5, -6, 100, 4];

const sortedNums = numbers.sort((a, b) => {
    return a-b;
});

/*
2 - 5 = -3
100 - 4 = 96
*/


console.log(sortedNums);