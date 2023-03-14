function personInfo(firstName, lastName, age){

    let person =
        {
            firstName,
            lastName,
            age
        }
        const tuples = Object.entries(person)
            .forEach(( [key, value]) => console.log(key, value))

    return person
}
console.log(personInfo('Peter', 'Pan', 20));