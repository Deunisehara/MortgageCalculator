package sample;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writing {
    public static void SimpleSavings(String title, String P, String r, String t, String A) throws IOException {
        File file = new File(title);
        FileWriter writer =  new FileWriter(file,true);
        writer.write("\nPresent Value (Rs.): "+P);
        writer.write("\nInt. Rate (%): "+r);
        writer.write("\nPeriod (years): "+t);
        writer.write("\nFuture Value (Rs.): "+A+"\n\n");


        writer.close();

    }
    public static void Savings(String title, String TotalFV, String iRate, String presentVal, String PMT, String timeP) throws IOException {
        File file = new File(title);
        FileWriter writer =  new FileWriter(file,true);
        writer.write("\nTotal Future Value (Rs.): "+TotalFV);
        writer.write("\nRate (%): "+iRate);
        writer.write("\nTime Period(years): "+presentVal);
        writer.write("\nMonthly Payment (Rs.): "+PMT);
        writer.write("\nPresent Value (Rs.): "+timeP+"\n\n");

        writer.close();

    }
    public static void loans(String title, String loanAmount, String intRate, String LTerm, String PMT) throws IOException {
        File file = new File(title);
        FileWriter writer =  new FileWriter(file,true);
        writer.write("\nPrice (Rs.): "+loanAmount);
        writer.write("\nRate (%): "+intRate);
        writer.write("\nLoan Term (Rs.): "+LTerm);
        writer.write("\nMonthly Payment (Rs.): "+PMT+"\n\n");

        writer.close();

    }
    public static void mortgage(String title,String loanPrice,String downPmt,String LTerm,String intRate,String PMT) throws IOException {
        File file = new File(title);
        FileWriter writer =  new FileWriter(file,true);
        writer.write("\nHome Price (Rs.): "+loanPrice);
        writer.write("\nDown Payment (Rs.): "+downPmt);
        writer.write("\nLoan Term(years): "+LTerm);
        writer.write("\nRate (%): "+intRate);
        writer.write("\nMonthly Payment (Rs.): "+PMT+"\n\n");

        writer.close();

    }

}
