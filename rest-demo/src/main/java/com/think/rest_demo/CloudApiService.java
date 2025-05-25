package com.think.rest_demo;

import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.think.rest_demo.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudApiService {

	@Autowired
	private CloudVendor cloudvendor;

	@GetMapping(value = "/{vendorID}")
	public CloudVendor getCloudVendorDetails1(@PathVariable("vendorID") String vendorID) {
		if (cloudvendor.getVendorID().equalsIgnoreCase(vendorID)) {
//			String body = "vendorID="+URLEncoder.encode(cloudvendor.getVendorID(), StandardCharsets.UTF_8)
//					+ "&vendorName="+ URLEncoder.encode(cloudvendor.getVendorName(), StandardCharsets.UTF_8)
//					+ "&vendorAddress="+ URLEncoder.encode(cloudvendor.getVendorAddress(), StandardCharsets.UTF_8)
//					+ "&vendorPhoneNumber="+ URLEncoder.encode(cloudvendor.getVendorPhoneNumber(), StandardCharsets.UTF_8);
			return cloudvendor;
		}
		return null;

	}

	@GetMapping("/greet")
	public CloudVendor getCloudVendorDetails(@RequestParam(defaultValue = "Guest") String name) {
		cloudvendor.setVendorName(name);

		return cloudvendor;

	}

	@GetMapping("/header")
	public CloudVendor getCloudVendorDetails3(@RequestHeader("X-Client-Id") String name) {

		return cloudvendor;
	}

	@PostMapping(consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
	public String cloudVendorDetails( CloudVendor cloudVendor) {

		this.cloudvendor = cloudVendor;

		return "Created Successfully:";

	}

	@PatchMapping
	public String patchVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudvendor = cloudVendor;
		return "Patch Successfully:";
	}

	@PutMapping
	public String updateVendorDetails(@RequestBody CloudVendor cloudVendor) {
		this.cloudvendor = cloudVendor;
		return "Updated Successfully:";
	}

	@DeleteMapping("{vendorID}")
	public String deletedVendorDetails(String VendorId) {
		this.cloudvendor = null;
		return "Deleted Successfully:";
	}

}
