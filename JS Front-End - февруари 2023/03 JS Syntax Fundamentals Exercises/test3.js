function solve(arr) {

  let result = arr;

  result.sort((num1, num2) =>  num2 - num1);
  

  console.log(result)
}

solve(['5', '20', '31', '4', '-20'])




