# Test automation project for [Litres](https://www.litres.ru/)

<p  align="center">
<img src="images/icons/LitLogo.png" alt="LitresLogo" width="900">
</p>


> LitRes is an international company that produces and distributes e-books and digital audiobooks.


# <a name="Description">Description</a>
+ [Technology stack](#Technology)
+ [tests](#Tests)
  + [AllureTestOps](#AllureTestOps)
+ [Gradle command](#GraleCommand)
+ [Jenkins](#Jenkins)
+ [Test results in Allure](#Allure)
+ [Jira integration](#Jira)
+ [Telegram notification](#Telegram)


# <a name="Technology">Technology stack</a>
<p  align="center">

[<code><img width="5%" title="IntelliJ IDEA" src="./images/icons/IIdea.svg"></code>](https://www.jetbrains.com/idea/) - development environment

[<code><img width="5%" title="Java" src="./images/icons/java.svg"></code>](https://www.java.com/) - the programming language used to write the autotests

[<code><img width="5%" title="Github" src="./images/icons/GitHub.svg"></code>](https://github.com/) - a code hosting platform for version control and collaboration

[<code><img width="5%" title="Gradle" src="./images/icons/gradle.svg"></code>](https://gradle.org/) - a self-assembly system

[<code><img width="5%" title="Selenide" src="./images/icons/selenide.svg"></code>](https://ru.selenide.org/) - a framework for automated web application testing based on Selenium WebDriver
  
[<code><img width="5%" title="Selenoid" src="./images/icons/selenoid.svg"></code>](https://aerokube.com/selenoid/latest/) - a Selenium testing platform running browsers and mobile platforms in Docker containers
  
[<code><img width="5%" title="JUnit5" src="./images/icons/junit5.svg"></code>](https://junit.org/junit5/)  - a framework for unit testing.

[<code><img width="5%" title="Allure Report" src="./images/icons/Allure-Report.svg"></code>](https://qameta.io/allure-report/) - a flexible, lightweight multi-language test reporting tool
  
[<code><img width="5%" title="Allure TestOps" src="./images/icons/Allure-TestOps.svg"></code>](https://qameta.io/) - Next-gen Software Quality Management Platform for manual and automation testing

[<code><img width="5%" title="Jenkins" src="./images/icons/Jenkins.svg"></code>](https://www.jenkins.io/) - a system that ensures a process of continuous software integration

[<code><img width="5%" title="Jira" src="./images/icons/Jira.svg"></code>](https://www.atlassian.com/ru/software/jira) - a system for task tracking and project management

[<code><img width="5%" title="Telegram" src="./images/icons/Telegram.svg"></code>](https://web.telegram.org/z/) - a cloud-based mobile and desktop messaging app with a focus on security and speed.
</p>

[To Description](#Description)


# <a name="tests">Tests</a>
 > - Test " Lower-Menu-Module Selection ";
 > - Test "Genres menu";
 > - Test "Scrolling the carousel on the Main page";
 > - Test books title search;
 > - Checking the addition of books to favourites;
 > - User credentials validation:
 >   - Valid Autorisation;
 >   - Invalid Autorisation;

## <a name="AllureTestOps">AllureTestOps</a> 


[To Description](#Description)

# <a name="GradleCommand">Gradle Command</a>
To run the test locally from the terminal, run the command:
>**gradle clean test**

Parameterised assembly:
>**gradle clean test -DbaseUrl=${BASEURL} -Dbrowser=${BROWSER} -DbrowserVersion=${BROWSER_VERSION} -DEnvironment=${ENVIRONMENT} -DbrowserSize=${BROWSER_SIZE} -DremoteDriverUrl=${SELENOID_URL}**

[To Description](#Description)

# <a name="Jenkins">Jenkins</a>
>1. To start the build, you need to enter the parameters in the settings and then build with the specified parameters:

[<code><img width="800" title="Jenkins" src="./images/icons/Jenkins1.jpg"></code>](https://jenkins.autotests.cloud/job/Diploma_Kiriesha/)

>2. Selecting parameters for assembly:

[<code><img width="800" title="Jenkins" src="./images/icons/Jenkins2.jpg"></code>](https://jenkins.autotests.cloud/job/Diploma_Kiriesha/)
>3. After assembly, you can watch the Allure report:

<code><img width="800" title="Jenkins" src="./images/icons/Jenkins3.jpg"></code>
[To Description](#Description)

# <a name="Allure">Test results in Allure</a>
>1. On the Overview tab you can see general information:

[<code><img width="800" title="Jenkins" src="./images/icons/Allure1.jpg"></code>](https://jenkins.autotests.cloud/job/Diploma_Kiriesha/2/allure/)
>2. This tab contains graphs:

[<code><img width="800" title="Jenkins" src="./images/icons/Allure2.jpg"></code>](https://jenkins.autotests.cloud/job/Diploma_Kiriesha/2/allure/#graph)
> 3. On this tab you can view the test steps and Attachments for each test:

[<code><img width="800" title="Jenkins" src="./images/icons/Allure3.jpg"></code>](https://jenkins.autotests.cloud/job/Diploma_Kiriesha/2/allure/#suites)

[To Description](#Description)

# <a name="Jira">Jira integration</a>





[To Description](#Description)

# <a name="Telegram">Telegram notification</a>

<code><img width="800" title="Jenkins" src="./images/icons/TelegramBot.png"></code>


[To Description](#Description)


