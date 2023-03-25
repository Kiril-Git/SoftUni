function sum (){
    console.log(5+5);
}
sum();

const liElements = document.getElementsByTagName('li');
const textInput = document.getElementById('text-input');

for (const el of liElements) {

    el.innerHTML += ' <p>Custom Paragraph<p/ > '
    el.style.background = 'red'
}