/*
 * Fingoti API
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package com.fingoti.sdk;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapter;
import com.google.gson.internal.bind.util.ISO8601Utils;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.google.gson.JsonElement;
import io.gsonfire.GsonFireBuilder;
import io.gsonfire.TypeSelector;

import okio.ByteString;

import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Type;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.ParsePosition;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.HashMap;

/*
 * A JSON utility class
 *
 * NOTE: in the future, this class may be converted to static, which may break
 *       backward-compatibility
 */
public class JSON {
    private static Gson gson;
    private static boolean isLenientOnJson = false;
    private static DateTypeAdapter dateTypeAdapter = new DateTypeAdapter();
    private static SqlDateTypeAdapter sqlDateTypeAdapter = new SqlDateTypeAdapter();
    private static OffsetDateTimeTypeAdapter offsetDateTimeTypeAdapter = new OffsetDateTimeTypeAdapter();
    private static LocalDateTypeAdapter localDateTypeAdapter = new LocalDateTypeAdapter();
    private static ByteArrayAdapter byteArrayAdapter = new ByteArrayAdapter();

    @SuppressWarnings("unchecked")
    public static GsonBuilder createGson() {
        GsonFireBuilder fireBuilder = new GsonFireBuilder()
        ;
        GsonBuilder builder = fireBuilder.createGsonBuilder();
        return builder;
    }

    private static String getDiscriminatorValue(JsonElement readElement, String discriminatorField) {
        JsonElement element = readElement.getAsJsonObject().get(discriminatorField);
        if (null == element) {
            throw new IllegalArgumentException("missing discriminator field: <" + discriminatorField + ">");
        }
        return element.getAsString();
    }

    /**
     * Returns the Java class that implements the OpenAPI schema for the specified discriminator value.
     *
     * @param classByDiscriminatorValue The map of discriminator values to Java classes.
     * @param discriminatorValue The value of the OpenAPI discriminator in the input data.
     * @return The Java class that implements the OpenAPI schema
     */
    private static Class getClassByDiscriminator(Map classByDiscriminatorValue, String discriminatorValue) {
        Class clazz = (Class) classByDiscriminatorValue.get(discriminatorValue);
        if (null == clazz) {
            throw new IllegalArgumentException("cannot determine model class of name: <" + discriminatorValue + ">");
        }
        return clazz;
    }

