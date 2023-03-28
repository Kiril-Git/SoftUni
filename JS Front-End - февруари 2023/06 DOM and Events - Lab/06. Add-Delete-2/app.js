function addItem() {

    const ulContainer = document.getElementById('items')
    const input = document.getElementById('newItemText')
    const newLi = document.createElement('li')
    const newAnchor = document.createElement('a')

    newLi.textContent = input.value
    newAnchor.textContent = '[Delete]'
    newAnchor.setAttribute('href', '#')
    newAnchor.addEventListener('click', deleteHandler)

    ulContainer.appendChild(newLi)
    newLi.appendChild(newAnchor)
    input.value = '';

    function deleteHandler(e){
        const anchor = e.currentTarget
        anchor.parentElement.remove()
    }
}