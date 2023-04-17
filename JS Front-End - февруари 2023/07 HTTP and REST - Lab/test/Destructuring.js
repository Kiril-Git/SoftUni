let greeting, pronoun;
[greeting, pronoun] = ["Hello", "I", "am", "Donga"]

console.log(greeting)
console.log(pronoun)
console.log('--- 1')

let [greet,,, name] = ["Hello", "I", "am", "Buzema"]

console.log(greet)
console.log(name)
console.log('--- 2')

let [,pronoun2,, pseudonym] = ["Hello", "I", "am", "Kozhata"]

console.log(pronoun2)
console.log(pseudonym)
console.log('--- 3')

let [greet2,...intro] = ["Hello", "I", "am", "Mitko"]

console.log(greet)
console.log(intro)
console.log('--- 4')

function getArray(){
    return ["Hello", "I", "am", "Ivan"]
}
let [greeting2, pronoun3] = getArray()

console.log(greeting2)
console.log(pronoun3)
console.log('--- 5')

let a = 3;
let b = 6;

[a,b] = [b, a];

console.log(a);
console.log(b);
console.log('--- 6');

let person = {stud: "Asen", country: "Germany", bestIn: 'maistor'}

let who = person.stud
let where = person.country
let occupation = person.bestIn

console.log(who);
console.log(where);
console.log('--- 7');

let {stud, country, bestIn} = person;

console.log(stud);
console.log(bestIn);
console.log('--- 8');


let basket = {bread: 'wholemeal', fish: 'tuna', salad: 'green', fruits: ['oranges', 'dates']};
let {bread, fruits, ...others} = basket;

console.log(bread);
console.log(fruits);
console.log(others);
console.log('--- 9');









