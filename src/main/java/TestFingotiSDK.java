import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.Configuration;
import com.fingoti.sdk.api.OrganisationApi;
import com.fingoti.sdk.auth.*;
import com.fingoti.sdk.command.Builder;
import com.fingoti.sdk.models.*;

import com.fingoti.sdk.models.Command;

public class TestFingotiSDK {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.dev.fingoti.net");
        // Configure API key authorization: Bearer
        ApiKeyAuth Bearer = (ApiKeyAuth) defaultClient.getAuthentication("Bearer");
        Bearer.setApiKey(
                "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCIsImN0eSI6IkpXVCJ9.eyJ0eXAiOiJPcmdhbmlzYXRpb24iLCJpYXQiOjE2NzM2MTY4MjcsIm9pZCI6ImVlMTE0MTRlLWMzODgtNDQxMy1hZDBkLTljYWM1NmY1ZWUyNCIsInRrbiI6IjJkOTg2Yjk1LTNlMjYtNGQxNS04ZTlkLTU1NDU1YjEyN2UyZiJ9.CUxlF0imTvPXnsennAK6eoUXp2KhJMcvNk_RobQJkbE");
        Bearer.setApiKeyPrefix("Bearer");

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

        //Adds a uartData write command, only possible operation for this command
        builder.addUARTData(new Integer[] { 72, 101, 108, 108, 111, 32, 87, 111, 114, 108, 100 });

        //Adds a scheduleCron read command, this read command requires a payload of slot number
        builder.addScheduleCron(2);

//Adds a scheduleCron write command, the payload for this command includes the slot
        builder.addScheduleCron(2, "20 * * * *");

    }
}
