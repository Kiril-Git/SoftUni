function solve(jsonStr){

    let person = JSON.parse(jsonStr);

    for (const el in person) {

        console.log(`${el}: ${person[el]}`)
    }
}
solve('{"name": "George", "age": 40, "town": "Sofia"}')