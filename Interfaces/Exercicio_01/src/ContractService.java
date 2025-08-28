import java.time.LocalDate;

public class ContractService {

    private OnlinePaymentService op;

    public ContractService(OnlinePaymentService op){
        this.op = op;
    }
    
    public void processContract(Contract contract, int months){
        for (int i = 1; i <= months; i++) {
            Double amount = contract.getTotalValue() / months;
            amount += op.interest(amount, i);
            amount += op.paymentFee(amount);

            LocalDate dueDate = contract.getDate().plusMonths(i);

            contract.addInstallments(new Installment(dueDate, amount));
        }
    }

}
