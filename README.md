# Simplify

[![](https://jitpack.io/v/arnoldvaz27/Simplify.svg)](https://jitpack.io/#arnoldvaz27/Simplify)
![OpenSource](https://img.shields.io/badge/Open%20Source-All%20pull%20requests%20will%20be%20verified%20and%20accepted-brightgreen)

![Stable Release](https://img.shields.io/badge/status-stable%20release-red)
![License](https://img.shields.io/badge/License-MIT-purple)

![Copyright](https://img.shields.io/badge/Copyright%202021-Arnold%20Alwyn%20Vaz-blue)
![Stable Release](https://img.shields.io/badge/status-stable%20release-red)

## About ![About](https://img.shields.io/badge/Simplify-About-orange)
Simplify is an Android Library that consists of different methods that can be used to make development more smoother and the developer has to write less code in order to get the output

## How to use Simplify in my Android Project
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
 
  Add the dependency in your **app *build.gradle***:
 
 ```gradle
 	dependencies {
	        implementation 'com.github.arnoldvaz27:Simplify:1.0'
	}
 ```
 
 
 ## For Maven
   ```gradle
 	<repositories>
		<repository>
		    <id>jitpack.io</id>
		    <url>https://jitpack.io</url>
		</repository>
	</repositories>
   ```
   
 Add the dependency:
  ```gradle
	<dependency>
	    <groupId>com.github.arnoldvaz27</groupId>
	    <artifactId>Simplify</artifactId>
	    <version>1.0</version>
	</dependency>
 ```
 
 ## For Sbt
 Add it in your build.sbt at the end of resolvers:
   ```gradle
 	 resolvers += "jitpack" at "https://jitpack.io"
   ```
    
 Add the dependency:
  ```gradle
	libraryDependencies += "com.github.arnoldvaz27" % "Simplify" % "1.0"
 ```
 ## For Leiningen
 Add it in your project.clj at the end of repositories:
   ```gradle
 	 :repositories [["jitpack" "https://jitpack.io"]]
   ```
   
 Add the dependency:
  ```gradle
	:dependencies [[com.github.arnoldvaz27/Simplify "1.0"]]
 ```
 
 
 ## Methods in Simplify
 

Java Code:
1) **String Reverse** 
  ```Java
        String a  = Primitives.reverse("Arnold");
 ```
 
2) **String Normal Ascii**
  ```Java
        String a  = Primitives.normalAscii("Arnold");
 ```
 
3) **String Reverse Ascii**
  ```Java
        String a  = Primitives.reverseAscii("Arnold");
 ```
 
4) **String Title Case**
  ```Java
        String a  = Primitives.toTitleCase("Arnold");
 ```
 
5) **String Toggle Case**
  ```Java
        String a  = Primitives.toToggleCase("Arnold");
 ```
 
6) **Int Word Counter**
  ```Java
        int a  = Primitives.wordCounter("Arnold");
 ```
 
7) **Int Add Ascii**
  ```Java
        int a  = Primitives.addAscii("Arnold");
 ```
 
8) **Int Subtract Ascii**
  ```Java
        int a  = Primitives.subtractAscii("Arnold");
 ```
 
9) **Boolean Palindrome Check**
  ```Java
        Boolean a  = Primitives.isPalindrome("Arnold");
 ```
 
 ## Licence
This library is shared under **MIT License**.

 # Developed By

 ### Made with ♥ by Arnold Vaz
