let num1=parseInt(prompt("enter the first number"));
let num2=parseInt(prompt("enter thee second number"));
let i;
for(i=num1;i<=num2;i++)
{
	if((i%3==0)&&(i%5==0))
	{
	console.log("FIZZBUZZ ");
	document.write("FIZZBUZZ"+"<br><br>");
	}
	else if(i%5==0)
	{
	console.log("BUZZ");
		document.write("BUZZ"+"<br><br>");
		}
	else if(i%3==0)
	{
			document.write("FIZZ"+"<br><br>");
	console.log("FIZZ")
	}
	else
	{
		document.write(i+"<br><br>");
	console.log("the numbers are"+i+"<br><br>");
	}
}