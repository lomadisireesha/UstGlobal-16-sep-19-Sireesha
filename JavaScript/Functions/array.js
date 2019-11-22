const hobbies = ['sleeping','cooking','eating','coding'] 
console.log(typeof hobbies)
const isArrayOrNot = Array.isArray(hobbies);
console.log('hobbies array or not',isArrayOrNot)
const hasCooking = hobbies.includes('cooking')
console.log('using includes method',hasCooking)
hobbies.push('guitter','roaming')
console.log('after push',hobbies)
hobbies.pop();
console.log('after pop ',hobbies)
hobbies.unshift('cricket','singing')
console.log('after unshift',hobbies)
hobbies.shift()
console.log('after shift',hobbies)

const hobbies1=['sleeping','cricket','singing','dancing','enjoying']
hobbies1.splice(1,0,'reading','roaming')
console.log('after splice',hobbies1)
const afterslice =hobbies1.slice(2,4)
console.log('after slice',hobbies1)
console.log(afterslice)
const indexOfCoding = hobbies1.indexOf('coding',2)
console.log(indexOfCoding)
const indexOfCoding1 = hobbies1.indexOf('dancing',2)
console.log(indexOfCoding1)
const joinof = hobbies1.join()
console.log(joinof)

const numbers = [100,200,300,400]
const num1 = numbers.map(function(value,index){
    let newvalue = value+50;
    return newvalue;
})
console.log(num1)

const number1= numbers.map(value=> value+50);
console.log(number1)

const num2 = numbers.filter(function( value,index){
    if(value>200)
    {
        return true;
    }
    else{
        return false;
    }
})
console.log(num2)

const num3 = numbers.filter(value=> value>200)
console.log(num3)

