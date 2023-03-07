function charsRange(first, second){

    let arr = [];

    let start = first.charCodeAt();
    let end = second.charCodeAt();

    if(start > end){
        end = first.charCodeAt();
        start = second.charCodeAt();
    }

    for (let i = start+1; i < end ; i++) {

        let temp = String.fromCharCode(i);

        arr.push(temp);
    }
    console.log(arr.join(' '));
}
charsRange('a', 'd');
charsRange('#', ':');
charsRange('C', '#');