    {
        GsonBuilder gsonBuilder = createGson();
        gsonBuilder.registerTypeAdapter(Date.class, dateTypeAdapter);
        gsonBuilder.registerTypeAdapter(java.sql.Date.class, sqlDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(OffsetDateTime.class, offsetDateTimeTypeAdapter);
        gsonBuilder.registerTypeAdapter(LocalDate.class, localDateTypeAdapter);
        gsonBuilder.registerTypeAdapter(byte[].class, byteArrayAdapter);
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.AddAddressRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.AddFollowDto.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.AddPresetRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.AddPresetResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.AddRoleRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.AddWebhookDto.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.AddWebhookResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.AllWebhooksDto.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.AzureMessage.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.AzureMessageContent.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.CallLogDto.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.ClaimRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.ClaimResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.ClaimedDeviceResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.ClaimedDevicesDto.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.CommandLogResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.DataLogResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.DefaultWithId.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.DefaultWithToken.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.DeviceBlink.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.DeviceBus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.DeviceCloud.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.DeviceLocation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.DeviceNodesResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.DevicePeblDto.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.DevicePower.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.DeviceRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.DeviceSupport.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.DeviceUptime.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.DeviceVersion.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.DeviceVyneDto.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.EngineWebhookDto.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.EngineWebhookResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.EngineWebhooksResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.GatewayClaim.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.GatewayGpio.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.GatewayI2c.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.GatewayMqtt.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.GatewayNetwork.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.GatewayNode.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.GatewaySchedule.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.GatewayTimer.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.GatewayUart.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.GatewayWifi.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.GetProfileResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.I2cSetup.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.InviteUserDto.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.ModelDefault.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.MqttDeviceResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.MqttSetup.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.MqttStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.NetworkIp.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.NetworkMac.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.NewOrganisationTokenDto.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.NewUserTokenDto.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.NodeAddress.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.NodeData.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.NodeDetect.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.NodeLocation.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.OrganisationAddressResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.OrganisationAddressesDto.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.OrganisationFollowing.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.OrganisationFollowingResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.OrganisationPartnerResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.OrganisationPresetResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.OrganisationPresetsDto.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.OrganisationResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.OrganisationRoleResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.OrganisationRolesDto.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.OrganisationTenantDto.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.OrganisationTenantsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.OrganisationUserResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.OrganisationUsersDto.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.PartnerAddress.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.PartnerContact.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.PatchAddressRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.PatchDevice.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.PatchFollowRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.PatchGateway.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.PatchOrganisationRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.PatchOrganisationTokenRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.PatchPresetRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.PatchRoleRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.PatchUserRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.PatchUserTokenRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.PatchWebhookRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.PeblDevice.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.PeblGateway.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.PortalUserOrganisationsDto.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.RegiserOrganisationDto.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.RegiserTenantDto.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.RegisterOrganisationResult.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.RegisterUserDto.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.ScheduleSetup.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.ScheduleStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.TimerRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.TimerStatus.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.TokenSuccessResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.UartSetup.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.UartTrigger.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.UpdateRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.UpdateResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.UpdateUserRole.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.UsageTracking.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.UsageTrackingResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.UserOrganisationsDto.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.UserSessionsDto.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.UserSessionsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.UserTokenDto.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.UserTokenResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.VyneDevice.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.VyneGateway.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.VyneNode.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.WebhookAttempts.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.WebhookCallDto.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.WebhookHeaders.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.WebhookLogsResponse.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.WebhookRetry.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.WebhookRetryRequest.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.WifiDetect.CustomTypeAdapterFactory());
        gsonBuilder.registerTypeAdapterFactory(new com.fingoti.sdk.models.WifiStatus.CustomTypeAdapterFactory());
        gson = gsonBuilder.create();
    }

    /**
     * Get Gson.
     *
     * @return Gson
     */
    public static Gson getGson() {
        return gson;
    }

    /**
     * Set Gson.
     *
     * @param gson Gson
     */
    public static void setGson(Gson gson) {
        JSON.gson = gson;
    }

    public static void setLenientOnJson(boolean lenientOnJson) {
        isLenientOnJson = lenientOnJson;
    }

    /**
     * Serialize the given Java object into JSON string.
     *
     * @param obj Object
     * @return String representation of the JSON
     */
    public static String serialize(Object obj) {
        return gson.toJson(obj);
    }

    /**
     * Deserialize the given JSON string to Java object.
     *
     * @param <T>        Type
     * @param body       The JSON string
     * @param returnType The type to deserialize into
     * @return The deserialized Java object
     */
    @SuppressWarnings("unchecked")
    public static <T> T deserialize(String body, Type returnType) {
        try {
            if (isLenientOnJson) {
                JsonReader jsonReader = new JsonReader(new StringReader(body));
                // see https://google-gson.googlecode.com/svn/trunk/gson/docs/javadocs/com/google/gson/stream/JsonReader.html#setLenient(boolean)
                jsonReader.setLenient(true);
                return gson.fromJson(jsonReader, returnType);
            } else {
                return gson.fromJson(body, returnType);
            }
        } catch (JsonParseException e) {
            // Fallback processing when failed to parse JSON form response body:
            // return the response body string directly for the String return type;
            if (returnType.equals(String.class)) {
                return (T) body;
            } else {
                throw (e);
            }
        }
    }

    /**
     * Gson TypeAdapter for Byte Array type
     */
    public static class ByteArrayAdapter extends TypeAdapter<byte[]> {

        @Override
        public void write(JsonWriter out, byte[] value) throws IOException {
            if (value == null) {
                out.nullValue();
            } else {
                out.value(ByteString.of(value).base64());
            }
        }

        @Override
        public byte[] read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String bytesAsBase64 = in.nextString();
                    ByteString byteString = ByteString.decodeBase64(bytesAsBase64);
                    return byteString.toByteArray();
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 OffsetDateTime type
     */
    public static class OffsetDateTimeTypeAdapter extends TypeAdapter<OffsetDateTime> {

