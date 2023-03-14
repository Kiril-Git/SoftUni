function printAppointmentBook(input){

    let appointmentBook = {};

    for (const el of input) {

        let [day, name] = el.split(' ');

        if (appointmentBook.hasOwnProperty(day)) {
            console.log(`Conflict on ${day}!`)

        }
        else {
            console.log(`Scheduled for ${day}`)
            appointmentBook[day] = name;

        }

    }
    for (const el in appointmentBook) {

        console.log(`${el} -> ${appointmentBook[el]}`)
    }
}

printAppointmentBook(['Friday Bob',
    'Saturday Ted',
    'Monday Bill',
    'Monday John',
    'Wednesday George']

)
