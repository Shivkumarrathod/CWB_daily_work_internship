function greet(){
    console.log("Hello Adrian");
}
greet();

const sayHi = function(){
    console.log("Hi");
}
sayHi();

//parameter

function greetPara(name){
    console.log("Helllo " + name);
}
greetPara("Ronan");

//with return 

function add(a,b){
    let c=a+b;
    return c;
}
let result = add(10,5);
console.log(result);

//arrow function

const addArrow = (a,b) => a+b;
console.log(addArrow(20,7));

//to greet using arrow para
const greetUser = (name)=> console.log("Hello, " + name);
greetUser("Adrian");

//arrow func to find max
const max = (a, b)=>(a > b) ? a : b;
console.log(max(10, 25));
 