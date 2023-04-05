function solve(){
    const generateButtonEl = document.querySelector("#exercise button")
    generateButtonEl.addEventListener("click", createFurniture)
    const buyButton = document.querySelectorAll("button")[1]
    buyButton.addEventListener("click", buy)
    console.log(buyButton)

    function createFurniture(){
        const textAreaEl = document.querySelector("#exercise textarea")
        const tableBodyEl = document.querySelector("tbody")
        const values = JSON.parse(textAreaEl.value)

        for (const {img, name, price, decFactor} of values) {
            const tableRow = createHtmlElement('tr', '', tableBodyEl)
            const tdImgEl = createHtmlElement('td', '', tableRow)
            createHtmlElement('img', '', tdImgEl, '', {src : img})
            const tdFurnitureName = createHtmlElement('td', '', tableRow)
            createHtmlElement('p', name, tdFurnitureName)
            const tdFurniturePrice = createHtmlElement('td','', tableRow)
            createHtmlElement('p', price, tdFurniturePrice)
            const tdFurnitureDeFactor = createHtmlElement('td', '', tableRow)
            createHtmlElement('p', decFactor, tdFurnitureDeFactor)
            const tdInput = createHtmlElement('td', '', tableRow)
            createHtmlElement('input', '', tdInput, '', {type : 'checkbox'})
        }
    }
    function createHtmlElement(typeOfEl, content, parent, classes, attributes){

        const htmlEl = document.createElement(typeOfEl)

        if (typeOfEl !== "input" && content){
            htmlEl.textContent = content
        }
        if (typeOfEl === 'input' && content){
            htmlEl.value = content
        }
        if (classes){
            htmlEl.classList.add(...classes)
        }
        if (attributes){
            for (const el in attributes){
                htmlEl.setAttribute(el, attributes[el])
            }
        }
        if (parent){
            parent.appendChild(htmlEl)
        }
        return htmlEl;
    }
    function buy(){
        let boughtFurnitureName = []
        let totalPrice = 0
        let averageDeFactor = 0

        Array.from(document.querySelectorAll("tbody tr")).forEach((row) => {
            checkbox = row.querySelector("td:nth-child(5) input")
            if (checkbox.checked){
                const furnitureName = row.querySelector("td:nth-child(2) p").textContent

                const price = row.querySelector("td:nth-child(3) p").textContent
                const deFactor = row.querySelector("td:nth-child(4) p").textContent

                boughtFurnitureName.push(furnitureName)
                totalPrice += Number(price)
                averageDeFactor += Number(deFactor)
            }
        });
        averageDeFactor /= boughtFurnitureName.length
        const  textAreaOutput = document.querySelectorAll("textarea")[1]

        textAreaOutput.textContent = `Bought furniture: ${boughtFurnitureName.join(
            ", "
        )}\nTotal price: ${totalPrice.toFixed(
            2
        )}\nAverage decoration factor: ${averageDeFactor}`
    }
}








