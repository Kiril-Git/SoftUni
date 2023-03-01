function solve(words, text){

 let arr1 = words.split(', ');
 let arr2 = text.split(' ');

 for(let i of arr1){
    for(let el of arr2){
        if(el.includes('*') && el.length === i.length){
            text = text.replace(el, i);
        }
    }
 }
console.log(text)
}
solve('great', 'softuni is ***** place for learning new programming languages');

solve('great, learning', 'softuni is ***** place for ******** new programming languages')