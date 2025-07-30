let nums =[1,2,3]

//using for loop
for(let i=0;i<nums.length;i++){
    console.log(nums[i]);
}

//for each
nums.forEach(function(num) {
    console.log("hi number"+num);
});

//using map() to transform

const numbers1 = [45, 4, 9, 16, 25];
const numbers2 = numbers1.map(myFunction);

function myFunction(value) {
  return value * 2;
}
console.log(numbers2);

//using flatmap() will keep the og value too
const myArr = [1, 2, 3, 4, 5,6];
const newArr = myArr.flatMap(x => [x, x * 10]);
console.log(newArr)


//using idex of
const fruits = ["Apple", "Orange", "Apple", "Mango","Apple","Cherry","Apple"];
let pos=0;
for (let i=0;pos<fruits.length;i++){
    let position = fruits.indexOf("Apple",pos) + 1;
    console.log(position);
    pos=position;
}
//indexOf return -1 if not found
