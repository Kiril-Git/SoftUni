function checkForSameDigits(number) {
 
  let numberArray = number.toString().split('');
  let counter = 0;
  let totalSum = 0;

  for (let el in numberArray) {
      if (numberArray[el] === numberArray[0]) {
          counter++;
      }
  }
  
  if (counter === numberArray.length) {
      console.log("true");
  } 
  else {
      console.log("false");
  }

  while (0 < number) {
      totalSum += number % 10;
      number = Math.floor(number / 10);
  }
  
  console.log(totalSum);
}

checkForSameDigits(2222222);
checkForSameDigits(1234);
checkForSameDigits(011)