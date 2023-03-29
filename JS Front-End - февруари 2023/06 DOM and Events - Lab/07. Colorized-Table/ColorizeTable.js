function colorize() {
    // TODO
let tableLine = Array.from(document.querySelectorAll('tr:nth-of-type(2n)'))
    tableLine.forEach((td) => td.style.background = 'teal')
}