function printOdsList(input) {

    let odsList = {}
    let personalNum;

    let words = input.toLowerCase().split(' ')

    for (const el of words) {

        let name = el
        if (odsList.hasOwnProperty(name)) {
            odsList[name]++
        }
        else {
            odsList[name] = 1;
        }
}
    let filtered = Object.keys(odsList).filter((el) => odsList[el] % 2 !== 0)

        console.log(filtered.join(' '))

}
printOdsList('Java C# Php PHP Java PhP 3 C# 3 1 5 C#')
printOdsList('Cake IS SWEET is Soft CAKE sweet Food')