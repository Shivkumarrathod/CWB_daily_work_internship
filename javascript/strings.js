let text = "W3Schools";
let character = text.at(0);
let char = text[0];
console.log(character)
console.log(char)



let text1 = "sea";
let text2 = "food";
let result = text1.concat(text2);
console.log(result);

let text3 = "Hello world";
let result1 = text3.endsWith("world");
console.log(result1);


let text4 = "Hello world, welcome to the universe.";
console.log(text4.indexOf("e", 5));

console.log(text.length);

let text5 = "5";
let padded = text5.padEnd(4,"x");
console.log(padded);

let text6 = "Mr Blue has a blue house and a blue car";
let result2 = text6.replace(/blue/g, "red");
console.log(result2);

let text7 = "How are you doing today?";
const myArray = text7.split(" ");
console.log(myArray);

let text8 = "adrianronan7305@gmail.com";
let result3 = text8.substr(0, text8.indexOf("@"));
console.log(result3);