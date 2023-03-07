function signChecker(...nums) {

   return nums
       .filter((i) => i < 0)                              //      Filter negs
       .length % 2 === 0 ? 'Positive' : 'Negative'
                                    //       If negs number is positive - result is positive


}
console.log(signChecker( 5, 12, -15))
console.log(signChecker(-6, -12, 14))
console.log(signChecker(-1, -2, -3))
console.log(signChecker(-5, 1, 1))