primenumber(5)
function primenumber(n){
    var i=2;
    while(i<=n/2)
     {
       if(n%i==0)
        {
          console.log(n+"is not a prime num");
          
        }
    }
}