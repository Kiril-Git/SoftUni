function addThenSubtract(a, b, c) {

    const sum = (a, b) => (a + b)

    const subtract = (d, c) => (d - c)

    return subtract(sum(a, b), c);

}
console.log(addThenSubtract(23, 6, 10))
console.log(addThenSubtract(1, 17, 30))
console.log(addThenSubtract(42, 58, 100))