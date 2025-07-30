// A callback function is just a function you pass into another function, so it can be called later.

function sayHello() {
  console.log("Hello!");
}

function greet(callback) {
  console.log("Hi there!");
  callback();
}

greet(sayHello);


//asynchronous callback
setTimeout(function(){
    console.log("This will execute after 2 seconds")
},2000);