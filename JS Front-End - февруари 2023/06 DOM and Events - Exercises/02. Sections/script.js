function create(words) {

   const content = document.getElementById('content')

   for (const el of words) {

      const newDiv = document.createElement('div')
      const newParagraph = document.createElement('p')

      newParagraph.textContent = el
      newParagraph.style.display = 'none'

      newDiv.addEventListener('click', () => {
         newParagraph.style.display = 'block'
      })
      newDiv.appendChild(newParagraph)
      content.appendChild(newDiv)
   }
}