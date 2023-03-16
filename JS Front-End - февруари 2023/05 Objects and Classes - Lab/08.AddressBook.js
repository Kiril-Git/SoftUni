function printAddressBook(input){

    let addressBook = {};

    for (const el of input) {

        let [name, address] = el.split(':');

            addressBook[name] = address;
    }

    let sortedBook = Object.keys(addressBook).sort()
                                     //   .sort((a, b) => a.localeCompare(b));

    for (const el of sortedBook) {

        console.log(`${el} -> ${addressBook[el]}`)
    }
}

printAddressBook(
    ['Tim:Doe Crossing',
    'Bill:Nelson Place',
    'Peter:Carlyle Ave',
    'Bill:Ornery Rd']
)
