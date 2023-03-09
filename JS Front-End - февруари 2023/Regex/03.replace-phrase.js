function solve(text){
    let result = ''

    result = text.replace(/I am (?=great)/, 'We are ')



    console.log(result)
}
solve('I am great')