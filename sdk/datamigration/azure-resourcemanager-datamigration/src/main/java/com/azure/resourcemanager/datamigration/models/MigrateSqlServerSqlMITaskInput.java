// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.datamigration.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/** Input for task that migrates SQL Server databases to Azure SQL Database Managed Instance. */
@Fluent
public final class MigrateSqlServerSqlMITaskInput extends SqlMigrationTaskInput {
    /*
     * Databases to migrate
     */
    @JsonProperty(value = "selectedDatabases", required = true)
    private List<MigrateSqlServerSqlMIDatabaseInput> selectedDatabases;

    /*
     * Logins to migrate.
     */
    @JsonProperty(value = "selectedLogins")
    private List<String> selectedLogins;

    /*
     * Agent Jobs to migrate.
     */
    @JsonProperty(value = "selectedAgentJobs")
    private List<String> selectedAgentJobs;

    /*
     * Backup file share information for all selected databases.
     */
    @JsonProperty(value = "backupFileShare")
    private FileShare backupFileShare;

    /*
     * SAS URI of Azure Storage Account Container to be used for storing backup files.
     */
    @JsonProperty(value = "backupBlobShare", required = true)
    private BlobShare backupBlobShare;

    /*
     * Backup Mode to specify whether to use existing backup or create new backup. If using existing backups, backup
     * file paths are required to be provided in selectedDatabases.
     */
    @JsonProperty(value = "backupMode")
    private BackupMode backupMode;

    /** Creates an instance of MigrateSqlServerSqlMITaskInput class. */
    public MigrateSqlServerSqlMITaskInput() {
    }

    /**
     * Get the selectedDatabases property: Databases to migrate.
     *
     * @return the selectedDatabases value.
     */
    public List<MigrateSqlServerSqlMIDatabaseInput> selectedDatabases() {
        return this.selectedDatabases;
    }

    /**
     * Set the selectedDatabases property: Databases to migrate.
     *
     * @param selectedDatabases the selectedDatabases value to set.
     * @return the MigrateSqlServerSqlMITaskInput object itself.
     */
    public MigrateSqlServerSqlMITaskInput withSelectedDatabases(
        List<MigrateSqlServerSqlMIDatabaseInput> selectedDatabases) {
        this.selectedDatabases = selectedDatabases;
        return this;
    }

    /**
     * Get the selectedLogins property: Logins to migrate.
     *
     * @return the selectedLogins value.
     */
    public List<String> selectedLogins() {
        return this.selectedLogins;
    }

    /**
     * Set the selectedLogins property: Logins to migrate.
     *
     * @param selectedLogins the selectedLogins value to set.
     * @return the MigrateSqlServerSqlMITaskInput object itself.
     */
    public MigrateSqlServerSqlMITaskInput withSelectedLogins(List<String> selectedLogins) {
        this.selectedLogins = selectedLogins;
        return this;
    }

    /**
     * Get the selectedAgentJobs property: Agent Jobs to migrate.
     *
     * @return the selectedAgentJobs value.
     */
    public List<String> selectedAgentJobs() {
        return this.selectedAgentJobs;
    }

    /**
     * Set the selectedAgentJobs property: Agent Jobs to migrate.
     *
     * @param selectedAgentJobs the selectedAgentJobs value to set.
     * @return the MigrateSqlServerSqlMITaskInput object itself.
     */
    public MigrateSqlServerSqlMITaskInput withSelectedAgentJobs(List<String> selectedAgentJobs) {
        this.selectedAgentJobs = selectedAgentJobs;
        return this;
    }

    /**
     * Get the backupFileShare property: Backup file share information for all selected databases.
     *
     * @return the backupFileShare value.
     */
    public FileShare backupFileShare() {
        return this.backupFileShare;
    }

    /**
     * Set the backupFileShare property: Backup file share information for all selected databases.
     *
     * @param backupFileShare the backupFileShare value to set.
     * @return the MigrateSqlServerSqlMITaskInput object itself.
     */
    public MigrateSqlServerSqlMITaskInput withBackupFileShare(FileShare backupFileShare) {
        this.backupFileShare = backupFileShare;
        return this;
    }

    /**
     * Get the backupBlobShare property: SAS URI of Azure Storage Account Container to be used for storing backup files.
     *
     * @return the backupBlobShare value.
     */
    public BlobShare backupBlobShare() {
        return this.backupBlobShare;
    }

    /**
     * Set the backupBlobShare property: SAS URI of Azure Storage Account Container to be used for storing backup files.
     *
     * @param backupBlobShare the backupBlobShare value to set.
     * @return the MigrateSqlServerSqlMITaskInput object itself.
     */
    public MigrateSqlServerSqlMITaskInput withBackupBlobShare(BlobShare backupBlobShare) {
        this.backupBlobShare = backupBlobShare;
        return this;
    }

    /**
     * Get the backupMode property: Backup Mode to specify whether to use existing backup or create new backup. If using
     * existing backups, backup file paths are required to be provided in selectedDatabases.
     *
     * @return the backupMode value.
     */
    public BackupMode backupMode() {
        return this.backupMode;
    }

    /**
     * Set the backupMode property: Backup Mode to specify whether to use existing backup or create new backup. If using
     * existing backups, backup file paths are required to be provided in selectedDatabases.
     *
     * @param backupMode the backupMode value to set.
     * @return the MigrateSqlServerSqlMITaskInput object itself.
     */
    public MigrateSqlServerSqlMITaskInput withBackupMode(BackupMode backupMode) {
        this.backupMode = backupMode;
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MigrateSqlServerSqlMITaskInput withSourceConnectionInfo(SqlConnectionInfo sourceConnectionInfo) {
        super.withSourceConnectionInfo(sourceConnectionInfo);
        return this;
    }

    /** {@inheritDoc} */
    @Override
    public MigrateSqlServerSqlMITaskInput withTargetConnectionInfo(SqlConnectionInfo targetConnectionInfo) {
        super.withTargetConnectionInfo(targetConnectionInfo);
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    @Override
    public void validate() {
        super.validate();
        if (selectedDatabases() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property selectedDatabases in model MigrateSqlServerSqlMITaskInput"));
        } else {
            selectedDatabases().forEach(e -> e.validate());
        }
        if (backupFileShare() != null) {
            backupFileShare().validate();
        }
        if (backupBlobShare() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property backupBlobShare in model MigrateSqlServerSqlMITaskInput"));
        } else {
            backupBlobShare().validate();
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(MigrateSqlServerSqlMITaskInput.class);
}
