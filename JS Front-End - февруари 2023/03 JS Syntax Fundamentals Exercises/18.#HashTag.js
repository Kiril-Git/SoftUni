function solve(text){

    let str = text.split(' ');

    for(const el of str){
        
        if (el.startsWith('#') && el.length > 1 && isValid(el)){

            temp = el.slice(1);

            console.log(temp);
        }
    }

   

    function isValid(str){

        let word = str.toLowerCase();
        let flag = true;
    
        for (let i = 1; i < word.length; i++) {
            
            if(word.charCodeAt(i) < 97 || word.charCodeAt(i) > 122){
    
                flag = false;
                break;
            }
        }
        if(flag){
      return true;
        }
        }
    }
    

solve('Nowadays everyone uses # to tag a #spe-cial word in #socialMedia')
solve('The symbol # is known #variously in English-speaking #regions as the #number sign')