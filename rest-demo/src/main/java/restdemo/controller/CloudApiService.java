package restdemo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.think.rest_demo.CloudVendor;

@RestController
@RequestMapping("/cloudvendor")
public class CloudApiService {
	@GetMapping("{vendorID}")
	public CloudVendor getCloudVendorDetails(String vendorID) {
		return new CloudVendor("C1","vendor 1","address One","9071966467");
	}

}
