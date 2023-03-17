function printEmployeesList(input){

    Object.entries(
    input.reduce((data, employee) => {
        console.log(data)                       //      ??? iterations 
        data[employee] = employee.length;
        return data;
    }, {})).forEach(([name, employeeN]) =>
        {
            console.log(`Name: ${name} -- Personal Number: ${employeeN}`)
        }
    )

}
printEmployeesList([
        'Silas Butler',
        'Adnaan Buckley',
        'Juan Peterson',
        'Brendan Villarreal']
)