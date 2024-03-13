package Rest;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@WebServlet("/transaction/*")
public class TransactionServlet extends HttpServlet {
    ArrayList<Transaction> transactions= (ArrayList<Transaction>) Stream.of(
            new Transaction(new Date(2024,04,04),2500.00,"Sinchana","Friend"),
            new Transaction(new Date(2024,04,10),5500.00,"Sahana","Family"),
            new Transaction(new Date(2024,03,06),1000.00,"Sherly","Emergency"),
            new Transaction(new Date(2024,04,01),3000.00,"Zoya","Education"),
            new Transaction(new Date(2024,02,12),2500.00,"Duke","Bills"),
            new Transaction(new Date(2024,03,2),1100.00,"Sony","Friend")
    ).collect(Collectors.toList());

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String amountStr=req.getParameter("amount");
        double amount=Double.parseDouble(amountStr);
        Transaction transaction=new Transaction(amount);
        transaction.add(transaction);
        resp.setStatus(HttpServletResponse.SC_CREATED);
    }
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String minStr=req.getParameter("min");
        String maxStr=req.getParameter("max");

        if(minStr!=null && maxStr!=null){
            double min = Double.parseDouble(minStr);
            double max = Double.parseDouble(maxStr);
            List<Transaction> filteredTransactions=new ArrayList<>();
            for(Transaction transaction:transactions){
                if(transaction.getTransactionamount()>=min&&transaction.getTransactionamount()<=max){
                    filteredTransactions.add(transaction);
                }
            }
            resp.setContentType("application/json");
            PrintWriter out=resp.getWriter();
            out.println(filteredTransactions);
        }else {
            resp.setContentType("application/json");
            PrintWriter out=resp.getWriter();
            out.println(transactions);
        }
    }


}
