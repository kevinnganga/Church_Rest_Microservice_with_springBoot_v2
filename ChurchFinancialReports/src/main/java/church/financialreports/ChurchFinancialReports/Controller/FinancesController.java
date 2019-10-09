package church.financialreports.ChurchFinancialReports.Controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import church.financialreports.ChurchFinancialReports.Service.FinancesService;
import church.financialreports.ChurchFinancialReports.model.Finances;

@RestController
public class FinancesController {
	
	@Autowired
	private FinancesService financesService;
	
	@PostMapping("/inserting")
	private void Adding(@RequestBody Finances finan) {
		financesService.InsertFinance(finan);
	}

	@GetMapping("/all")
	private Iterable<Finances> getAll() {
		return financesService.getAllFinances();
	}
	
	@PutMapping("/updating/{id}")
	private void Updates(@RequestBody Finances finance,@PathVariable String id) {
		financesService.Updating(finance, id);
	}
	
	@GetMapping("/getOne/{id}")
	private Optional<Finances> getingOne(@PathVariable String id) {
		return financesService.getOne(id);
	}
	
	@DeleteMapping("/delete/{id}")
	private void Deletes(@PathVariable String id) {
		financesService.Deleting(id);
	}
}
