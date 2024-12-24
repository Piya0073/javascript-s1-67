const cat = {
    name: 'kuma',
    age: 5,
    whatName(){
        return this.name;
    }
};

console.log(cat.whatName()); //kuma
cat.name = "Goki";
console.log(cat.whatName()); //Goki