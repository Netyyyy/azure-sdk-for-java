// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.mediaservices.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.time.Duration;

/** Configures the Play Right in the PlayReady license. */
@Fluent
public final class ContentKeyPolicyPlayReadyPlayRight {
    /*
     * The amount of time that the license is valid after the license is first
     * used to play content.
     */
    @JsonProperty(value = "firstPlayExpiration")
    private Duration firstPlayExpiration;

    /*
     * Configures the Serial Copy Management System (SCMS) in the license. Must
     * be between 0 and 3 inclusive.
     */
    @JsonProperty(value = "scmsRestriction")
    private Integer scmsRestriction;

    /*
     * Configures Automatic Gain Control (AGC) and Color Stripe in the license.
     * Must be between 0 and 3 inclusive.
     */
    @JsonProperty(value = "agcAndColorStripeRestriction")
    private Integer agcAndColorStripeRestriction;

    /*
     * Configures the Explicit Analog Television Output Restriction in the
     * license. Configuration data must be between 0 and 3 inclusive.
     */
    @JsonProperty(value = "explicitAnalogTelevisionOutputRestriction")
    private ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestriction explicitAnalogTelevisionOutputRestriction;

    /*
     * Enables the Image Constraint For Analog Component Video Restriction in
     * the license.
     */
    @JsonProperty(value = "digitalVideoOnlyContentRestriction", required = true)
    private boolean digitalVideoOnlyContentRestriction;

    /*
     * Enables the Image Constraint For Analog Component Video Restriction in
     * the license.
     */
    @JsonProperty(value = "imageConstraintForAnalogComponentVideoRestriction", required = true)
    private boolean imageConstraintForAnalogComponentVideoRestriction;

    /*
     * Enables the Image Constraint For Analog Component Video Restriction in
     * the license.
     */
    @JsonProperty(value = "imageConstraintForAnalogComputerMonitorRestriction", required = true)
    private boolean imageConstraintForAnalogComputerMonitorRestriction;

    /*
     * Configures Unknown output handling settings of the license.
     */
    @JsonProperty(value = "allowPassingVideoContentToUnknownOutput", required = true)
    private ContentKeyPolicyPlayReadyUnknownOutputPassingOption allowPassingVideoContentToUnknownOutput;

    /*
     * Specifies the output protection level for uncompressed digital video.
     */
    @JsonProperty(value = "uncompressedDigitalVideoOpl")
    private Integer uncompressedDigitalVideoOpl;

    /*
     * Specifies the output protection level for compressed digital video.
     */
    @JsonProperty(value = "compressedDigitalVideoOpl")
    private Integer compressedDigitalVideoOpl;

    /*
     * Specifies the output protection level for compressed digital audio.
     */
    @JsonProperty(value = "analogVideoOpl")
    private Integer analogVideoOpl;

    /*
     * Specifies the output protection level for compressed digital audio.
     */
    @JsonProperty(value = "compressedDigitalAudioOpl")
    private Integer compressedDigitalAudioOpl;

    /*
     * Specifies the output protection level for uncompressed digital audio.
     */
    @JsonProperty(value = "uncompressedDigitalAudioOpl")
    private Integer uncompressedDigitalAudioOpl;

    /**
     * Get the firstPlayExpiration property: The amount of time that the license is valid after the license is first
     * used to play content.
     *
     * @return the firstPlayExpiration value.
     */
    public Duration firstPlayExpiration() {
        return this.firstPlayExpiration;
    }

    /**
     * Set the firstPlayExpiration property: The amount of time that the license is valid after the license is first
     * used to play content.
     *
     * @param firstPlayExpiration the firstPlayExpiration value to set.
     * @return the ContentKeyPolicyPlayReadyPlayRight object itself.
     */
    public ContentKeyPolicyPlayReadyPlayRight withFirstPlayExpiration(Duration firstPlayExpiration) {
        this.firstPlayExpiration = firstPlayExpiration;
        return this;
    }

