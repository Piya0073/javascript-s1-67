function getVowels(str) {
    const m = str.match(/[aeiouu]/gi);
    if (m===null) {
        return 0;
    };
    return m.length;
}
console,console.log(getVowels("seeing"));
