function city (obj) {
    for (const property in obj) {
        console.log(`${property} -> ${obj[property]}`)
    }
}



city({
        name: "Sofia",
        area: 492,
        population: 1238438,
        country: "Bulgaria",
        postCode: "1000"
    }
);