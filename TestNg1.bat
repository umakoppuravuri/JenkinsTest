set projectLocation=E:\Selenium\JenkinsTest
cd %projectLocation%
set classpath=%projectLocation%\bin;%projectLocation%\lib\*
java org.testng.TestNG %projectLocation%\TestNg.xml
pause