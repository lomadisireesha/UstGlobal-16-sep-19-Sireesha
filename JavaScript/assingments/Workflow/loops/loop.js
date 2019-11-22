var brands = ['kingfisher','bisleri','aqua','kinley']
console.log('for of loop')
for(var element of brands ){
    console.log('brand ',element);
}
console.log('=========')
console.log('for in loop')
for(var index in brands){
    console.log('brand ',brands[index])
}
console.log('=========')
console.log('for in loop of objects')
var person={
    name:'sundari',
    age:33,
    color:'white',
}
for(var key  in person){
    console.log('value ',person[key])
}
console.log('=========')
console.log('for each method of array')
var movies=['sholay','mayabazar','titanic']
movies.forEach(function(value,index){
    console.log('movie ',value)
    console.log('movie index ',index)
})
console.log('=========')
console.log('for each loop for items')
var items=[
    {
        item : 'bangles',
        id : 1,
        price : 100,
    },
    {
        item : 'lipstick',
        id : 2,
        price : 50,
    },
    {
        item : 'bike',
        id : 3,
        price : 1000000, 
    }
]
    items.forEach(function(value,index){
        console.log('item ',value);
        console.log('item index ',index);
    })
    console.log('=========')
    


    

