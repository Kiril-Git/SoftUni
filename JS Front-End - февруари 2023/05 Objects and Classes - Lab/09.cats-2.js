function solve(input) {
    class Cat {

        constructor(name, age) {
            this.name = name
            this.age = age
        }
    }
    for (let el of input) {

        let [name, age] = el.split(' ');
       let cat = new Cat(name, age);
       sayHello(cat)
    }
    function sayHello(cat) {
        console.log(`${cat.name}, age ${cat.age} says Meow`)
    }
}
solve(['Mellow 2', 'Tom 5'])
solve(['Candy 1', 'Poppy 3', 'Nyx 2'])