    /**
     * Get the scmsRestriction property: Configures the Serial Copy Management System (SCMS) in the license. Must be
     * between 0 and 3 inclusive.
     *
     * @return the scmsRestriction value.
     */
    public Integer scmsRestriction() {
        return this.scmsRestriction;
    }

    /**
     * Set the scmsRestriction property: Configures the Serial Copy Management System (SCMS) in the license. Must be
     * between 0 and 3 inclusive.
     *
     * @param scmsRestriction the scmsRestriction value to set.
     * @return the ContentKeyPolicyPlayReadyPlayRight object itself.
     */
    public ContentKeyPolicyPlayReadyPlayRight withScmsRestriction(Integer scmsRestriction) {
        this.scmsRestriction = scmsRestriction;
        return this;
    }

    /**
     * Get the agcAndColorStripeRestriction property: Configures Automatic Gain Control (AGC) and Color Stripe in the
     * license. Must be between 0 and 3 inclusive.
     *
     * @return the agcAndColorStripeRestriction value.
     */
    public Integer agcAndColorStripeRestriction() {
        return this.agcAndColorStripeRestriction;
    }

    /**
     * Set the agcAndColorStripeRestriction property: Configures Automatic Gain Control (AGC) and Color Stripe in the
     * license. Must be between 0 and 3 inclusive.
     *
     * @param agcAndColorStripeRestriction the agcAndColorStripeRestriction value to set.
     * @return the ContentKeyPolicyPlayReadyPlayRight object itself.
     */
    public ContentKeyPolicyPlayReadyPlayRight withAgcAndColorStripeRestriction(Integer agcAndColorStripeRestriction) {
        this.agcAndColorStripeRestriction = agcAndColorStripeRestriction;
        return this;
    }

    /**
     * Get the explicitAnalogTelevisionOutputRestriction property: Configures the Explicit Analog Television Output
     * Restriction in the license. Configuration data must be between 0 and 3 inclusive.
     *
     * @return the explicitAnalogTelevisionOutputRestriction value.
     */
    public ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestriction explicitAnalogTelevisionOutputRestriction() {
        return this.explicitAnalogTelevisionOutputRestriction;
    }

    /**
     * Set the explicitAnalogTelevisionOutputRestriction property: Configures the Explicit Analog Television Output
     * Restriction in the license. Configuration data must be between 0 and 3 inclusive.
     *
     * @param explicitAnalogTelevisionOutputRestriction the explicitAnalogTelevisionOutputRestriction value to set.
     * @return the ContentKeyPolicyPlayReadyPlayRight object itself.
     */
    public ContentKeyPolicyPlayReadyPlayRight withExplicitAnalogTelevisionOutputRestriction(
        ContentKeyPolicyPlayReadyExplicitAnalogTelevisionRestriction explicitAnalogTelevisionOutputRestriction) {
        this.explicitAnalogTelevisionOutputRestriction = explicitAnalogTelevisionOutputRestriction;
        return this;
    }

    /**
     * Get the digitalVideoOnlyContentRestriction property: Enables the Image Constraint For Analog Component Video
     * Restriction in the license.
     *
     * @return the digitalVideoOnlyContentRestriction value.
     */
    public boolean digitalVideoOnlyContentRestriction() {
        return this.digitalVideoOnlyContentRestriction;
    }

    /**
     * Set the digitalVideoOnlyContentRestriction property: Enables the Image Constraint For Analog Component Video
     * Restriction in the license.
     *
     * @param digitalVideoOnlyContentRestriction the digitalVideoOnlyContentRestriction value to set.
     * @return the ContentKeyPolicyPlayReadyPlayRight object itself.
     */
    public ContentKeyPolicyPlayReadyPlayRight withDigitalVideoOnlyContentRestriction(
        boolean digitalVideoOnlyContentRestriction) {
        this.digitalVideoOnlyContentRestriction = digitalVideoOnlyContentRestriction;
        return this;
    }

