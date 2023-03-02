function solve(text){

    let str = text.split(' ');

    for(const el of str){

        let word = el.split('');

        let temp = word.shift();

        if (temp === '#'){
            console.log(word.join(''));
        }

    }
}
solve('Nowadays everyone uses # to tag a #special word in #socialMedia')
solve('The symbol # is known #variously in English-speaking #regions as the #number sign')