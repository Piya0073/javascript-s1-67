const people = ["a", "b", "c",];
const one = 1;
const str ="hello world";
const b = true;
const employee = {
    firstName: "piya",
    lastName: "kumar",
    
};
function sayhello(person) {
    console.log("Hello" + person.firstName + " " + person.lastName);
}

console.log(typeof people);

console.log(typeof sayhello)

console.log(employee instanceof Array);
sayhello(employee );