 function ConvertStringtorev()
  {
    const stringIn = document.getElementById('StringIn').value; // Corrected variable name
    let i;
    let stringOut = ""; // Changed variable name and initialized as empty string
    for (i = stringIn.length - 1; i >= 0; i--) {
        stringOut += stringIn[i]; // Concatenate characters to form the reversed string
    }
    document.getElementById('ReverseString').value = stringOut; 
    // Corrected variable name
    if(stringIn===stringOut)
    alert("IT IS A PALINDROME");
    else
        alert("IT IS NOT A PALINDROME");

}
