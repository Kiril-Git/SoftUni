function isValid(str){

    let word = str.toLowerCase();
    let flag = true;

    for (let i = 0; i < word.length; i++) {
   
        
        if(word.charCodeAt(i) < 97 || word.charCodeAt(i) > 122){

            flag = false;
            break;
        }
    }
    if(flag){
        console.log(str);

    }
}
isValid('#fgdrSsh')
isValid('Kiril')