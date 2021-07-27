# Simplify


[![](https://jitpack.io/v/arnoldvaz27/Simplify.svg)](https://jitpack.io/#arnoldvaz27/Simplify)
![OpenSource](https://img.shields.io/badge/Open%20Source-All%20pull%20requests%20will%20be%20verified%20and%20accepted-brightgreen)

![Stable Release](https://img.shields.io/badge/status-stable%20release-red)
![License](https://img.shields.io/badge/License-MIT-purple)

![Copyright](https://img.shields.io/badge/Copyright%202021-Arnold%20Alwyn%20Vaz-blue)
![MIN SDK](https://img.shields.io/badge/Andriod%20SDK-API%2021-yellow)

## About ![About](https://img.shields.io/badge/Simplify-About-orange)
Simplify is an Android Library that consists of different methods that can be used to make development more smoother and the developer has to write less code in order to get the output

## How to use Simplify in my Android Project ![Doc](https://img.shields.io/badge/Documentation-Only%20For%20Latest%20Release%20Version-red) ![Release](https://img.shields.io/badge/Stable%20Release-Version%201.1-violet)
Add JitPack in your **root** ***build.gradle*** at the end of repositories:

 ## For Gradle

```gradle
	allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
 ```
 OR just copy the below code and paste in the ***repositories***
 ```gradle
maven { url 'https://jitpack.io' }
```

  Add the dependency in your **app *build.gradle***:
 
 ```gradle
 	dependencies {
	        implementation 'com.github.arnoldvaz27:Simplify:1.1''
	}
 ```
  OR just copy the below code and paste in the ***build.gradle***
```gradle
implementation 'com.github.arnoldvaz27:Simplify:1.1'
```
 
 
 ## For Maven
   ```gradle
 	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>
		    	https://jitpack.io
		    </url>
		</repository>
	</repositories>
   ```
   
 Add the dependency:
  ```gradle
	<dependency>
	    <groupId>com.github.arnoldvaz27</groupId>
	    <artifactId>Simplify</artifactId>
	    <version>1.1</version>
	</dependency>
 ```
 
 ## For Sbt
 Add it in your build.sbt at the end of resolvers:
   ```gradle
 	 resolvers += "jitpack" at "https://jitpack.io"
   ```
    
 Add the dependency:
  ```gradle
	libraryDependencies += "com.github.arnoldvaz27" % "Simplify" % "1.1"
 ```
 ## For Leiningen
 Add it in your project.clj at the end of repositories:
   ```gradle
 	 :repositories [["jitpack" "https://jitpack.io"]]
   ```
   
 Add the dependency:
  ```gradle
	:dependencies [[com.github.arnoldvaz27/Simplify "1.1"]]
 ```
 
 
 ## Methods in Simplify
 Import the following library in the Android Activity or class:
 
 Import Statements:
 1) **For importing Primitives methods**
```Java
import com.arnold.simplify.Primitives;
```

2) **For importing All methods**
```Java
import com.arnold.simplify.*;
```

Java Code:
1) **String Reverse** ```Version 1.0```
  ```Java
        String a  = Primitives.reverse("Arnold");
 ```
 
2) **String Normal Ascii**  ```Version 1.0```
  ```Java
        String a  = Primitives.normalAscii("Arnold");
 ```
 
3) **String Reverse Ascii** ```Version 1.0```
  ```Java
        String a  = Primitives.reverseAscii("Arnold");
 ```
 
4) **String Title Case** ```Version 1.0```
  ```Java
        String a  = Primitives.toTitleCase("Arnold");
 ```
 
5) **String Toggle Case** ```Version 1.0```
  ```Java
        String a  = Primitives.toToggleCase("Arnold");
 ```
 
6) **Int Word Counter** ```Version 1.0```
  ```Java
        int a  = Primitives.wordCounter("Arnold");
 ```
 
7) **Int Add Ascii** ```Version 1.0```
  ```Java
        int a  = Primitives.addAscii("Arnold");
 ```
 
8) **Int Subtract Ascii** ```Version 1.0```
  ```Java
        int a  = Primitives.subtractAscii("Arnold");
 ```
 
9) **Boolean Palindrome Check** ```Version 1.0```
  ```Java
        Boolean a  = Primitives.isPalindrome("Arnold");
 ```
 
10) **String Sentence to Array** ```Version 1.1```
  ```Java
        String s = Primitives.sentenceToArray("Arnold");
 ```
  
11) **String Fibonacci Series** ```Version 1.1```
  ```Java
        String s = Primitives.Fibonacci(10);
 ```
  
12) **String Factorial** ```Version 1.1```
  ```Java
        String s = Primitives.Factorial(5);
 ```
 
