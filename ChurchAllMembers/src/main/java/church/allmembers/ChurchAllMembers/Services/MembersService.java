package church.allmembers.ChurchAllMembers.Services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import church.allmembers.ChurchAllMembers.Repository.MembersRepository;
import church.allmembers.ChurchAllMembers.model.Members;

@Service
public class MembersService {

	@Autowired
	private MembersRepository membersRepository;
	
	public void InsertMember(Members mem) {
		membersRepository.save(mem);
	}
	
	public Iterable<Members> getAllMembers() {
	return	membersRepository.findAll();
	}
	
	public Optional<Members> getById(String id) {
		return membersRepository.findById(id);
	}
	
	public void Update(Members mem,String id) {
		membersRepository.save(mem);
	}
	
	
	public void Deleting(String id) {
		membersRepository.deleteById(id);
	}
}
