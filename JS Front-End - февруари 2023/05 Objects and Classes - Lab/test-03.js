function personInfo(firstName, lastName, age){

    let person =
        {
            firstName,
            lastName,
            age
        }
        const keys = Object.keys(person);

    for (const el of keys){
        console.log(`key: ${el}`)
        console.log(`value: ${person[el]}`)

    }

    return person
}
console.log(personInfo('Peter', 'Pan', 20));