// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.databoxedge.fluent.models;

import com.azure.core.annotation.Fluent;
import com.azure.resourcemanager.databoxedge.models.InstallRebootBehavior;
import com.azure.resourcemanager.databoxedge.models.UpdateOperation;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.OffsetDateTime;
import java.util.List;

/** The device update information summary. */
@Fluent
public final class UpdateSummaryProperties {
    /*
     * The current version of the device in format: 1.2.17312.13.",
     */
    @JsonProperty(value = "deviceVersionNumber")
    private String deviceVersionNumber;

    /*
     * The current version of the device in text format.
     */
    @JsonProperty(value = "friendlyDeviceVersionName")
    private String friendlyDeviceVersionName;

    /*
     * The last time when a scan was done on the device.
     */
    @JsonProperty(value = "deviceLastScannedDateTime")
    private OffsetDateTime deviceLastScannedDateTime;

    /*
     * The time when the last scan job was completed (success/cancelled/failed) on the appliance.
     */
    @JsonProperty(value = "lastCompletedScanJobDateTime")
    private OffsetDateTime lastCompletedScanJobDateTime;

    /*
     * The time when the last Download job was completed (success/cancelled/failed) on the appliance.
     */
    @JsonProperty(value = "lastCompletedDownloadJobDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastCompletedDownloadJobDateTime;

    /*
     * The time when the last Install job was completed (success/cancelled/failed) on the appliance.
     */
    @JsonProperty(value = "lastCompletedInstallJobDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime lastCompletedInstallJobDateTime;

    /*
     * The number of updates available for the current device version as per the last device scan.
     */
    @JsonProperty(value = "totalNumberOfUpdatesAvailable", access = JsonProperty.Access.WRITE_ONLY)
    private Integer totalNumberOfUpdatesAvailable;

    /*
     * The total number of items pending download.
     */
    @JsonProperty(value = "totalNumberOfUpdatesPendingDownload", access = JsonProperty.Access.WRITE_ONLY)
    private Integer totalNumberOfUpdatesPendingDownload;

    /*
     * The total number of items pending install.
     */
    @JsonProperty(value = "totalNumberOfUpdatesPendingInstall", access = JsonProperty.Access.WRITE_ONLY)
    private Integer totalNumberOfUpdatesPendingInstall;

    /*
     * Indicates if updates are available and at least one of the updates needs a reboot.
     */
    @JsonProperty(value = "rebootBehavior", access = JsonProperty.Access.WRITE_ONLY)
    private InstallRebootBehavior rebootBehavior;

    /*
     * The current update operation.
     */
    @JsonProperty(value = "ongoingUpdateOperation", access = JsonProperty.Access.WRITE_ONLY)
    private UpdateOperation ongoingUpdateOperation;

    /*
     * The job ID of the download job in progress.
     */
    @JsonProperty(value = "inProgressDownloadJobId", access = JsonProperty.Access.WRITE_ONLY)
    private String inProgressDownloadJobId;

    /*
     * The job ID of the install job in progress.
     */
    @JsonProperty(value = "inProgressInstallJobId", access = JsonProperty.Access.WRITE_ONLY)
    private String inProgressInstallJobId;

    /*
     * The time when the currently running download (if any) started.
     */
    @JsonProperty(value = "inProgressDownloadJobStartedDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime inProgressDownloadJobStartedDateTime;

    /*
     * The time when the currently running install (if any) started.
     */
    @JsonProperty(value = "inProgressInstallJobStartedDateTime", access = JsonProperty.Access.WRITE_ONLY)
    private OffsetDateTime inProgressInstallJobStartedDateTime;

    /*
     * The list of updates available for install.
     */
    @JsonProperty(value = "updateTitles", access = JsonProperty.Access.WRITE_ONLY)
    private List<String> updateTitles;

    /*
     * The total size of updates available for download in bytes.
     */
    @JsonProperty(value = "totalUpdateSizeInBytes", access = JsonProperty.Access.WRITE_ONLY)
    private Double totalUpdateSizeInBytes;

    /** Creates an instance of UpdateSummaryProperties class. */
    public UpdateSummaryProperties() {
    }

    /**
     * Get the deviceVersionNumber property: The current version of the device in format: 1.2.17312.13.",.
     *
     * @return the deviceVersionNumber value.
     */
    public String deviceVersionNumber() {
        return this.deviceVersionNumber;
    }

    /**
     * Set the deviceVersionNumber property: The current version of the device in format: 1.2.17312.13.",.
     *
     * @param deviceVersionNumber the deviceVersionNumber value to set.
     * @return the UpdateSummaryProperties object itself.
     */
    public UpdateSummaryProperties withDeviceVersionNumber(String deviceVersionNumber) {
        this.deviceVersionNumber = deviceVersionNumber;
        return this;
    }

    /**
     * Get the friendlyDeviceVersionName property: The current version of the device in text format.
     *
     * @return the friendlyDeviceVersionName value.
     */
    public String friendlyDeviceVersionName() {
        return this.friendlyDeviceVersionName;
    }

    /**
     * Set the friendlyDeviceVersionName property: The current version of the device in text format.
     *
     * @param friendlyDeviceVersionName the friendlyDeviceVersionName value to set.
     * @return the UpdateSummaryProperties object itself.
     */
    public UpdateSummaryProperties withFriendlyDeviceVersionName(String friendlyDeviceVersionName) {
        this.friendlyDeviceVersionName = friendlyDeviceVersionName;
        return this;
    }

    /**
     * Get the deviceLastScannedDateTime property: The last time when a scan was done on the device.
     *
     * @return the deviceLastScannedDateTime value.
     */
    public OffsetDateTime deviceLastScannedDateTime() {
        return this.deviceLastScannedDateTime;
    }

    /**
     * Set the deviceLastScannedDateTime property: The last time when a scan was done on the device.
     *
     * @param deviceLastScannedDateTime the deviceLastScannedDateTime value to set.
     * @return the UpdateSummaryProperties object itself.
     */
    public UpdateSummaryProperties withDeviceLastScannedDateTime(OffsetDateTime deviceLastScannedDateTime) {
        this.deviceLastScannedDateTime = deviceLastScannedDateTime;
        return this;
    }

    /**
     * Get the lastCompletedScanJobDateTime property: The time when the last scan job was completed
     * (success/cancelled/failed) on the appliance.
     *
     * @return the lastCompletedScanJobDateTime value.
     */
    public OffsetDateTime lastCompletedScanJobDateTime() {
        return this.lastCompletedScanJobDateTime;
    }

    /**
     * Set the lastCompletedScanJobDateTime property: The time when the last scan job was completed
     * (success/cancelled/failed) on the appliance.
     *
     * @param lastCompletedScanJobDateTime the lastCompletedScanJobDateTime value to set.
     * @return the UpdateSummaryProperties object itself.
     */
    public UpdateSummaryProperties withLastCompletedScanJobDateTime(OffsetDateTime lastCompletedScanJobDateTime) {
        this.lastCompletedScanJobDateTime = lastCompletedScanJobDateTime;
        return this;
    }

    /**
     * Get the lastCompletedDownloadJobDateTime property: The time when the last Download job was completed
     * (success/cancelled/failed) on the appliance.
     *
     * @return the lastCompletedDownloadJobDateTime value.
     */
    public OffsetDateTime lastCompletedDownloadJobDateTime() {
        return this.lastCompletedDownloadJobDateTime;
    }

    /**
     * Get the lastCompletedInstallJobDateTime property: The time when the last Install job was completed
     * (success/cancelled/failed) on the appliance.
     *
     * @return the lastCompletedInstallJobDateTime value.
     */
    public OffsetDateTime lastCompletedInstallJobDateTime() {
        return this.lastCompletedInstallJobDateTime;
    }

    /**
     * Get the totalNumberOfUpdatesAvailable property: The number of updates available for the current device version as
     * per the last device scan.
     *
     * @return the totalNumberOfUpdatesAvailable value.
     */
    public Integer totalNumberOfUpdatesAvailable() {
        return this.totalNumberOfUpdatesAvailable;
    }

    /**
     * Get the totalNumberOfUpdatesPendingDownload property: The total number of items pending download.
     *
     * @return the totalNumberOfUpdatesPendingDownload value.
     */
    public Integer totalNumberOfUpdatesPendingDownload() {
        return this.totalNumberOfUpdatesPendingDownload;
    }

    /**
     * Get the totalNumberOfUpdatesPendingInstall property: The total number of items pending install.
     *
     * @return the totalNumberOfUpdatesPendingInstall value.
     */
    public Integer totalNumberOfUpdatesPendingInstall() {
        return this.totalNumberOfUpdatesPendingInstall;
    }

    /**
     * Get the rebootBehavior property: Indicates if updates are available and at least one of the updates needs a
     * reboot.
     *
     * @return the rebootBehavior value.
     */
    public InstallRebootBehavior rebootBehavior() {
        return this.rebootBehavior;
    }

    /**
     * Get the ongoingUpdateOperation property: The current update operation.
     *
     * @return the ongoingUpdateOperation value.
     */
    public UpdateOperation ongoingUpdateOperation() {
        return this.ongoingUpdateOperation;
    }

    /**
     * Get the inProgressDownloadJobId property: The job ID of the download job in progress.
     *
     * @return the inProgressDownloadJobId value.
     */
    public String inProgressDownloadJobId() {
        return this.inProgressDownloadJobId;
    }

    /**
     * Get the inProgressInstallJobId property: The job ID of the install job in progress.
     *
     * @return the inProgressInstallJobId value.
     */
    public String inProgressInstallJobId() {
        return this.inProgressInstallJobId;
    }

    /**
     * Get the inProgressDownloadJobStartedDateTime property: The time when the currently running download (if any)
     * started.
     *
     * @return the inProgressDownloadJobStartedDateTime value.
     */
    public OffsetDateTime inProgressDownloadJobStartedDateTime() {
        return this.inProgressDownloadJobStartedDateTime;
    }

    /**
     * Get the inProgressInstallJobStartedDateTime property: The time when the currently running install (if any)
     * started.
     *
     * @return the inProgressInstallJobStartedDateTime value.
     */
    public OffsetDateTime inProgressInstallJobStartedDateTime() {
        return this.inProgressInstallJobStartedDateTime;
    }

    /**
     * Get the updateTitles property: The list of updates available for install.
     *
     * @return the updateTitles value.
     */
    public List<String> updateTitles() {
        return this.updateTitles;
    }

    /**
     * Get the totalUpdateSizeInBytes property: The total size of updates available for download in bytes.
     *
     * @return the totalUpdateSizeInBytes value.
     */
    public Double totalUpdateSizeInBytes() {
        return this.totalUpdateSizeInBytes;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
    }
}
