function circumstances(r){
    if(Number.isNaN(Number.perseFloat(r))){
        return 0;
    }
    return parseFloat(r) * 2.0 * Math.PI;
}
console.log(circumstances("4.567abcdefg"));
//ouput 2.6935307
console.log(circumstances("abcdefg"));
//ouput 0