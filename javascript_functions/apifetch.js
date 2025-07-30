    fetch("https://jsonplaceholder.typicode.com/posts")
    .then(response => response.json())
    .then(data =>{
        console.log(data);
        const list=document.getElementById('responsedata');
        for(let key in data){
            const li=document.createElement('li');
            li.textContent=`${key}:${data[key].title}`;
            list.appendChild(li);
        }
    })
    .catch(err => console.log("Error:", err));  
    