let x=10; //global scope
function test(){
    let y=20; //local scope
    console.log(x+y);
}
test();

//variable shadowing

let z=50;

function shadow(){
    let z=100;
    console.log(z); //local var shadow global variable
}
shadow();
console.log(z);