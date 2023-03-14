function printPoneBook(input){

    let phoneBook = {};

    for (const el of input) {

        let [name, num] = el.split(' ');
        phoneBook[name] = num;

    }
    for (const el in phoneBook) {

        console.log(`${el} -> ${phoneBook[el]}`)
    }
}
printPoneBook(['Tim 0834212554',
    'Peter 0877547887',
    'Bill 0896543112',
    'Tim 0876566344']
)