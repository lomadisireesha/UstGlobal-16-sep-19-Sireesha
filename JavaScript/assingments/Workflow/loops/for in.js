var names=['siri','hari','lavi','laxmi','hanumantha reddy']
for(var element in names)
{
    console.log('names ',names[element]);
} 
console.log('======');
var drinks=['fanta','limca','sprit','pepsi']
for(var element in drinks)
{
    console.log('drinks ',drinks[element]);
}
console.log('======');
var mood = {
    mood1 : 'family mood' ,
    mood2 : 'friendship mood',
    mood3 : 'angry mood',
    mood4 : 'happy mood',
}
for( var index in mood)
{
    console.log('mood ',mood[index]);
}
console.log('======');
var friends = [
    {
        name :'saritha',
        age : 22,
        clg :  'srit',

},
{
    name :'sow' ,
    age : 22,
    clg :'srit',
},
{
    name :'sashi',
    age : 22,
    clg :'srit',
},]
for(var index in friends)
{
    console.log('friends ',friends[index]);
}
console.log('======');
var Education = [
    {
        name : 'vijaya public school',
        class : '6 to 10',
        area : 'azad nagar',
    },

    {
        name : 'sri chaithanya junior college',
        class :'inter',
        course :'M.P.C',
        area : 'BIG C',
    },
    {
        name : 'SRIT',
        class :'B.TECH',
        course :'ECE',
        area :'Reddypalli',
    },
]
for(var index in Education)
{
    console.log('Education ',Education[index]);
}