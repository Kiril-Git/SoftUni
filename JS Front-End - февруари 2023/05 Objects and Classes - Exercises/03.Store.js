function printStockList(stock, newSupply){

    let productList = {}

        for (let i = 0; i < stock.length; i+=2) {

            let name = stock[i]
            let quantity = Number(stock[i+1]);

            productList[name] = quantity;
    }
    for (let i = 0; i < newSupply.length; i+=2) {

        let name = newSupply[i]
        let quantity = Number(newSupply[i+1]);

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