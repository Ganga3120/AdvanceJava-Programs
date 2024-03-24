function greet()
{
	document.write("welcome to java classes"+"<br><br>");
}
function add(num1,num2)
{
	let res;
	res=num1+num2;
	document.write("Addition ...."+res+"<br><br>");
}
function addnum(num1,num2)
{
	return num1+num2;
}
function dummy()
{	
}
  greet();
  add(10,20);
   let c=addnum(20,30);
   document.write(c+"<br><br>");
 let r=  dummy();
  document.write(r+"<br><br>");
  let p=function (num1)
  {
	  return num1*num1;
  }
  document.write(p(5)+"<br><br>");
    let mul=(num1,num2)=>{num1*num2};
       document.write(mul(2,8));
       console.log(mul(2,6));