const boys = [
    {name: 'Donga', age: 51 },
    {name: 'Buzema', age: 50 },
    {name: 'Kozhata', age: 52 },
    {name: 'Kalinov', age: 49 },

]

// const comparator = (a, b) => {          //      sorted by age
//     return a.age - b.age;
// }

const comparator = (a, b) => {          //      sorted by the name length
    return a.name.length - b.name.length;
}

console.log(boys.sort(comparator))