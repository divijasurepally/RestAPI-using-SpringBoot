package com.restapi.restdemo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restapi.restdemo.model.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudVendorAPIService {

  CloudVendor cloudVendor;

  @GetMapping("{vendorId}")
  public CloudVendor getCloudVendorDetails(String vendorId) {
    return cloudVendor;
  }

  @PostMapping
  public String createCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
    this.cloudVendor = cloudVendor;
    return "Cloud Vendor created successfully";
  }

  @PutMapping
  public String updateCloudVendorDetails(@RequestBody CloudVendor cloudVendor) {
    this.cloudVendor = cloudVendor;
    return "Cloud Vendor updated successfully";
  }

  @DeleteMapping("{vendorID}")
  public String deleteCloudVendorDetails(String vendorID) {
    this.cloudVendor = null;
    return "Cloud Vendor deleted successfully";
  }

  @GetMapping("/example")
  public String exampleEndpoint() {
    // Access the API key from the request headers if needed
    // Perform authentication logic here
    return "Example endpoint";
  }

}
