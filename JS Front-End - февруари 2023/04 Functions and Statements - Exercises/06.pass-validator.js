function solve(input){
    const lengthCheck = (input) => input.length > 5 && input.length < 11;
    const contentCheck = (input) => /^[a-zA-Z0-9]+$/g.test(input);     //   /^([^_]\w+)$/g
    const numsCheck = (input) => [...input.matchAll(/\d/g)].length >= 2;

    let result = '';

    if(!lengthCheck(input)){

        result = 'Password must be between 6 and 10 characters';
        console.log(result)
    }

    if(!contentCheck(input)){

        result = 'Password must consist only of letters and digits';
        console.log(result)
    }
    if (!numsCheck(input)){
        result = 'Password must have at least 2 digits'
        console.log(result)

    }
    if (result.length === 0){
        console.log('Password is valid')
    }

}
solve('Pass66')
