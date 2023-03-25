function calc() {

    let input1  = document.getElementById('num1')
    let input2 = document.getElementById('num2')

    let firstN = Number(input1.value)
    let secondN = Number(input2.value)

    let sum = firstN + secondN

    let result = document.getElementById('sum')
    result.value = sum
}