    /**
     * Get the imageConstraintForAnalogComponentVideoRestriction property: Enables the Image Constraint For Analog
     * Component Video Restriction in the license.
     *
     * @return the imageConstraintForAnalogComponentVideoRestriction value.
     */
    public boolean imageConstraintForAnalogComponentVideoRestriction() {
        return this.imageConstraintForAnalogComponentVideoRestriction;
    }

    /**
     * Set the imageConstraintForAnalogComponentVideoRestriction property: Enables the Image Constraint For Analog
     * Component Video Restriction in the license.
     *
     * @param imageConstraintForAnalogComponentVideoRestriction the imageConstraintForAnalogComponentVideoRestriction
     *     value to set.
     * @return the ContentKeyPolicyPlayReadyPlayRight object itself.
     */
    public ContentKeyPolicyPlayReadyPlayRight withImageConstraintForAnalogComponentVideoRestriction(
        boolean imageConstraintForAnalogComponentVideoRestriction) {
        this.imageConstraintForAnalogComponentVideoRestriction = imageConstraintForAnalogComponentVideoRestriction;
        return this;
    }

    /**
     * Get the imageConstraintForAnalogComputerMonitorRestriction property: Enables the Image Constraint For Analog
     * Component Video Restriction in the license.
     *
     * @return the imageConstraintForAnalogComputerMonitorRestriction value.
     */
    public boolean imageConstraintForAnalogComputerMonitorRestriction() {
        return this.imageConstraintForAnalogComputerMonitorRestriction;
    }

    /**
     * Set the imageConstraintForAnalogComputerMonitorRestriction property: Enables the Image Constraint For Analog
     * Component Video Restriction in the license.
     *
     * @param imageConstraintForAnalogComputerMonitorRestriction the imageConstraintForAnalogComputerMonitorRestriction
     *     value to set.
     * @return the ContentKeyPolicyPlayReadyPlayRight object itself.
     */
    public ContentKeyPolicyPlayReadyPlayRight withImageConstraintForAnalogComputerMonitorRestriction(
        boolean imageConstraintForAnalogComputerMonitorRestriction) {
        this.imageConstraintForAnalogComputerMonitorRestriction = imageConstraintForAnalogComputerMonitorRestriction;
        return this;
    }

    /**
     * Get the allowPassingVideoContentToUnknownOutput property: Configures Unknown output handling settings of the
     * license.
     *
     * @return the allowPassingVideoContentToUnknownOutput value.
     */
    public ContentKeyPolicyPlayReadyUnknownOutputPassingOption allowPassingVideoContentToUnknownOutput() {
        return this.allowPassingVideoContentToUnknownOutput;
    }

    /**
     * Set the allowPassingVideoContentToUnknownOutput property: Configures Unknown output handling settings of the
     * license.
     *
     * @param allowPassingVideoContentToUnknownOutput the allowPassingVideoContentToUnknownOutput value to set.
     * @return the ContentKeyPolicyPlayReadyPlayRight object itself.
     */
    public ContentKeyPolicyPlayReadyPlayRight withAllowPassingVideoContentToUnknownOutput(
        ContentKeyPolicyPlayReadyUnknownOutputPassingOption allowPassingVideoContentToUnknownOutput) {
        this.allowPassingVideoContentToUnknownOutput = allowPassingVideoContentToUnknownOutput;
        return this;
    }

    /**
     * Get the uncompressedDigitalVideoOpl property: Specifies the output protection level for uncompressed digital
     * video.
     *
     * @return the uncompressedDigitalVideoOpl value.
     */
    public Integer uncompressedDigitalVideoOpl() {
        return this.uncompressedDigitalVideoOpl;
    }

    /**
     * Set the uncompressedDigitalVideoOpl property: Specifies the output protection level for uncompressed digital
     * video.
     *
     * @param uncompressedDigitalVideoOpl the uncompressedDigitalVideoOpl value to set.
     * @return the ContentKeyPolicyPlayReadyPlayRight object itself.
     */
    public ContentKeyPolicyPlayReadyPlayRight withUncompressedDigitalVideoOpl(Integer uncompressedDigitalVideoOpl) {
        this.uncompressedDigitalVideoOpl = uncompressedDigitalVideoOpl;
        return this;
    }

