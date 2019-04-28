package br.com.fiap.microservice_final.Controller;

import br.com.fiap.microservice_final.Domain.NewTransaction;
import br.com.fiap.microservice_final.Repository.AllTransactionDao;
import br.com.fiap.microservice_final.Repository.NewTransactionDao;
import io.swagger.annotations.Api;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(value = "Transaction", description = "Transactions services")
public class TransactionController {

    private NewTransactionDao daoNew;
    private AllTransactionDao daoAll;

    public TransactionController() {
        this.daoNew = new NewTransactionDao();
        this.daoAll = new AllTransactionDao();
    }

    @PostMapping("/transactions")
    public ResponseEntity save(@RequestBody NewTransaction transaction) {
        return new ResponseEntity(this.daoNew.save(transaction));
    }

    @GetMapping("/statistics")
    public ResponseEntity get() {
        return new ResponseEntity(this.daoAll.resume(this.daoNew.getList()), HttpStatus.OK);
    }
}
