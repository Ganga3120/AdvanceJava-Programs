let name=prompt("enter the first name");
let name1=prompt("enter the second name");
let massratan=parseFloat(prompt("enter the mass"));
let heightratan=parseFloat(prompt("enter the ratan height"));
let massanu=parseFloat(prompt("enter the mass"));
let heightanu=parseFloat(prompt("enter the anu height"));
 let BMIRatan=(massratan/(heightratan*heightratan));
  let BMIAnu=(massanu/(heightanu*heightanu));
  console.log(BMIAnu);
   document.write(BMIRatan+"<br><br>");
   document.write(BMIAnu+"<br><br>");
  
    console.log(BMIRatan>BMIAnu);
    document.write(BMIRatan>BMIAnu);

  

