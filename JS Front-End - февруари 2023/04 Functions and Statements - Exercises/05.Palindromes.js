function solve(arr){

    for (const arrEl of arr) {

        let revEl = String(arrEl).split('').reverse().join('')

        let temp = Number(revEl)

        if(arrEl === temp){
            console.log('true')
        }
        else {
            console.log('false')
        }
    }
}
solve([123,323,421,121]) 
