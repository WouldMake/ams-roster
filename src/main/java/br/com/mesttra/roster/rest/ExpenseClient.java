package br.com.mesttra.roster.rest;

import br.com.mesttra.roster.dto.ExpenseDTO;
import br.com.mesttra.roster.dto.ExpenseResponseDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "expenses", url="http://localhost:8083/")
public interface ExpenseClient {

    @RequestMapping("/expenses")
    ExpenseResponseDTO addMonthlyExpense(@RequestBody ExpenseDTO expenseDTO);

}
