# Fingoti SDK

The Fingoti SDK makes it easy to use Fingoti infrastructure to manage your organisations & users as well as communicate with your devices, follow the examples below to get started

---

<br>

### Dependencies

Building the API client library requires:

1. Java 1.8+
2. Maven (3.8.3+)/Gradle (7.2+)

<br>
<br>

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>com.fingoti</groupId>
  <artifactId>fingoti-sdk</artifactId>
  <version>v1</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenLocal()
  }

  dependencies {
     implementation "com.fingoti:fingoti-sdk:v1"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/fingoti-sdk-v1.jar`
- `target/lib/*.jar`

<br>
<br>

## Getting Started

Here we will briefly cover the steps needed to get up and running with the SDK

<br>

### Create a configuration

The first step to communicating with the Fingoti infrastructure is authentication and configureation, to do this you will need an API key which can be obtained from http://account.fingoti.com, once you have an API key you can create a configuration as shown below

```java
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;

public class Example {
  public static void main(String[] args) {
    ApiClient defaultClient = Configuration.getDefaultApiClient();
    ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
    Bearer.setApiKey("<your-api-key>");
    Bearer.setApiKeyPrefix("Bearer");
  }
}
```

Now you have a configuration we can use that to authenticate requests to the Fingoti infrastructure, lets start with a basic Organisation information request.

<br>

### Using the APIs

In the SDK the diffrent sections of the infrastructure are split into seperate API's in the example below, we are going to use the Organisation API to retrieve basic information about your Organisation.

```java
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.api.OrganisationApi;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.models.*;

public class Example {
  public static void main(String[] args) {
    // Client setup ommited for brevity

    OrganisationApi apiInstance = new OrganisationApi(defaultClient);

    try {
      OrganisationResponse result = apiInstance.getOrganisation();
      System.out.println(result);
    } catch (ApiException e) {
      System.err.println("Exception when calling OrganisationApi#getOrganisation");
      System.err.println("Status code: " + e.getCode());
      System.err.println("Reason: " + e.getResponseBody());
      System.err.println("Response headers: " + e.getResponseHeaders());
      e.printStackTrace();
    }
  }
}
```

Running that code should print a response in the console, if it does, great! You can now explore the rest of the docuemntation to find API's that fit your requirements.

<br>

### Device Control/Communication

Alongside the API's this package also comes with what we call a command builder which allows you to assemble requests to send to your Fingoti devices. It works in a similar way to the other API's and takes the same configuration shown in [Create a configuration](#create-a-configuration), see below

```java
import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.command.Builder;

public class Example{
    public static void main(String[] args) {
       // Client setup ommited for brevity

        Builder builder = new Builder(defaultClient, "A0B1C2D3E4", true);

        /*
         * Device commands can have read or write operation, generally read commands do
         * not require a payload although
         * there are some exceptions to this rule, see below for some examples
         *
         * All write operations require a payload
         */

        // Adds a deviceColour read command
        builder.addDeviceColour();

        // Adds a deviceColour write command
        builder.addDeviceColour(100, 20, 225);

        // Adds a devicePower read command, only possible operation for this command
        builder.addDevicePower();

        // Adds a uartData write command, only possible operation for this command
        builder.addUARTData(new Integer[] { 72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100 });

        // Adds a scheduleCron read command, this read command requires a payload of slot number
        builder.addScheduleCron(2);

        // Adds a scheduleCron write command, the payload for this command includes the slot
        builder.addScheduleCron(2, "20 * * * *");
    }
}
```
After running this example you should see 2 outputs in your console, the first one is the what was sent to the device and the second is what the device responded with, This is just a small introduction into the command builder and you can find a full list of [avaliable commands](https://developer.fingoti.com/hardware/protocol)
