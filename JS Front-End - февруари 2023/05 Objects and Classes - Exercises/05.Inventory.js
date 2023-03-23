function printHeroList(input){

    let heroList = []

    for (const el of input) {

        let[name, level, items] = el.split(' / ');

        level = Number(level)
        heroList.push( {name, level, items})

    }
    let sorted = heroList.sort((a, b) => a.level - b.level)

    for (const {name, level, items} of sorted) {

        console.log(`Hero: ${name}\n  level => ${level}\n  items => ${items}`)
    }
}
printHeroList([
        'Isacc / 25 / Apple, GravityGun',
        'Derek / 12 / BarrelVest, DestructionSword',
        'Hes / 1 / Desolator, Sentinel, Antara'
    ]

)