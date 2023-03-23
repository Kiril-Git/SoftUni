function printWordsList(input) {

    let wordsList = {}
    let word

    let words = input.shift().split(' ')

    for (const el of words) {

        let reps = 0
        word = el

        for (const el of input) {

        let name = el

        if (word === name) {
            reps++
            wordsList[name] = reps;
        }
    }
}
    const sorted = Object.entries(wordsList).sort((a, b) => b[1] - a[1])

    for (const [k, v] of sorted) {

        console.log(`${k} - ${v}`)
    }
}
printWordsList([
        'this sentence',
        'In', 'this', 'sentence', 'you', 'have', 'to', 'count', 'the', 'occurrences', 'of', 'the', 'words', 'this', 'and', 'sentence', 'because', 'this', 'is', 'your', 'task'
    ])
printWordsList([
    'is the',
    'first', 'sentence', 'Here', 'is', 'another', 'the', 'And', 'finally', 'the', 'the', 'sentence']
)