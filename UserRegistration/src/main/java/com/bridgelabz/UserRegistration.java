package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {


        /**
         * @param FirstName
         * @return
         */
        public static boolean toCheckForFirstNameValidation(String FirstName){
            /**
             * regex pattern is taken;where starting should be Capital letter and then min of 3 characters can be taken
             * pattern is then matched with user input name by using matcher class
             * if the  regex matches with the input name,then print has valid name
             * else invalid username
             */
            boolean isFirstName;
            String regexName = "^[A-Z][a-z]{3,}$";
            Pattern object = Pattern.compile(regexName);
            Matcher objectMatcher = object.matcher(FirstName);
            isFirstName = objectMatcher.matches();
            if(isFirstName) {
                System.out.println(FirstName + " is an valid name");
            }
            else{
                System.out.println(FirstName + " is an invalid user name");
            }

            return isFirstName;
        }

        public static boolean toCheckForLastNameValidation(String LastName){
            boolean isLastName;
            String regexName = "^[A-Z][a-z]{3,}$";
            Pattern object = Pattern.compile(regexName);
            Matcher objectMatcher = object.matcher(LastName);
            isLastName = objectMatcher.matches();
            if(isLastName) {
                System.out.println(LastName + " is an valid name");
            }
            else{
                System.out.println(LastName + " is an invalid user name");
            }
            return isLastName;
        }
        public static boolean toCheckForEmailValidation(String email){
            boolean isEmailId;
            String emailIdRegex ="^[0-9a-zA-Z]+([._+-][0-9a-zA-Z]+)*[@][0-9A-Za-z]+([.][a-zA-Z]{2,4})*$";//abc.xyz@bl.co.in
            Pattern patternObj = Pattern.compile(emailIdRegex);
            Matcher matcherObj = patternObj.matcher(email);
            isEmailId =  matcherObj.matches();

            if(isEmailId)
                System.out.println(email+" is a Valid Email Id\n");
            else
                System.out.println(email+" is a Invalid Email Id");
            return isEmailId;
        }

        public static void toCheckForPhoneNumberValidation(String mobileNumber){
            boolean isMobileNumber;
            String mobileNumberRegex = "^[9][1]\\s[6-9]{1}[0-9]{9}$";
            Pattern obj = Pattern.compile(mobileNumberRegex);
            if (mobileNumber == null) {
                isMobileNumber = false;
            }
            Matcher matcherObj = obj.matcher(mobileNumber);
            isMobileNumber =  matcherObj.matches();

            if(isMobileNumber)
                System.out.println(mobileNumber+" is a Valid  Number\n");
            else
                System.out.println(mobileNumber+" is a Invalid  Number");
        }
        public static boolean toCheckPasswordValidation(String password){
            boolean isPassword;
            String mobileNumberRegex = "^(?=.*[0-9])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}$";
            Pattern obj = Pattern.compile(mobileNumberRegex);
            Matcher matcherObj = obj.matcher(password);
            isPassword =  matcherObj.matches();

            if(isPassword)
                System.out.println(password+" is a Valid  password\n");
            else
                System.out.println(password+" is a Invalid  password");

            return isPassword;
        }
    }


