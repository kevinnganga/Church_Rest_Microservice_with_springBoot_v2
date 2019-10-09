package church.allmembers.ChurchAllMembers.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import church.allmembers.ChurchAllMembers.Services.MembersService;
import church.allmembers.ChurchAllMembers.model.Members;

@RestController
public class MembersController {

	@Autowired
	private MembersService membersService;
	
	@RequestMapping("/addMember")
	private void addMember(@RequestBody Members mem) {
		membersService.InsertMember(mem);
		
	}
	
	
	@RequestMapping("/update/{id}")
	private void updateMember(@RequestBody Members mem,@PathVariable String id) {
		membersService.Update(mem, id);
		
	} 
	
	@RequestMapping("/oneMember/{id}")
	private Optional<Members> getById(@PathVariable String id) {
		return membersService.getById(id);	
	}
	
	@RequestMapping("/members")
	private Iterable<Members> getAllMembers() {
		return membersService.getAllMembers();
	}
	
	@DeleteMapping("/delete/{id}")
	private void Deleting(@PathVariable String id) {
		membersService.Deleting(id);
	}
}
