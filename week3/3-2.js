let arr1 = ["a",true,2]

console.log("/n++++++++++ push pop +++++++++++++\n");
console.log(arr1.push("new value"));
console.log(arr1);
console.log(arr1.pop());
console.log(arr1);

console.log("/n++++++++++ shit and unshit +++++++++++++\n");
console.log(arr1.unshift("new value"));
console.log(arr1);
console.log(arr1.shift());
console.log(arr1);

console.log("/n++++++++++Concat+++++++++++++\n");
let arr2 = ["b",false,3];
let newArray = arr1.concat(arr2);
let newArray2 = arr2.concat([1,2,3]);
console.log(newArray);
console.log(newArray2);