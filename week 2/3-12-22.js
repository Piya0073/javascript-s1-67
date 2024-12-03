function reverseString(value) {
    let reverseValue ="";

    value.split("").forEach((chars) => {
        reverseValue = chars + reverseValue;
    });
    return reverseValue;
}
console.log(reverseString("reversme"));