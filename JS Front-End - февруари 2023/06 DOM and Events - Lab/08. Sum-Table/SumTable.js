function sumTable() {

    let price = document.querySelectorAll('tr td:nth-of-type(2)')

    let sum = Array.from(price).reduce((a, x) => {
        let temp = Number(x.textContent) || 0;
        return a + temp;
    }, 0);

    let total = document.getElementById('sum')

    total.textContent = sum

}