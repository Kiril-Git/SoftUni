function solve(input) {
    class Cat {

        constructor(name, age) {
            this.name = name
            this.age = age
        }

        sayHello() {
            console.log(`${this.name}, age ${this.age} says Meow`)
        }
    }
    let cats = [];

    for (const el of input) {

        let [name, age] = el.split(' ');

       let cat = new Cat(name, age);
        cats.push(cat);
    }
    cats.forEach((el) => el.sayHello())
}
solve(['Mellow 2', 'Tom 5'])
solve(['Candy 1', 'Poppy 3', 'Nyx 2'])