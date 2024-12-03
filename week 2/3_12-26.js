const start = Date.now();
console.log('star timer');
setTimeout(() => {
    const millis = Date.now() - start;

    console.log(`seconds elapsed = ${Math.floor(millis / 1000)}`);
    //out 2
},2000);