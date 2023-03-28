function sum (){
    console.log(5+5);
}
sum();

const btnEl = document.getElementById('btn');
btnEl.addEventListener('mouseover', clickHandler )

const input = document.getElementById('text-input')
input.addEventListener('keyup', keyPressHandler)

function clickHandler(e){

    console.log(e.target)
}

function keyPressHandler(e){
    console.log(e.target)
}

