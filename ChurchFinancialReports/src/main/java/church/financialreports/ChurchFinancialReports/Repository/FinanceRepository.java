package church.financialreports.ChurchFinancialReports.Repository;

import org.springframework.data.repository.CrudRepository;

import church.financialreports.ChurchFinancialReports.model.Finances;

public interface FinanceRepository extends CrudRepository<Finances, String> {

}
