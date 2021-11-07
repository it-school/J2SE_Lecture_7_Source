package ClassWork.Task0;

import java.sql.Date;
import java.util.Random;

public class User {
   private String login;
   private String password;
   private Date registrationDate;

   public User() {
   }

   public User(String login, String password, int year, int month, int day) {
      this.setLogin(login);
      this.setPassword(password);
      this.setRegistrationDate(year, month, day);
   }

   public void setRegistrationDate(int year, int month, int day) {
      //noinspection deprecation
      this.registrationDate = new Date(year - 1900, month - 1, day);
   }

   private boolean isValidPassword(String password) {
      boolean hasUpper = false, hasLower = false, hasDigit = false, hasNonLetterOrDigit = false;
      password = password.strip();
      if (password.length() < 8) {
         System.out.println("Incorrect length: " + password.length());
         return false;
      }
      for (int i = 0; i < password.length(); i++) {
         if (!hasDigit && Character.isDigit(password.charAt(i))) {
            hasDigit = true;
         }
         if (!hasUpper && Character.isUpperCase(password.charAt(i))) {
            hasUpper = true;
         }
         if (!hasLower && Character.isLowerCase(password.charAt(i))) {
            hasLower = true;
         }
         if (!hasNonLetterOrDigit && !Character.isAlphabetic(password.charAt(i))
                 && !Character.isDigit(password.charAt(i))) {
            hasNonLetterOrDigit = true;
         }
         if (hasDigit && hasUpper && hasLower && hasNonLetterOrDigit) {
            break;
         }
      }
      if (hasDigit && hasUpper && hasLower && hasNonLetterOrDigit) {
         return true;
      } else {
         if (!hasDigit) {
            System.out.println("No digit");
         }
         if (!hasUpper) {
            System.out.println("No UPPERCASE letter");
         }
         if (!hasLower) {
            System.out.println("No lowercase letter");
         }
         if (!hasNonLetterOrDigit) {
            System.out.println("No symbol neither letter nor digit");
            return false;
         }
      }
      return true;
   }

   private String generatePassword() {
      String password = "";

      Character character;
      int k = 0;
      Random random = new Random();
      for (int i = 0; i < 2; i++) {
         password = password.concat("" + (char) (65 + random.nextInt(27)));
         password = password.concat("" + (char) (97 + random.nextInt(27)));
         password = password.concat("" + (char) (48 + random.nextInt(10)));
         password = password.concat("" + (char) (33 + random.nextInt(13)));
      }
      return password;
   }

   public String getLogin() {
      return login;
   }

   public void setLogin(String login) {
      if (login.length() > 0) {
         this.login = login;
      } else {
         this.login = "anonymous";
      }
   }

   public String getPassword() {
      return password;
   }

   public void setPassword(String password) {
      if (this.isValidPassword(password)) {
         this.password = password;
      } else {
         this.password = generatePassword();
      }
   }

   public Date getRegistrationDate() {
      return registrationDate;
   }

   @Override
   public String toString() {
      return "login: " + login + ", password: " + password + ", registration date: " + registrationDate;
   }
}
