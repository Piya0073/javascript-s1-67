let arr1 = ["a",true,2]

console.log("/n++++++++++ leagh in index+++++++++++++\n");
console.log(arr1.length);
console.log(arr1[3]);
console.log(arr1[2]);
console.log(arr1[arr1.length - 1]);

console.log("/n++++++++++ leagh in index 2+++++++++++++\n");
let arr3 = Array(3);
arr3[2] = "adding a Value";
console.log(arr3[2]);
console.log(arr3[arr3.length - 1]);
console.log(arr3[0]);
console.log(arr3[1]);

console.log("/n++++++++++Concat+++++++++++++\n");
let arr2 = ["b",false,3];
let newArray = arr1.concat(arr2);
let newArray2 = arr2.concat([1,2,3]);
console.log(newArray);
console.log(newArray2);