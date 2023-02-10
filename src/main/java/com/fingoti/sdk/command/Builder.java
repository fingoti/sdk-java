package com.fingoti.sdk.command;

import com.fingoti.sdk.ApiClient;
import com.fingoti.sdk.ApiException;
import com.fingoti.sdk.JSON;
import com.fingoti.sdk.api.DeviceApi;

import com.fingoti.sdk.command.device.DeviceActivityCommand;
import com.fingoti.sdk.command.device.DeviceActivityPayload;
import com.fingoti.sdk.command.device.DeviceBlinkCommand;
import com.fingoti.sdk.command.device.DeviceBlinkPayload;
import com.fingoti.sdk.command.device.DeviceBusCommand;
import com.fingoti.sdk.command.device.DeviceBusPayload;
import com.fingoti.sdk.command.device.DeviceColourCommand;
import com.fingoti.sdk.command.device.DeviceColourPayload;
import com.fingoti.sdk.command.device.DeviceInformationCommand;
import com.fingoti.sdk.command.device.DevicePokeCommand;
import com.fingoti.sdk.command.device.DevicePowerCommand;
import com.fingoti.sdk.command.device.DeviceSleepCommand;
import com.fingoti.sdk.command.device.DeviceSleepPayload;
import com.fingoti.sdk.command.device.DeviceTimeCommand;
import com.fingoti.sdk.command.device.DeviceUptimeCommand;
import com.fingoti.sdk.command.device.DeviceVersionCommand;
import com.fingoti.sdk.command.device.DeviceBlinkPayload.BlinkSpeed;
import com.fingoti.sdk.command.device.DeviceBusPayload.BusMode;

import com.fingoti.sdk.command.gpio.GPIOAllDirectionPayload;
import com.fingoti.sdk.command.gpio.GPIOAllStatePayload;
import com.fingoti.sdk.command.gpio.GPIODirection;
import com.fingoti.sdk.command.gpio.GPIODirectionCommand;
import com.fingoti.sdk.command.gpio.GPIODirectionPayload;
import com.fingoti.sdk.command.gpio.GPIOPulseCommand;
import com.fingoti.sdk.command.gpio.GPIOPulsePayload;
import com.fingoti.sdk.command.gpio.GPIOSavePayload;
import com.fingoti.sdk.command.gpio.GPIOState;
import com.fingoti.sdk.command.gpio.GPIOStateCommand;
import com.fingoti.sdk.command.gpio.GPIOStatePayload;
import com.fingoti.sdk.command.gpio.GPIOToggleCommand;
import com.fingoti.sdk.command.gpio.GPIOTogglePayload;

import com.fingoti.sdk.command.i2c.I2CDataCommand;
import com.fingoti.sdk.command.i2c.I2CDataPayload;
import com.fingoti.sdk.command.i2c.I2CDetectCommand;
import com.fingoti.sdk.command.i2c.I2CSetupCommand;
import com.fingoti.sdk.command.i2c.I2CSetupPayload;

import com.fingoti.sdk.command.mqtt.MQTTCertificateCommand;
import com.fingoti.sdk.command.mqtt.MQTTCertiticatePayload;
import com.fingoti.sdk.command.mqtt.MQTTSessionCommand;
import com.fingoti.sdk.command.mqtt.MQTTSessionPayload;
import com.fingoti.sdk.command.mqtt.MQTTSetupCommand;
import com.fingoti.sdk.command.mqtt.MQTTSetupPayload;
import com.fingoti.sdk.command.mqtt.MQTTStatusCommand;
import com.fingoti.sdk.command.mqtt.MQTTStatusPayload;

import com.fingoti.sdk.command.network.NetworkIPCommand;
import com.fingoti.sdk.command.network.NetworkIPPayload;
import com.fingoti.sdk.command.network.NetworkInternetCommand;
import com.fingoti.sdk.command.network.NetworkMACCommand;
import com.fingoti.sdk.command.network.NetworkTrafficCommand;

