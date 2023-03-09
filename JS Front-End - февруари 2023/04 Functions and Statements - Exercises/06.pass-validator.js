function solve(input){

    let result = 'Password is valid';
    let count = 0;

    if(input.length < 6 || input.length > 10 ){

        result = 'Password must be between 6 and 10 characters';
        console.log(result)
    }

    for (let el of input) {
        let isMatch = el.match(/[0-9]/);
        if (isMatch) {
            count++;
        }
    }
    if (count < 2){
        result = 'Password must have at least 2 digits'
        console.log(result)

    }

}
solve('logIn')
solve('log66')