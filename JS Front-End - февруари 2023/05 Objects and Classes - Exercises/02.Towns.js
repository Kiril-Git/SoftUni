function printTownList(input){

    let townList = {}

    for (const el of input) {

        let[town, lat, long] = el.split(' | ');

        let townObject = { town, latitude: Number(lat).toFixed(2)
                            , longitude: Number(long).toFixed(2)}

        console.log(townObject)
    }

}
printTownList(['Sofia | 42.696552 | 23.32601',
    'Beijing | 39.913818 | 116.363625']

)