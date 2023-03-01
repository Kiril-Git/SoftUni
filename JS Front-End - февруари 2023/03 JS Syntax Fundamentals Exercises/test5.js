
  const people = [
    {name: 'Dido', yob: 1971},
    {name: 'Mitko', yob: 1970},
    {name: 'ivo', yob: 1972}

     ];

     people.sort((a, b) => a.yob - b.yob);    // sort by date of birth - numbers

     people.sort((a, b) => (a.name > b.name ? 1 : -1));    // sort by name - string




     console.log(people);
