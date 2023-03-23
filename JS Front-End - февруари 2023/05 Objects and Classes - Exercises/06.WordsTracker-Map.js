function printWordsList(input) {

    let wordsList = new Map

    let words = input.shift().split(' ')

    for (const el of words) {

        wordsList.set(el, 0)
    }

        for (const el of input) {

        if (wordsList.has(el)) {

            // let reps = wordsList.get(el)
            wordsList.set(el, wordsList.get(el)+1);
        }
    }

    let sorted = Array.from(wordsList).sort(([kA, vA] , [kB, vB]) => {
        return vB - vA
    })

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