fetch("https://jsonplaceholder.typicode.com/posts/2")
    .then(response=>response.json())
    .then(data=>console.log(data))
    .catch(error => console.log("Error:",error));