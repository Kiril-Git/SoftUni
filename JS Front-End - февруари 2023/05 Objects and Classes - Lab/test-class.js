class Student {

    constructor(name, age, grades) {
        this.name = name
        this.age = age
        this.grades = grades

    }


    sayHello() {
        console.log(`I am ${this.name}`)
    }
}

const donga = new Student('Dido', 23, [3, 4, 5])
const buzema = new Student('Ivo', 22, [2, 4, 4])
const kozhata = new Student('Jordan', 18, [4, 4, 3])

console.log(donga)
console.log(buzema.age)
console.log(kozhata.sayHello())
console.log(typeof Student)