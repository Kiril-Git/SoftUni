function printMoviesList(input){

    let movieList = []

    for (const el of input) {

        let commandLn = el.split(' ');

        if (commandLn.includes('addMovie')) {
            let title = commandLn.slice(1).join(' ')
            movieList.push({name: title})
        }
        else if (commandLn.includes('directedBy')){
            let index = commandLn.indexOf('directedBy')
            let director = commandLn.slice(index+1).join(' ')
            let title = commandLn.slice(0,  index).join(' ')
            let movie = movieList.find((elObj) => elObj.name === title)
            if (movie){
                movie.director = director;
            }
        }
        else if (commandLn.includes('onDate')){
            let index = commandLn.indexOf('onDate')
            let date = commandLn.slice(index+1).join(' ')
            let title = commandLn.slice(0,  index).join(' ')
            let movie = movieList.find((elObj) => elObj.name === title)
            if (movie){
                movie.date = date
            }
        }
    }
    for (const el of movieList) {

        if (el.director && el.date){

            console.log(JSON.stringify(el))
        }
    }
}

printMoviesList([
        'addMovie The Avengers',
        'addMovie Superman',
        'The Avengers directedBy Anthony Russo',
        'The Avengers onDate 30.07.2010',
        'Captain America onDate 30.07.2010',
        'Captain America directedBy Joe Russo'
    ]
)
printMoviesList([
        'addMovie Fast and Furious',
        'addMovie Godfather',
        'Inception directedBy Christopher Nolan',
        'Godfather directedBy Francis Ford Coppola',
        'Godfather onDate 29.07.2018',
        'Fast and Furious onDate 30.07.2018',
        'Batman onDate 01.08.2018',
        'Fast and Furious directedBy Rob Cohen'
    ]
)