# Simplify


[![](https://jitpack.io/v/arnoldvaz27/Simplify.svg)](https://jitpack.io/#arnoldvaz27/Simplify)
![OpenSource](https://img.shields.io/badge/Open%20Source-All%20pull%20requests%20will%20be%20verified%20and%20accepted-blue)

![Stable Release](https://img.shields.io/badge/status-stable%20release-red)
![License](https://img.shields.io/badge/License-MIT-purple)

![Copyright](https://img.shields.io/badge/Copyright%202021-Arnold%20Alwyn%20Vaz-blue)
![MIN SDK](https://img.shields.io/badge/Andriod%20SDK-API%2021-yellow)

![Thank you](https://img.shields.io/badge/Arnold%20Vaz-Thank%20you%20for%20visiting%20this%20open%20source%20library-red)

## About ![About](https://img.shields.io/badge/Simplify-About-orange)
Simplify is an Android Library that consists of different methods that can be used to make development more smoother and the developer has to write less code in order to get the output

> ***For documentations of previous release 1.0 to 1.3, [Click Here](https://vazarnold27.medium.com/simplify-android-library-d0bcbe15dfbe)***
> 
> ***Please read the documentation carefully (for releases from 1.4 and above), if you have any queries feel free to connect with me***

## How to use Simplify in my Android Project ![Doc](https://img.shields.io/badge/Documentation-Only%20For%20Latest%20Release%20Version-red) ![Release](https://img.shields.io/badge/Stable%20Release-Version%201.4-violet)



## For Gradle
1) Add JitPack in your **root** ***build.gradle*** at the end of repositories:
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

**If you find the following error** 

***Example***

> A problem occurred evaluating root project 'WeatherGuide'. 

> Build was configured to prefer settings repositories over project repositories but repository 'maven' was added by build file 'build.gradle'

> **This error generally occurs in newer android studio version starting from version 4.0**

**Please replace the code in the settings.gradle file**

> **From**
```gradle
dependencyResolutionManagement {
    	repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    	repositories {
        google()
        mavenCentral()
    }
}
 ```
 
> **To**

```gradle
dependencyResolutionManagement {
    	repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    	repositories {
        google()
        mavenCentral()
        maven { url 'https://jitpack.io' }
    }
}
 ```


2) Add the dependency in your **app *build.gradle***:

<!--
  
  **If you want to use version 1.3 then add the following dependency** ![](https://img.shields.io/badge/Release-1.3-green) [![](https://jitpack.io/v/arnoldvaz27/Simplify.svg)](https://jitpack.io/#arnoldvaz27/Simplify)
 ```gradle
 	dependencies {
	        implementation 'com.github.arnoldvaz27:Simplify:1.3'
	}
 ```
  OR just copy the below code and paste in the ***build.gradle***
```gradle
implementation 'com.github.arnoldvaz27:Simplify:1.3'
```

  **If you want to use version 1.2 then add the following dependency** ![](https://img.shields.io/badge/Older%20Release-1.2-blue) [![](https://img.shields.io/badge/JitPack-1.2-brightgreen)](https://img.shields.io/badge/JitPack-1.2-blue)
 ```gradle
 	dependencies {
	        implementation 'com.github.arnoldvaz27:Simplify:1.2'
	}
 ```
  OR just copy the below code and paste in the ***build.gradle***
```gradle
implementation 'com.github.arnoldvaz27:Simplify:1.2'
```
  **If you want to use version 1.1 then add the following dependency** ![](https://img.shields.io/badge/Older%20Release-1.1-blue) [![](https://img.shields.io/badge/JitPack-1.1-brightgreen)](https://img.shields.io/badge/JitPack-1.0-blue)
 ```gradle
 	dependencies {
	        implementation 'com.github.arnoldvaz27:Simplify:1.1'
	}
 ```
  OR just copy the below code and paste in the ***build.gradle***
```gradle
implementation 'com.github.arnoldvaz27:Simplify:1.1'
```
-->

  **Add the following dependency** ![](https://img.shields.io/badge/Latest%20Release-1.4-blue) [![](https://img.shields.io/badge/JitPack-1.4-brightgreen)](https://img.shields.io/badge/JitPack-1.4-blue)
 ```gradle
 	dependencies {
	        implementation 'com.github.arnoldvaz27:Simplify:1.4'
	}
 ```
  OR just copy the below code and paste in the ***build.gradle***
 ```gradle
implementation 'com.github.arnoldvaz27:Simplify:1.4'
```

## For Maven
 1) Add JitPack:
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
   
 2) Add the dependency:
 
 <!--
  **If you want to use version 1.3 then add the following dependency** ![](https://img.shields.io/badge/Release-1.3-blue) [![](https://jitpack.io/v/arnoldvaz27/Simplify.svg)](https://jitpack.io/#arnoldvaz27/Simplify)
  ```gradle
	<dependency>
	    <groupId>com.github.arnoldvaz27</groupId>
	    <artifactId>Simplify</artifactId>
	    <version>1.3</version>
	</dependency>
 ```
  **If you want to use version 1.2 then add the following dependency** ![](https://img.shields.io/badge/Older%20Release-1.2-blue) [![](https://img.shields.io/badge/JitPack-1.2-brightgreen)](https://img.shields.io/badge/JitPack-1.2-blue)
  ```gradle
	<dependency>
	    <groupId>com.github.arnoldvaz27</groupId>
	    <artifactId>Simplify</artifactId>
	    <version>1.2</version>
	</dependency>
 ```
  **If you want to use version 1.1 then add the following dependency** ![](https://img.shields.io/badge/Older%20Release-1.1-blue) [![](https://img.shields.io/badge/JitPack-1.1-brightgreen)](https://img.shields.io/badge/JitPack-1.1-blue)
  
  ```gradle
	<dependency>
	    <groupId>com.github.arnoldvaz27</groupId>
	    <artifactId>Simplify</artifactId>
	    <version>1.1</version>
	</dependency>
 ```
 -->
 
  **Add the following dependency** ![](https://img.shields.io/badge/Latest%20Release-1.4-blue) [![](https://img.shields.io/badge/JitPack-1.4-brightgreen)](https://img.shields.io/badge/JitPack-1.4-blue)
  
  ```gradle
	<dependency>
	    <groupId>com.github.arnoldvaz27</groupId>
	    <artifactId>Simplify</artifactId>
	    <version>1.4</version>
	</dependency>
 ```
 

## For Sbt
 1) Add it in your build.sbt at the end of resolvers:
   ```gradle
 	 resolvers += "jitpack" at "https://jitpack.io"
   ```
    
 2) Add the dependency:
 <!--
  **If you want to use version 1.3 then add the following dependency** ![](https://img.shields.io/badge/Release-1.3-blue) [![](https://jitpack.io/v/arnoldvaz27/Simplify.svg)](https://jitpack.io/#arnoldvaz27/Simplify)
  ```gradle
	libraryDependencies += "com.github.arnoldvaz27" % "Simplify" % "1.3"
 ```
 **If you want to use version 1.2 then add the following dependency** ![](https://img.shields.io/badge/Older%20Release-1.2-blue) [![](https://img.shields.io/badge/JitPack-1.2-brightgreen)](https://img.shields.io/badge/JitPack-1.2-blue)
  ```gradle
	libraryDependencies += "com.github.arnoldvaz27" % "Simplify" % "1.2"
 ```
**If you want to use version 1.1 then add the following dependency** ![](https://img.shields.io/badge/Older%20Release-1.1-blue) [![](https://img.shields.io/badge/JitPack-1.2-brightgreen)](https://img.shields.io/badge/JitPack-1.1-blue)
  ```gradle
	libraryDependencies += "com.github.arnoldvaz27" % "Simplify" % "1.1"
 ```
 -->
 
 **Add the following dependency** ![](https://img.shields.io/badge/Latest%20Release-1.4-blue) [![](https://img.shields.io/badge/JitPack-1.4-brightgreen)](https://img.shields.io/badge/JitPack-1.4-blue)
  ```gradle
	libraryDependencies += "com.github.arnoldvaz27" % "Simplify" % "1.4"
 ```
  
## For Leiningen

 1) Add it in your project.clj at the end of repositories:
   ```gradle
 	 :repositories [["jitpack" "https://jitpack.io"]]
   ```
   
 2) Add the dependency:

<!--
**If you want to use version 1.3 then add the following dependency** ![](https://img.shields.io/badge/Release-1.3-green) [![](https://jitpack.io/v/arnoldvaz27/Simplify.svg)](https://jitpack.io/#arnoldvaz27/Simplify)
  ```gradle
	:dependencies [[com.github.arnoldvaz27/Simplify "1.3"]]
 ```
**If you want to use version 1.2 then add the following dependency** ![](https://img.shields.io/badge/Older%20Release-1.2-green) [![](https://img.shields.io/badge/JitPack-1.2-brightgreen)](https://img.shields.io/badge/JitPack-1.2-brightgreen)
  ```gradle
	:dependencies [[com.github.arnoldvaz27/Simplify "1.2"]]
 ```

**If you want to use version 1.1 then add the following dependency** ![](https://img.shields.io/badge/Older%20Release-1.1-green) [![](https://img.shields.io/badge/JitPack-1.1-brightgreen)](https://img.shields.io/badge/JitPack-1.1-brightgreen)
  ```gradle
	:dependencies [[com.github.arnoldvaz27/Simplify "1.1"]]
 ```
 -->
 
  **Add the following dependency** ![](https://img.shields.io/badge/Latest%20Release-1.4-blue) [![](https://img.shields.io/badge/JitPack-1.4-brightgreen)](https://img.shields.io/badge/JitPack-1.4-blue)
   ```gradle
	 :dependencies [[com.github.arnoldvaz27/Simplify "1.4"]]
 ```
 
## Methods in Simplify
  
**For Method Details of Simplify** [Click Here](https://arnoldvaz27.github.io/SimplifyDocumentation/)
 

# For Development of the Library:
## Code reviews ![Code Review](https://img.shields.io/badge/Simplify-Code-blueviolet)

All submissions, including submissions by project members, require review. We use Github Pull Requests (PRs) for this purpose. We recommend you read this guide if you haven't created a Pull Request before.
[Pull request guide](https://docs.github.com/en/github/collaborating-with-pull-requests/proposing-changes-to-your-work-with-pull-requests/about-pull-requests)

Before making any changes, we recommend opening an issue (if one doesn't already exist) and discussing your proposed changes. This way, we can give you feedback and validated the proposed changes. If the changes are minor (simple bug fix of documentation fix), then feel free to open a PR without discussion.

## Verification and Acceptance of Pull Requests ![Verification and Acceptance](https://img.shields.io/badge/Simplify-Important%20Note-red)

1. Pull requests will be accepted if the code modified is a valid or necessary
2. Before acceptance, the code will be tested and then it will merged within the branch
3. After the code is merged the pull requests will be closed
4. User can not send multiple pull request/ updation code, else this will result in closing all the pull request without further testing process
5. You can also give screenshots or suggestion for updating the read me file of this project
6. The request for screenshots or updation the read me file will also be verified as per the above mentioned points. 


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

<br>

## Developed By

**Made with ❤️ by Arnold Vaz**
