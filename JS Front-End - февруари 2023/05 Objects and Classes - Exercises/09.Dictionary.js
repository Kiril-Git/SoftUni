function printDictionary(input){

    let dictionary = {}

    for (let el of input) {

        // let[name, surname] = el.split(' ');

       el = JSON.parse(el)
        dictionary[Object.keys(el)] = Object.values(el);
    }
    let filtered = Object.keys(dictionary).sort()

    for (const el of filtered) {

        console.log(`Term: ${el} => Definition: ${dictionary[el]}`)
    }
}
printDictionary([
        '{"Coffee":"A hot drink made from the roasted and ground seeds (coffee beans) of a tropical shrub."}',
        '{"Bus":"A large motor vehicle carrying passengers by road, typically one serving the public on a fixed route and for a fare."}',
        '{"Boiler":"A fuel-burning apparatus or container for heating water."}',
        '{"Tape":"A narrow strip of material, typically used to hold or fasten something."}',
        '{"Microphone":"An instrument for converting sound waves into electrical energy variations which may then be amplified, transmitted, or recorded."}'
    ]
)