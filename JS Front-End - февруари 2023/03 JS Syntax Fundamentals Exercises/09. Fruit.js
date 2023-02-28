function solve(fruit, weight, price){

    let kg = weight / 1000;

    let result = kg * price;


    console.log(`I need $${result.toFixed(2)} to buy ${kg.toFixed(2)} kilograms ${fruit}.`)
}
solve('orange', 2500, 1.80)
solve('apple', 1563, 2.35)