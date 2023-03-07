function signChecker(numOne, numTwo, numThree) {

    let counterNegs = 0;
    let result = 'Positive';
    let arr = [numOne, numTwo, numThree];

    for (let i of arr){

        if(i < 0){
            counterNegs++;
        }
    }

    if (counterNegs % 2 !== 0){
        result = 'Negative'
    }
    console.log(result)
}
signChecker( 5, 12, -15)
signChecker(-6, -12, 14)
signChecker(-1, -2, -3)
signChecker(-5, 1, 1)