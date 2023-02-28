function solve(num, ...operations){

    let number = num;

    for (const i of operations){

        let temp = i;

    switch(temp){

        case 'chop':
        number /= 2;
        break;

        case 'dice':
        number = Math.sqrt(number);
        break;

        case 'spice':
        number += 1;
        break;

        case 'bake':
        number *= 3;
        break;

        case 'spice':
        number += 1;
        break;

        case 'fillet':
        number *= 0.8;
        break;
    }
    console.log(number)
}
}
solve('9', 'dice', 'spice', 'chop', 'bake', 'fillet')
solve('32', 'chop', 'chop', 'chop', 'chop', 'chop')
