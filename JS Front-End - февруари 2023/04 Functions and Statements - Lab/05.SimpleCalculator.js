function solve(n1, n2, operator) {

    const add = (n1, n2) => n1 + n2;
    const subtract = (n1, n2) => n1 - n2;
    const multiply = (n1, n2) => n1 * n2;
    const divide = (n1, n2) => n1 / n2;


    switch (operator) {
        case 'add':
            return add(n1, n2);
        case 'subtract':
            return subtract(n1, n2);
        case 'multiply':
            return multiply(n1, n2);
        case 'divide':
            return divide(n1, n2);
    }
}

    console.log(solve(12, 19, 'add'))
    console.log(solve(5, 5, 'multiply'))


