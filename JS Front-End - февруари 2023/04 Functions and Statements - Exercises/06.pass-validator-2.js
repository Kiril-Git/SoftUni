function solve(text){

let result = '';
let count = 0;

    if(text.length < 6 || text.length > 10 ){

        result = 'Password must be between 6 and 10 characters';
        console.log(result)
    }

for (let el of text) {
    let isMatch = el.match(/[0-9]/);
    if (isMatch) {
        count++;
    }
}
    for (let el of text) {
        let isMatch = el.match(/[A-Za-z0-9]+/);
        if (!isMatch) {
            result = 'Password must consist only of letters and digits';
            console.log(result)
            break;
        }
    }
    if (count < 2){
        result = 'Password must have at least 2 digits';
        console.log(result)
    }
    if (result.length === 0){
        console.log('Password is valid')
    }
}
solve('log!n')
solve('MyPass123')




