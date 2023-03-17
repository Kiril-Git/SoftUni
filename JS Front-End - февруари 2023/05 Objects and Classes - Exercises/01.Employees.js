function printEmployeesList(input){

    let employeeList = {}

    for (const el of input) {

        // let[name, surname] = el.split(' ');
        let name = el
        let personalNum = el.length;

        employeeList[name] = personalNum;


    }
    for (const el in employeeList) {

        console.log(`Name: ${el} -- Personal Number: ${employeeList[el]}`)
    }
}
printEmployeesList([
        'Silas Butler',
        'Adnaan Buckley',
        'Juan Peterson',
        'Brendan Villarreal']
)