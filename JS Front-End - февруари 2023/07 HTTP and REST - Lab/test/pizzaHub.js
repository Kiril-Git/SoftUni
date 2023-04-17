let promise = new Promise(function (resolve, reject){

    resolve('I am surely going to get resolved!');
    reject(new Error('Will this be ignored?'));
    resolve('Ignored')
});