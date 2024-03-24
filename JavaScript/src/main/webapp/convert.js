function convertDolartoInr()
{
	const dolar=document.getElementById("dollarInput").value;
	const inr=(parseFloat(dolar*82.5));
	document.getElementById("INROutput").value=inr.toFixed(2);
}