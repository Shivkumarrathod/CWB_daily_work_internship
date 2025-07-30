// A Promise is like a guarantee that something will be done in the future — either:

// ✅ It succeeds (gets resolved), or
// ❌ It fails (gets rejected).

let pizzaOrder = new Promise((resolve, reject)=> {
  let pizzaReady = true;

  if (pizzaReady) {
    resolve("Here's your pizza!");
  } else {
    reject("Sorry, we're out of pizza.");
  }
});

pizzaOrder
  .then(function(message) {
    console.log("Success: " + message);
  })
  .catch(function(error) {
    console.log("Error: " + error);
  });