    /**
     * Get the compressedDigitalVideoOpl property: Specifies the output protection level for compressed digital video.
     *
     * @return the compressedDigitalVideoOpl value.
     */
    public Integer compressedDigitalVideoOpl() {
        return this.compressedDigitalVideoOpl;
    }

    /**
     * Set the compressedDigitalVideoOpl property: Specifies the output protection level for compressed digital video.
     *
     * @param compressedDigitalVideoOpl the compressedDigitalVideoOpl value to set.
     * @return the ContentKeyPolicyPlayReadyPlayRight object itself.
     */
    public ContentKeyPolicyPlayReadyPlayRight withCompressedDigitalVideoOpl(Integer compressedDigitalVideoOpl) {
        this.compressedDigitalVideoOpl = compressedDigitalVideoOpl;
        return this;
    }

    /**
     * Get the analogVideoOpl property: Specifies the output protection level for compressed digital audio.
     *
     * @return the analogVideoOpl value.
     */
    public Integer analogVideoOpl() {
        return this.analogVideoOpl;
    }

    /**
     * Set the analogVideoOpl property: Specifies the output protection level for compressed digital audio.
     *
     * @param analogVideoOpl the analogVideoOpl value to set.
     * @return the ContentKeyPolicyPlayReadyPlayRight object itself.
     */
    public ContentKeyPolicyPlayReadyPlayRight withAnalogVideoOpl(Integer analogVideoOpl) {
        this.analogVideoOpl = analogVideoOpl;
        return this;
    }

    /**
     * Get the compressedDigitalAudioOpl property: Specifies the output protection level for compressed digital audio.
     *
     * @return the compressedDigitalAudioOpl value.
     */
    public Integer compressedDigitalAudioOpl() {
        return this.compressedDigitalAudioOpl;
    }

    /**
     * Set the compressedDigitalAudioOpl property: Specifies the output protection level for compressed digital audio.
     *
     * @param compressedDigitalAudioOpl the compressedDigitalAudioOpl value to set.
     * @return the ContentKeyPolicyPlayReadyPlayRight object itself.
     */
    public ContentKeyPolicyPlayReadyPlayRight withCompressedDigitalAudioOpl(Integer compressedDigitalAudioOpl) {
        this.compressedDigitalAudioOpl = compressedDigitalAudioOpl;
        return this;
    }

    /**
     * Get the uncompressedDigitalAudioOpl property: Specifies the output protection level for uncompressed digital
     * audio.
     *
     * @return the uncompressedDigitalAudioOpl value.
     */
    public Integer uncompressedDigitalAudioOpl() {
        return this.uncompressedDigitalAudioOpl;
    }

    /**
     * Set the uncompressedDigitalAudioOpl property: Specifies the output protection level for uncompressed digital
     * audio.
     *
     * @param uncompressedDigitalAudioOpl the uncompressedDigitalAudioOpl value to set.
     * @return the ContentKeyPolicyPlayReadyPlayRight object itself.
     */
    public ContentKeyPolicyPlayReadyPlayRight withUncompressedDigitalAudioOpl(Integer uncompressedDigitalAudioOpl) {
        this.uncompressedDigitalAudioOpl = uncompressedDigitalAudioOpl;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (explicitAnalogTelevisionOutputRestriction() != null) {
            explicitAnalogTelevisionOutputRestriction().validate();
        }
        if (allowPassingVideoContentToUnknownOutput() == null) {
            throw LOGGER
                .logExceptionAsError(
                    new IllegalArgumentException(
                        "Missing required property allowPassingVideoContentToUnknownOutput in model"
                            + " ContentKeyPolicyPlayReadyPlayRight"));
        }
    }

    private static final ClientLogger LOGGER = new ClientLogger(ContentKeyPolicyPlayReadyPlayRight.class);
}
