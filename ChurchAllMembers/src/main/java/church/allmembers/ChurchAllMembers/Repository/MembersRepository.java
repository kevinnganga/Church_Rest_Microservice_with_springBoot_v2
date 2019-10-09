package church.allmembers.ChurchAllMembers.Repository;

import org.springframework.data.repository.CrudRepository;

import church.allmembers.ChurchAllMembers.model.Members;

public interface MembersRepository extends CrudRepository<Members, String>{

}
