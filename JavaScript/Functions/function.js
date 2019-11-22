// Named functions
function add(num1,num2)
{
    console.log('sum =',num1+num2);
}
add(10,20)
function add(num1,num2,num3){
    console.log('sum=',num1+num2+num3)
}
add(10,20,30)
//function expression (Anonymous)
var sub = function(num1,num2){
    console.log('sub= ',num1-num2);
    return num1-num2;
}
var val= sub(20,10)
console.log('val= ',val);

console.log(hoist);
var hoist=10;
function hoisting(){
    console.log(hoistingA);
    var hoistingA=10;
}
hoisting();


