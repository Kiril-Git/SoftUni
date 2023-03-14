function personInfo(firstName, lastName, age){

    let person =
        {
            firstName,
            lastName,
            age
        }
        const tuples = Object.entries(person);

    for (const [key, value] of tuples){
        console.log(`key: ${key}`)
        console.log(`value: ${value}`)

    }

    return person
}
console.log(personInfo('Peter', 'Pan', 20));