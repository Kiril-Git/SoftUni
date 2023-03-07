function smallestNum(a, b, c){

    let arr = [a, b, c];

    let smallestN = arr[0];

    for (let i = 1; i < arr.length; i++) {

        let temp = arr[i];

    if (temp < smallestN){
        smallestN = temp;
        }
    }
    console.log(smallestN)
}
smallestNum(2, 5, 3)
smallestNum(600, 342, 123)
smallestNum(25, 21, 4)
smallestNum(2, 2, 2)