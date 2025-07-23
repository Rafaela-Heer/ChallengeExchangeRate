<h1 align="center">💱 Currency Converter using ExchangeRate API</h1>

This is a command-line Java application that converts currencies in real time using the ExchangeRate public API.
The system also keeps a history of conversions made during the session for user reference.

## 🚀 Features
- Real-time currency conversion between international currencies
- Integration with the ExchangeRate API
- In-session conversion history tracking
- Currency code reference list available to the user
- Simple and intuitive terminal interface


## 🖥️ Technologies Used
<div align="left">
<img src="https://cdn.jsdelivr.net/gh/devicons/devicon@latest/icons/java/java-original-wordmark.svg"height="80" alt="java logo"  />
  <img width="12" />  
  
 - Java
 - ExchangeRate API
 - HttpClient (Java native HTTP API)
 - Gson (for JSON parsing)

## 📦 Project Structure
<pre> 📁 APIExchangeRate
 ├── Currency.java
 ├── ExchangeRateApi.java
 └── RequestApi.java
📄 Main.java
📄 README.md </pre>


## ⚙️ How to Run
1. Clone or download the repository
2. Insert your API key
   Open `ExchangeRateApi.java` and replace the line:
  ```
  private static String myapikey = "YOUR_API_KEY_HERE";
  
  ```
3. The **Gson library** `.jar` file manually added to your project
#### 🔧 How to add Gson manually:
 - Go to the [Gson page on Maven Repository](https://mvnrepository.com/artifact/com.google.code.gson/gson)
 - Download the latest stable version (`.jar`) that has **no known vulnerabilities**
 - In your IDE (e.g., IntelliJ IDEA):
   -   Go to `Project Structure > Modules > Dependencies`
   -   Click the `+` icon and choose the `.jar` file you downloaded
   -   Apply and save the changes

4. Compile the project
   ```
   javac Main.java APIExchangeRate/*.java
   ```
5. Run the application `Main.java`

## 📌 Example Interaction
```
EXCHANGE RATE
**********************************

Choose one of the options
 (1) Currency Conversion
 (2) My conversion history
 (3) Exit
-> 1

Want to see the currency code list?
 (1) Yes
 (2) No
-> 1

[displays currency code list...]

From
-> BRL
Amount
-> 100
To 
-> USD

Conversion performed correctly!
From: BRL
To: USD
Exchange rate(now): 0.19
Conversion: 19.00

Do you want to go back to the menu?
 (1) Yes
 (2) No
-> 2

...
Closing
...

```

## 📘 Credits
- ExchangeRate API: https://www.exchangerate-api.com/
- Developed by: **Rafaela Heer** www.linkedin.com/in/rafaelaheer

## 📄 License
This project is free for educational purposes. For commercial use, refer to the ExchangeRate API terms of service.