        private DateTimeFormatter formatter;

        public OffsetDateTimeTypeAdapter() {
            this(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
        }

        public OffsetDateTimeTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, OffsetDateTime date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public OffsetDateTime read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    if (date.endsWith("+0000")) {
                        date = date.substring(0, date.length()-5) + "Z";
                    }
                    return OffsetDateTime.parse(date, formatter);
            }
        }
    }

    /**
     * Gson TypeAdapter for JSR310 LocalDate type
     */
    public static class LocalDateTypeAdapter extends TypeAdapter<LocalDate> {

        private DateTimeFormatter formatter;

        public LocalDateTypeAdapter() {
            this(DateTimeFormatter.ISO_LOCAL_DATE);
        }

        public LocalDateTypeAdapter(DateTimeFormatter formatter) {
            this.formatter = formatter;
        }

        public void setFormat(DateTimeFormatter dateFormat) {
            this.formatter = dateFormat;
        }

        @Override
        public void write(JsonWriter out, LocalDate date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                out.value(formatter.format(date));
            }
        }

        @Override
        public LocalDate read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    return LocalDate.parse(date, formatter);
            }
        }
    }

    public static void setOffsetDateTimeFormat(DateTimeFormatter dateFormat) {
        offsetDateTimeTypeAdapter.setFormat(dateFormat);
    }

    public static void setLocalDateFormat(DateTimeFormatter dateFormat) {
        localDateTypeAdapter.setFormat(dateFormat);
    }

    /**
     * Gson TypeAdapter for java.sql.Date type
     * If the dateFormat is null, a simple "yyyy-MM-dd" format will be used
     * (more efficient than SimpleDateFormat).
     */
    public static class SqlDateTypeAdapter extends TypeAdapter<java.sql.Date> {

        private DateFormat dateFormat;

        public SqlDateTypeAdapter() {}

        public SqlDateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, java.sql.Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = date.toString();
                }
                out.value(value);
            }
        }

        @Override
        public java.sql.Date read(JsonReader in) throws IOException {
            switch (in.peek()) {
                case NULL:
                    in.nextNull();
                    return null;
                default:
                    String date = in.nextString();
                    try {
                        if (dateFormat != null) {
                            return new java.sql.Date(dateFormat.parse(date).getTime());
                        }
                        return new java.sql.Date(ISO8601Utils.parse(date, new ParsePosition(0)).getTime());
                    } catch (ParseException e) {
                        throw new JsonParseException(e);
                    }
            }
        }
    }

    /**
     * Gson TypeAdapter for java.util.Date type
     * If the dateFormat is null, ISO8601Utils will be used.
     */
    public static class DateTypeAdapter extends TypeAdapter<Date> {

        private DateFormat dateFormat;

        public DateTypeAdapter() {}

        public DateTypeAdapter(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        public void setFormat(DateFormat dateFormat) {
            this.dateFormat = dateFormat;
        }

        @Override
        public void write(JsonWriter out, Date date) throws IOException {
            if (date == null) {
                out.nullValue();
            } else {
                String value;
                if (dateFormat != null) {
                    value = dateFormat.format(date);
                } else {
                    value = ISO8601Utils.format(date, true);
                }
                out.value(value);
            }
        }

        @Override
        public Date read(JsonReader in) throws IOException {
            try {
                switch (in.peek()) {
                    case NULL:
                        in.nextNull();
                        return null;
                    default:
                        String date = in.nextString();
                        try {
                            if (dateFormat != null) {
                                return dateFormat.parse(date);
                            }
                            return ISO8601Utils.parse(date, new ParsePosition(0));
                        } catch (ParseException e) {
                            throw new JsonParseException(e);
                        }
                }
            } catch (IllegalArgumentException e) {
                throw new JsonParseException(e);
            }
        }
    }

    public static void setDateFormat(DateFormat dateFormat) {
        dateTypeAdapter.setFormat(dateFormat);
    }

    public static void setSqlDateFormat(DateFormat dateFormat) {
        sqlDateTypeAdapter.setFormat(dateFormat);
    }
}
