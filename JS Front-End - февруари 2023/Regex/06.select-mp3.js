function solve(text){
    let result = ''

    const reg = /(\w+)\.mp3/g;

    let  match = reg.exec(text)

   while (match){
        const filename = match[1]
        console.log(filename)
       match = reg.exec(text)

   }


}
solve('file_a.mp3 file_01.mp3 file_02.mp3 test.csv.txt\n')


/*

 Print:       file_a
             file_01
             file_02
*/
