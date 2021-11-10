# This is README for VerintTest Repository

Automation test for Verint.com search bar with "Costumer Solution" search phrase

The test is written in Java with Selenium and Cucumber. There are three main steps of the test, as written on the pom.xml:
1. Given browser is open
   On this step, browser is open (Google Chrome).
   Next, the browser will automatically go to Verint.com webpage
2. When user enters "Costumer Solution" on search bar
   Test will find the search element of the page.
   After element is found, "Costumer Solution" is automatically written on the search bar.
   Search button is entered.
3. Then user is navigated to search result
   Result values appear on the webpage.

