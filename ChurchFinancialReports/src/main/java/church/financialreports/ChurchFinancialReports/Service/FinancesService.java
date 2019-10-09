package church.financialreports.ChurchFinancialReports.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import church.financialreports.ChurchFinancialReports.Repository.FinanceRepository;
import church.financialreports.ChurchFinancialReports.model.Finances;

@Service
public class FinancesService {

	@Autowired
	private FinanceRepository financeRepository;
	
	
	public void InsertFinance(Finances financ) {
		financeRepository.save(financ);
	}
	
	
	public Iterable<Finances> getAllFinances() {
		return financeRepository.findAll();
	}
	
	public void Updating(Finances finance,String id) {
		financeRepository.save(finance);
	}
	
	public Optional<Finances> getOne(String id) {
		return financeRepository.findById(id);
	}
	
	public void Deleting(String id) {
		financeRepository.deleteById(id);
	}
}
