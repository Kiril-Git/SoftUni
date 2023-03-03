function solve(word, text){

    let str = text.split(' ');
    let flag = word + ' not found!'

    for(const el of str){
        if (el.toLowerCase() === word){

            flag = word;
        }
    }
    console.log(flag)
}

solve('javascript', 'JavaScript is the best programming language')
solve('python', 'JavaScript is the best programming language')