function solve(str){

    let text = str.split(/(?=[A-Z])/)

    console.log(text.join(', '))
}
solve('SplitMeIfYouCanHaHaYouCantOrYouCan')
solve('HoldTheDoor')
solve('ThisIsSoAnnoyingToDo')