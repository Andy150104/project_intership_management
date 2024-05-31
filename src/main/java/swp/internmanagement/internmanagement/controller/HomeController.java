package swp.internmanagement.internmanagement.controller;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import swp.internmanagement.internmanagement.entity.Job;
import swp.internmanagement.internmanagement.entity.Request;
// import swp.internmanagement.internmanagement.payload.request.HelpRequest;
// import swp.internmanagement.internmanagement.service.JobService;
// import swp.internmanagement.internmanagement.service.RequestService;

import java.util.List;

@RestController
@RequestMapping("/internBridge/home")
public class HomeController {

    // @Autowired
    // private JobService jobService;

    // @Autowired
    // private RequestService requestService;

    // @GetMapping("/jobs")    
    // public List<Job> findAll() {
    //     return jobService.findAll();
    // }
    // @GetMapping(value = "/jobs/{jobName}")
    // public List<Job> findJobByName(@PathVariable String jobName) {
    //     return jobService.findByJobName(jobName);
    // }

    // @GetMapping(value = "/jobs/companyName/{companyName}")
    // public List<Job> findJobByCompanyName(@PathVariable String companyName) {
    //     return jobService.findJobByCompanyName(companyName);
    // }

    // @PostMapping("/sendHelp")
    // public ResponseEntity<Request> sendRequest(@Valid @RequestBody HelpRequest helpRequest){
    //     return new ResponseEntity<>(requestService.sendRequest(helpRequest), HttpStatus.CREATED);
    // }
}