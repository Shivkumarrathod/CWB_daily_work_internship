let person ={
    name:"Adrian",
    age:30
}
console.log(person.name);
console.log(person["name"]);

console.log(Object.keys(person));
console.log(Object.values(person));

for (let key in person){
    console.log(key,":",person[key])
}