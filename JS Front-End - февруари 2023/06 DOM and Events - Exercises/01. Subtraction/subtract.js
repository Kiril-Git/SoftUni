function subtract() {

    let num1 = document.getElementById('firstNumber').value
    let  num2 = document.getElementById('secondNumber').value

    let result = num1 - num2
    let resultEl = document.getElementById('result')

    resultEl.textContent = result
}