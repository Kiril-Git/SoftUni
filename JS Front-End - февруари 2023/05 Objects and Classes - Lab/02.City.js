function solve(input) {

    let params = Object.entries(input);

    for (let [key, value] of params) {

        console.log(`${key} -> ${value}`)
    }
}
solve({
        name: "Sofia",
        area: 492,
        population: 1238438,
        country: "Bulgaria",
        postCode: "1000"
    }
);