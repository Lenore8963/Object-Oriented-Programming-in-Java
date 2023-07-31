import java.util.*;

public class Tester
{
    public void testLogEntry() {
        LogEntry le = new LogEntry("1.2.3.4", new Date(), "example request", 200, 500);
        System.out.println(le);
        LogEntry le2 = new LogEntry("1.2.100.4", new Date(), "example request 2", 300, 400);
        System.out.println(le2);
    }
    
    public void testLogAnalyzer() {
        LogAnalyzer logs = new LogAnalyzer();
        logs.readFile("short-test_log");
        logs.printAll();
    }
    
    public void testUniqueIP () {
        LogAnalyzer logs = new LogAnalyzer();
        logs.readFile("weblog2_log");
        int num = logs.countUniqueIPs();
        System.out.println("Number of unique IPs: " + num);
    }
    
    public void testPrintAllHigherThanNum () {
        LogAnalyzer logs = new LogAnalyzer();
        logs.readFile("weblog1_log");
        logs.printAllHigherThanNum(400);
    }
    
    public void testUniqueIPVisitsOnDay () {
        LogAnalyzer logs = new LogAnalyzer();
        logs.readFile("weblog2_log");
        ArrayList<String> list1 = logs.uniqueIPVisitsOnDay("Sep 24");
        System.out.println("Number of IPs visited on Sep 24: " + list1.size());
    }
    
    public void testCountUniqueIPsInRange () {
        LogAnalyzer logs = new LogAnalyzer();
        logs.readFile("weblog2_log");
        int num1 = logs.countUniqueIPsInRange(200, 299);
        System.out.println(num1);
    }
    
    public void testCounts() {
        LogAnalyzer la = new LogAnalyzer();
        la.readFile("weblog2_log");
        HashMap<String, Integer> counts = la.countVisitsPerIP();
        //System.out.println(counts);
        int max = la.mostNumberVisitsByIP (counts);
        System.out.println("mostNumberVisitsByIP: " + max);
        ArrayList<String> ips = la.iPsMostVisits (counts);
        System.out.println("iPsMostVisits: " + ips);
        HashMap<String, ArrayList<String>> ipsDays = la.iPsForDays ();
        //System.out.println(ipsDays);
        String date = la.dayWithMostIPVisits(ipsDays);
        System.out.println("dayWithMostIPVisits: " + date);
        ArrayList<String> ipMax = la.iPsWithMostVisitsOnDay(ipsDays, "Sep 29");
        System.out.println("iPsWithMostVisitsOnDay: " + ipMax);
    }
    

}
