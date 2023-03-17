function printEmployeesList(input){

    let employeeList = input.reduce((data, employee) => {
        data[employee] = employee.length;
        return data;
    }, {})


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