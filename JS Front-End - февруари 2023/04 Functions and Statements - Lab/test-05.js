function printCertificate(grade, [firstName, lastName]) {

    printHeader();
    printNames();
    printGrade();

    function printHeader() {

        console.log('~~~- {@} -~~~')
        console.log('~- Certificate -~')
        console.log('~~~- ~---~ -~~~')
    }
    function printNames(){
        console.log(`${firstName} ${lastName}`);
    }
    
    function printGrade(){
        console.log(getGradeAsText());
    }
    
    function getGradeAsText() {

        if(grade < 3.00){
            console.log(`Fail (${grade})`)
        }
        else  if(grade < 3.50){
            console.log(`Poor (${grade.toFixed(2)})`)
        }
        else  if(grade < 4.50){
            console.log(`Good (${grade.toFixed(2)})`)
        }
        else  if(grade < 5.50){
            console.log(`Very good (${grade.toFixed(2)})`)
        }
        else  if(grade >= 5.50){
            console.log(`Excellent (${grade.toFixed(2)})`)
        }
    }

}
printCertificate(
    2,
    ['Dido', 'Stankov']
);