function printStockList(stock, delivery){

    let productList = {}
    let combined = [...stock, ...delivery]         //      Combine both arrs

    for (let i = 0; i < combined.length; i+=2) {

        let name = combined[i]
        let quantity = Number(combined[i+1]);

        if (productList.hasOwnProperty(name)){
            productList[name] += quantity;
        }
        else {
            productList[name] = quantity;
        }
    }
    for (const el in productList) {

        console.log(`${el} -> ${productList[el]}`)
    }
}
printStockList([
        'Chips', '5', 'CocaCola', '9', 'Bananas', '14', 'Pasta', '4', 'Beer', '2'
    ],
    [
        'Flour', '44', 'Oil', '12', 'Pasta', '7', 'Tomatoes', '70', 'Bananas', '30'
    ]
)