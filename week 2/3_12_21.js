function createQuote(quote, cllback) {
    let myQuote = "Like saying" + quote;
    cllback(myQuote);
}
function logQuote(quote) {
    console.log(quote+ 'Yes');
}
createQuote("batter",logQuote);