import com.fingoti.sdk.command.schedule.ScheduleCronCommand;
import com.fingoti.sdk.command.schedule.ScheduleCronPayload;
import com.fingoti.sdk.command.schedule.ScheduleRequestCommand;
import com.fingoti.sdk.command.schedule.ScheduleRequestPayload;
import com.fingoti.sdk.command.schedule.ScheduleSetupCommand;
import com.fingoti.sdk.command.schedule.ScheduleSetupPayload;
import com.fingoti.sdk.command.schedule.ScheduleStatusCommand;
import com.fingoti.sdk.command.schedule.ScheduleStatusPayload;
import com.fingoti.sdk.command.timer.TimerIntervalCommand;
import com.fingoti.sdk.command.timer.TimerIntervalPayload;
import com.fingoti.sdk.command.timer.TimerRequestCommand;
import com.fingoti.sdk.command.timer.TimerRequestPayload;
import com.fingoti.sdk.command.timer.TimerStatusCommand;
import com.fingoti.sdk.command.timer.TimerStatusPayload;
import com.fingoti.sdk.command.uart.UARTDataCommand;
import com.fingoti.sdk.command.uart.UARTDataPayload;
import com.fingoti.sdk.command.uart.UARTModeCommand;
import com.fingoti.sdk.command.uart.UARTModePayload;
import com.fingoti.sdk.command.uart.UARTSessionCommand;
import com.fingoti.sdk.command.uart.UARTSessionPayload;
import com.fingoti.sdk.command.uart.UARTSetupCommand;
import com.fingoti.sdk.command.uart.UARTSetupPayload;
import com.fingoti.sdk.command.uart.UARTTriggerCommand;
import com.fingoti.sdk.command.uart.UARTTriggerPayload;
import com.fingoti.sdk.command.uart.UARTModePayload.UARTMode;
import com.fingoti.sdk.command.uart.UARTSetupPayload.UARTParity;
import com.fingoti.sdk.command.uart.UARTSetupPayload.UARTStopbits;
import com.fingoti.sdk.command.wifi.WifiCredentialsCommand;
import com.fingoti.sdk.command.wifi.WifiCredentialsPayload;
import com.fingoti.sdk.command.wifi.WifiDetectCommand;
import com.fingoti.sdk.command.wifi.WifiStatusCommand;
import com.fingoti.sdk.command.wifi.WifiStatusPayload;
import com.fingoti.sdk.command.wifi.WifiCredentialsPayload.WifiSlot;
import com.fingoti.sdk.models.Command;
import com.fingoti.sdk.models.DeviceRequest;
import com.fingoti.sdk.models.MqttDeviceResponse;
import com.fingoti.sdk.models.WifiDetect;

public class Builder {
    private ApiClient _client;
    private DeviceRequest _request;

    public Builder(ApiClient client, String serialNo, Boolean response) {
        _client = client;
        DeviceRequest req = new DeviceRequest();
        req.serial(serialNo);
        req.response(response);
        _request = req;
    }

    /**
     * Print the current state of the request array to console
     *
     */
    public void log() {
        System.out.println(_request.toJson());
    }

    /**
     * Convert this instance of the builder to JSON, useful if you intent to send
     * the commands via communication methods other than the Fingoti API
     *
     * @return JSON string
     */
    public String toJson() {
        return JSON.getGson().toJson(this);
    }

    /**
     * Send the request to the device via the Fingoti API
     *
     * @return MqttDeviceResponse - containing the result of the request
     */
    public MqttDeviceResponse send() throws ApiException {
        log(); // Here just for debug
        DeviceApi _api = new DeviceApi(_client);
        MqttDeviceResponse result = _api.postDeviceSendrequest(_request);

        return result;
    }

    // #region - Device

    // deviceActivity
    public void addDeviceActivity() {
        _request.addRequestItem(new DeviceActivityCommand());
    }

    public void addDeviceActivity(Boolean enabled) {
        _request.addRequestItem(new DeviceActivityCommand(new DeviceActivityPayload(enabled)));
    }

    // deviceBlink
    public void addDeviceBlink() {
        _request.addRequestItem(new DeviceBlinkCommand());
    }

    public void addDeviceBlink(BlinkSpeed speed) {
        _request.addRequestItem(new DeviceBlinkCommand(new DeviceBlinkPayload(speed)));
    }

    // deviceBus
    public void addDeviceBus() {
        _request.addRequestItem(new DeviceBusCommand());
    }

    public void addDeviceBus(BusMode protocol) {
        _request.addRequestItem(new DeviceBusCommand(new DeviceBusPayload(protocol)));
    }

    // deviceColour
    public void addDeviceColour() {
        _request.addRequestItem(new DeviceColourCommand());
    }

    public void addDeviceColour(int r, int g, int b) {
        _request.addRequestItem(new DeviceColourCommand(new DeviceColourPayload(r, g, b)));
    }

    // deviceInformation
    public void addDeviceInformation() {
        _request.addRequestItem(new DeviceInformationCommand());
    }

    // devicePoke
    public void addDevicePoke() {
        _request.addRequestItem(new DevicePokeCommand());
    }

    // devicePower
    public void addDevicePower() {
        _request.addRequestItem(new DevicePowerCommand());
    }

    // deviceSleep
    public void addDeviceSleep() {
        _request.addRequestItem(new DeviceSleepCommand());
    }