13) **String Armstrong Number** ```Version 1.1```
  ```Java
        String s = Primitives.checkArmstrong(999);
 ```
 
14) **String Prime Number** ```Version 1.1```
  ```Java
        String s = Primitives.checkPrimeNumber(10);
 ```
  
15) **int Reverse Number** ```Version 1.1```
  ```Java
        int r = Primitives.reverseNumber(10678);
 ```
  
16) **int Sum of Array** ```Version 1.1```
  ```Java
        int [] arr = new int [] {1, 2, 3, 4, 5};
        int s = Primitives.sumOfArray(arr);
        String a = String.valueOf(s);
 ```
   
17) **float Cenigrade to Fahrenheit** ```Version 1.1```
  ```Java
        float s = Primitives.CentigradeToFahrenheit(35);
        String a = String.valueOf(s);
 ```
   
18) **float Fahrenheit to Cenigrade** ```Version 1.1```
  ```Java
        float s = Primitives.FahrenheitToCentigrade(96);
        String a = String.valueOf(s);
 ```
 
# For Development of the Library:
## Code reviews ![Code Review](https://img.shields.io/badge/Simplify-Code-blueviolet)

All submissions, including submissions by project members, require review. We use Github Pull Requests (PRs) for this purpose. We recommend you read this guide if you haven't created a Pull Request before.
[Pull request guide](https://docs.github.com/en/github/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests)

Before making any changes, we recommend opening an issue (if one doesn't already exist) and discussing your proposed changes. This way, we can give you feedback and validated the proposed changes. If the changes are minor (simple bug fix of documentation fix), then feel free to open a PR without discussion.

## Verification and Acceptance of Pull Requests ![Verification and Acceptance](https://img.shields.io/badge/Simplify-Important%20Note-red)

1.	Pull requests will be accepted if the code modified is a valid or necessary
2.	Before acceptance, the code will be tested and then it will merged within the branch
3.  After the code is merged the pull requests will be closed
4.  User can not send multiple pull request/ updation code, else this will result in closing all the pull request without further testing process
5.  You can also give screenshots or suggestion for updating the read me file of this project
6.  The request for screenshots or updation the read me file will also be verified as per the above mentioned points. 


## Tools needed for development ![Software to use](https://img.shields.io/badge/Software-Android%20Studio-dark%20green) ![Software to use](https://img.shields.io/badge/Language-Java-dark%20green) ![Software to use](https://img.shields.io/badge/Version%20Control-Github-yellowgreen)

1.  Read The [Documentation for using Android Studio](https://developer.android.com/)
2.  Read The [Documentation for using Java](https://www.java.com/en/)
2.  Read The [Documentation for using Github](https://docs.github.com/en)
       
    
## Support ![Support](https://img.shields.io/badge/Simplify-Support-green)

1. Follow my [github account](https://github.com/arnoldvaz27)
2. Visit my [LinkTree Profile](https://linktr.ee/arnoldvaz) to get more links for discussion 
3. Visit my Website - [Programming Drive](https://programmingdrive.blogspot.com/)

## Opening an issue, bug or suggestion ![Issue](https://img.shields.io/badge/Simplify-Issue%2C%20Bug%20or%20Suggestions-blue)

1. You can also post bug reports and feature requests (only) in this repositoris [GitHub issues section](https://github.com/arnoldvaz27/Simplify/issues)

2. Pull requests can be send from [this link](https://github.com/arnoldvaz27/Simplify/pulls)

## License under MIT ![License](https://img.shields.io/badge/License-MIT-red)    ![Copyright](https://img.shields.io/badge/Copyright%202021-Arnold%20Alwyn%20Vaz-red)

Check [here](https://github.com/arnoldvaz27/Simplify/blob/master/LICENSE) for more details 
This library is shared under **MIT License**.


 
 # Older releases
 ### Version 1.0  [![](https://img.shields.io/badge/JitPack-1.0-brightgreen)](https://img.shields.io/badge/JitPack-1.0-brightgreen)

**For Using the 1.0 Library in your project you need to add the following dependency instead of the mentioned dependency**
### Gradle
```gradle
implementation 'com.github.arnoldvaz27:Simplify:1.0'
```
### Maven
  ```gradle
	<dependency>
	    <groupId>com.github.arnoldvaz27</groupId>
	    <artifactId>Simplify</artifactId>
	    <version>1.0</version>
	</dependency>
 ```
### Sbt
  ```gradle
	libraryDependencies += "com.github.arnoldvaz27" % "Simplify" % "1.0"
 ```
### Leiningen  
```gradle
:dependencies [[com.github.arnoldvaz27/Simplify "1.0"]]
 ```
 
 
 ## Developed By

 ### Made with ♥ by Arnold Vaz
