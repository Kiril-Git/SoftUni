function printCarsList(input) {

    let carsList = [];

    for (let el of input) {

        let [command, num] = el.split(', ');

        switch (command){
            case 'IN':
                carsList.push(num)
                break
            case 'OUT':
                carsList.splice(carsList.indexOf(num, 1))
                break
        }
}
    if (carsList.length === 0){
        console.log('Parking Lot is Empty');
    }
    else {
        let filtered = Array.from(carsList.values()).sort();

        console.log(filtered.join('\n'))
    }
}
printCarsList(['IN, CA2844AA',
    'IN, CA1234TA',
    'OUT, CA2844AA',
    'IN, CA9999TT',
    'IN, CA2866HI',
    'OUT, CA1234TA',
    'IN, CA2844AA',
    'OUT, CA2866HI',
    'IN, CA9876HH',
    'IN, CA2822UU']
)
printCarsList(['IN, CA2844AA',
    'IN, CA1234TA',
    'OUT, CA2844AA',
    'OUT, CA1234TA']

)