package hr.fer.ilj.iljgrupa2;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@org.springframework.web.bind.annotation.RestController
public class LogController {
	@PostMapping("/log")
	public ResponseEntity<Void> addLog(@RequestBody LogEntry entry){
		System.out.println(entry.toString());
		return ResponseEntity.status(500).build();
	}
	
	
	

}
