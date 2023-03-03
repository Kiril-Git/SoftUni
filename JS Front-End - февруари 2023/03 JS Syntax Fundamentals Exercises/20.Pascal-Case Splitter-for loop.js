function solve(str){

    let text = str;

    let arr = '';

    for (let i = 0; i < text.length; i++) {

        let temp = text[i];

        if(text.charCodeAt(i) < 97 || text.charCodeAt(i) > 122 ){

            arr += ', ';
            arr += temp;
            }
        else{
            arr += temp;
        }
    }

    arr = arr.slice(2);
    
    console.log(arr)
}
solve('SplitMeIfYouCanHaHaYouCantOrYouCan')
solve('HoldTheDoor')
solve('ThisIsSoAnnoyingToDo')