function solve(members, type, day){

    let result = 0;

    switch(type){

        case 'Students':
            if (day === 'Friday'){

                result = members * 8.45
            }
            else  if (day === 'Saturday'){

                result = members * 9.8
            }
            else  if (day === 'Sunday'){

                result = members * 10.46
            }
            if(members >= 30){
                result *= 0.85;
            }
        break;

        case 'Business':
            if(members >= 100){
                members -= 10;
            }
            if (day === 'Friday'){

                result = members * 10.9
            }
            else  if (day === 'Saturday'){

                result = members * 15.6
            }
            else  if (day === 'Sunday'){

                result = members * 16
            }

        break;

        case 'Regular':
            if (day === 'Friday'){

                result = members * 15
            }
            else  if (day === 'Saturday'){

                result = members * 20
            }
            else  if (day === 'Sunday'){

                result = members * 22.5
            }
            if(members >= 10 && members <= 20){
                result *= 0.95;
            }
        break;
    }
    console.log(`Total price: ${result.toFixed(2)}`)
}

solve(30, "Students", "Sunday")
solve(40, "Regular", "Saturday")
solve(100, "Business", "Sunday")
solve(10, "Regular", "Saturday")


