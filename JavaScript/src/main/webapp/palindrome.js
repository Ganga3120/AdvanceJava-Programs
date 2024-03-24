function palindromeCheck()
{
	var num1=parseInt(document.getElementById('NUmber').value);
	var rev=0;
	 var rem;
	var temp=num1;
	while(temp>0)
	{
		 rem=parseInt(temp%10);
		temp=parseInt(temp/10);
		rev=rev*10+rem;
	}
	document.getElementById('Reversenum').value=rev;
	if(num1===rev)
	 alert("it is a palindrome");
	 else
	 alert("it is not a palindrome");
}
palindromeCheck()
 