    public void addDeviceSleep(Integer duration) {
        _request.addRequestItem(new DeviceSleepCommand(new DeviceSleepPayload(duration)));
    }

    // deviceTime
    public void addDeviceTime() {
        _request.addRequestItem(new DeviceTimeCommand());
    }

    // deviceUptime
    public void addDeviceUptime() {
        _request.addRequestItem(new DeviceUptimeCommand());
    }

    // deviceVersion
    public void addDeviceVersion() {
        _request.addRequestItem(new DeviceVersionCommand());
    }

    // #endregion

    // #region - GPIO

    // gpioDirection
    public void addGPIODirection() {
        _request.addRequestItem(new GPIODirectionCommand());
    }

    public void addGPIODirection(GPIODirection[] direction, Boolean save) {
        _request.addRequestItem(new GPIODirectionCommand(new GPIOAllDirectionPayload(direction, save)));
    }

    public void addGPIODirection(int gpio, GPIODirection direction, Boolean save) {
        _request.addRequestItem(new GPIODirectionCommand(new GPIODirectionPayload(gpio, direction, save)));
    }

    public void addGPIODirection(Boolean save) {
        _request.addRequestItem(new GPIODirectionCommand(new GPIOSavePayload(save)));
    }

    // gpioState
    public void addGPIOState() {
        _request.addRequestItem(new GPIOStateCommand());
    }

    public void addGPIOState(GPIOState[] state, Boolean save) {
        _request.addRequestItem(new GPIOStateCommand(new GPIOAllStatePayload(state, save)));
    }

    public void addGPIOState(int gpio, GPIOState state, Boolean save) {
        _request.addRequestItem(new GPIOStateCommand(new GPIOStatePayload(gpio, state, save)));
    }

    // gpioPulse
    public void addGPIOPulse(int gpio, int duration) {
        _request.addRequestItem(new GPIOPulseCommand(new GPIOPulsePayload(gpio, duration)));
    }

    // gpioToggle
    public void addGPIOToggle(int gpio) {
        _request.addRequestItem(new GPIOToggleCommand(new GPIOTogglePayload(gpio)));
    }

    // #endregion

    // #region - I2C

    // i2cData
    public void addI2CData(int address, String[] profile) {
        _request.addRequestItem(new I2CDataCommand(new I2CDataPayload(address, profile)));
    }

    // i2cDetect
    public void addI2CDetect() {
        _request.addRequestItem(new I2CDetectCommand());
    }

    // i2cSetup
    public void addI2CSetup() {
        _request.addRequestItem(new I2CSetupCommand());
    }

    public void addI2CSetup(int speed, Boolean scan) {
        _request.addRequestItem(new I2CSetupCommand(new I2CSetupPayload(speed, scan)));
    }

    // #endregion

    // #region - MQTT

    // mqttCertificate
    public void addMQTTCertifcate() {
        _request.addRequestItem(new MQTTCertificateCommand());
    }

    public void addMQTTCertifcate(String pem, Boolean clear) {
        _request.addRequestItem(new MQTTCertificateCommand(new MQTTCertiticatePayload(pem, clear)));
    }

    // mqttSession
    public void addMQTTSession() {
        _request.addRequestItem(new MQTTSessionCommand());
    }

    public void addMQTTSession(int duration) {
        _request.addRequestItem(new MQTTSessionCommand(new MQTTSessionPayload(duration)));
    }

    // mqttSetup
    public void addMQTTSetup() {
        _request.addRequestItem(new MQTTSetupCommand());
    }

    public void addMQTTSetup(String host, int port, int qos, Boolean secure, Boolean retain) {
        _request.addRequestItem(new MQTTSetupCommand(new MQTTSetupPayload(host, port, qos, secure, retain)));
    }

    // mqttStatus
    public void addMQTTStatus() {
        _request.addRequestItem(new MQTTStatusCommand());
    }

    public void addMQTTStatus(Boolean enabled) {
        _request.addRequestItem(new MQTTStatusCommand(new MQTTStatusPayload(enabled)));
    }

    // #endregion

    // #region - Network

    // networkInternet
    public void addNetworkInternet() {
        _request.addRequestItem(new NetworkInternetCommand());
    }

    // networkIP
    public void addNetworkIP() {
        _request.addRequestItem(new NetworkIPCommand());
    }

    public void addNetworkIP(Boolean dhcp, String local, String mask, String gateway, String dns) {
        _request.addRequestItem(new NetworkIPCommand(new NetworkIPPayload(dhcp, local, mask, gateway, dns)));
    }

    // networkMac
    public void addNetworkMac() {
        _request.addRequestItem(new NetworkMACCommand());
    }

