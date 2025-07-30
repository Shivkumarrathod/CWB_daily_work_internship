const myArr = [1, 2, [3, [4, 5, 6], 7], 8];
const newArr = myArr.flat(2);
console.log(myArr);
console.log(newArr);

const myArr1 = [1, 2, 3, 4, 5, 6];
const newArr1 = myArr1.flatMap(x => [x, x * 10]);
console.log(myArr1);
console.log(newArr1);