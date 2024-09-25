package Code_PTIT_AnhLM027;

import java.util.*;
import view.InvoiceView;
import vn.edu.ptit.*;

public class HELLOJAR {

    static class PaymentController {

        private Invoice invoice;

        public PaymentController() {
            Scanner in = new Scanner(System.in);

            String code = in.nextLine();
            String name = in.nextLine();

            Student student = new Student(code, name);

            ArrayList<Subject> A = new ArrayList<>();
            int n = in.nextInt();
            for (int i = 0; i < n; i++) {
                in.nextLine();
                code = in.nextLine();
                name = in.nextLine();
                int cnt = in.nextInt();
                Subject B = new Subject(name, code, cnt);
                A.add(B);
            }
            in.nextLine();
            code = in.nextLine();
            name = in.nextLine();
            double creditPrice = in.nextDouble();
            Rule rule = new Rule(code, name, creditPrice);
            invoice = new Invoice(rule);
            invoice.setAlSubject(A);
            invoice.setSt(student);
            double amount = 0;
            for (Subject x : A) {
                amount += x.getCredit() * rule.getCreditPrice();
            }
            invoice.setAmount(amount);
        }

        public Invoice getInvoice() {
            return this.invoice;
        }
    }

    public static void main(String[] args) {
        PaymentController pc = new PaymentController();
        //Output for test
        Invoice invoice = pc.getInvoice();
        InvoiceView.show(invoice);
    }

}