    // networkTraffic
    public void addNetworkTraffic() {
        _request.addRequestItem(new NetworkTrafficCommand());
    }

    // #endregion

    // #region - Schedule

    // scheduleCron
    public void addScheduleCron(int slot) {
        _request.addRequestItem(new ScheduleCronCommand(slot));
    }

    public void addScheduleCron(int slot, String cron) {
        _request.addRequestItem(new ScheduleCronCommand(new ScheduleCronPayload(slot, cron)));
    }

    // scheduleRequest
    public void addScheduleRequest(int slot) {
        _request.addRequestItem(new ScheduleRequestCommand(slot));
    }

    public void addScheduleRequest(int slot, Command[] request) {
        _request.addRequestItem(new ScheduleRequestCommand(new ScheduleRequestPayload(slot, request)));
    }

    // scheduleSetup
    public void addScheduleSetup(int slot) {
        _request.addRequestItem(new ScheduleSetupCommand(slot));
    }

    public void addScheduleSetup(int slot, Boolean clear) {
        _request.addRequestItem(new ScheduleSetupCommand(new ScheduleSetupPayload(slot, clear)));
    }

    // scheduleStatus
    public void addScheduleStatus(int slot) {
        _request.addRequestItem(new ScheduleStatusCommand(slot));
    }

    public void addScheduleStatus(int slot, Boolean enabled) {
        _request.addRequestItem(new ScheduleStatusCommand(new ScheduleStatusPayload(slot, enabled)));
    }

    // #endregion

    // #region - Timer

    // timerInterval
    public void addTimerInterval() {
        _request.addRequestItem(new TimerIntervalCommand());
    }

    public void addTimerInterval(Integer interval) {
        _request.addRequestItem(new TimerIntervalCommand(new TimerIntervalPayload(interval)));
    }

    // timerRequest
    public void addTimerRequest() {
        _request.addRequestItem(new TimerRequestCommand());
    }

    public void addTimerRequest(Command[] request) {
        _request.addRequestItem(new TimerRequestCommand(new TimerRequestPayload(request)));
    }

    // timerStatus
    public void addTimerStatus() {
        _request.addRequestItem(new TimerStatusCommand());
    }

    public void addTimerStatus(Boolean enabled, Boolean repeat) {
        _request.addRequestItem(new TimerStatusCommand(new TimerStatusPayload(enabled, repeat)));
    }

    // #endregion

    // #region - UART

    // uartData
    public void addUARTData(Integer[] data) {
        _request.addRequestItem(new UARTDataCommand(new UARTDataPayload(data)));
    }

    // uartMode
    public void addUARTMode() {
        _request.addRequestItem(new UARTModeCommand());
    }

    public void addUARTMode(UARTMode mode) {
        _request.addRequestItem(new UARTModeCommand(new UARTModePayload(mode)));
    }

    // uartSession
    public void addUARTSession() {
        _request.addRequestItem(new UARTSessionCommand());
    }

    public void addUARTSession(Integer duration) {
        _request.addRequestItem(new UARTSessionCommand(new UARTSessionPayload(duration)));
    }

    // uartSetup
    public void addUARTSetup() {
        _request.addRequestItem(new UARTSetupCommand());
    }

    public void addUARTSetup(UARTParity parity, UARTStopbits stopbits, Integer baudrate, Integer databits) {
        _request.addRequestItem(new UARTSetupCommand(new UARTSetupPayload(parity, stopbits, baudrate, databits)));
    }

    // uartSession
    public void addUARTTrigger() {
        _request.addRequestItem(new UARTTriggerCommand());
    }

    public void addUARTTrigger(Integer length) {
        _request.addRequestItem(new UARTTriggerCommand(new UARTTriggerPayload(length)));
    }

    public void addUARTTrigger(Integer[] terminator) {
        _request.addRequestItem(new UARTTriggerCommand(new UARTTriggerPayload(terminator)));
    }

    // #endregion

    // #region - Wifi

    // wifiCredentials
    public void addWifiCredentials() {
        _request.addRequestItem(new WifiCredentialsCommand());
    }

    public void addWifiCredentials(WifiSlot slot, String ssid, String passowrd) {
        _request.addRequestItem(new WifiCredentialsCommand(new WifiCredentialsPayload(slot, ssid, passowrd)));
    }

    // wifiDetect
    public void addWiifiDetect() {
        _request.addRequestItem(new WifiDetectCommand());
    }

    // wifiStatus
    public void addWifiStatus() {
        _request.addRequestItem(new WifiStatusCommand());
    }

    public void addWifiStatus(Boolean restart) {
        _request.addRequestItem(new WifiStatusCommand(new WifiStatusPayload(restart)));
    }

    // #endregion
}
