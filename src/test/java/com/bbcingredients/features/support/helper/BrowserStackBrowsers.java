package com.bbcingredients.features.support.helper;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by Yarboi on 21/11/2016.
 */
public class BrowserStackBrowsers {

    @SerializedName("browser")
    @Expose
    private String browser;
    @SerializedName("browser_version")
    @Expose
    private String browser_version;
    @SerializedName("os")
    @Expose
    private String os;
    @SerializedName("os_version")
    @Expose
    private String os_version;
    @SerializedName("resolution")
    @Expose
    private String resolution;

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public String getBrowser_version() {
        return browser_version;
    }

    public void setBrowser_version(String browser_version) {
        this.browser_version = browser_version;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOs_version() {
        return os_version;
    }

    public void setOs_version(String os_version) {
        this.os_version = os_version;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }
}
