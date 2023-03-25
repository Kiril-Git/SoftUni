function printOdsList(input) {

    let odsList = ''

    let words = input.toLowerCase().split(' ')

    for (const el of words) {

        let reps = words.filter((w) => w === el).length

        if (reps % 2 !== 0 && !odsList.includes(el)) {
            odsList += el + ' ';
        }
}
        console.log(odsList.trim())

}
printOdsList('Java C# Php PHP Java PhP 3 C# 3 1 5 C#')
printOdsList('Cake IS SWEET is Soft CAKE sweet Food')