function solve(text){
    let result = ''

    const reg = /name is ([a-zA-Z]+)/;

    const  match = reg.exec(text)

    if (match){
        const name = match[1]
        console.log(name)
    }
    else {
        console.log('No match!')

    }

}
solve('My name is Dido and my dongle is 23\n')



//      Print:    Dido