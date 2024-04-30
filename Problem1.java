class Problem1 extends ConsoleProgram {

  /**
  * Description
  * @author: Emma Chan 
  */
  
  public void run() {
    String firstName = readLine("What is your first name: "); 
    String lastName = readLine("What is your last name: "); 
    String numbers = readLine("What is your student number: ");
    String password = readLine("What is your password: "); 
    
    String userName = createUserName(firstName, lastName, numbers);
    boolean passwordCheck = validatePassword(password); 

    System.out.println("Your Username: " + userName);
    System.out.println ("Valid Password: " + passwordCheck); 
    
  }
  // two methods plus run method

  public String createUserName(String firstName, String lastName, String numbers){
    String username = ""; 

     char c = firstName.charAt(0);
     username += Character.toUpperCase(c); 

      for (int i = 0; i < lastName.length(); i++){
        char l = lastName.charAt(i);
        if (i <= 4){
        username += Character.toLowerCase(l); 
        }
    }
    for (int x = 0; x < numbers.length(); x++){
      char n = numbers.charAt(x); 
      if ( x >= 6 ||  x >= 8){
        username += n; 
      }
      
    } 
    return username;   
  }

  public boolean validatePassword (String password){
    boolean either = Character.isLetterOrDigit(x);
    if (password.length() > 7){
      return true;
      for (int z = 0; z < password.length(); z++){
        char p  = password.charAt(z); 
        if (either == true){
          return true; 
        } else if (p >= 'A' && p <= 'Z') {
          return true; 
       } else {
      return false; 
    } 
  }
}
  }
}
