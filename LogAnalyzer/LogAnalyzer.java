import java.util.*;
import edu.duke.*;
import java.text.SimpleDateFormat;

public class LogAnalyzer {
    
    private ArrayList<LogEntry> records;
    private SimpleDateFormat dateFormat = new SimpleDateFormat("MMM dd");
     
    public LogAnalyzer() {
        records = new ArrayList<>();
    }
        
    public void readFile(String filename) {
        FileResource fr = new FileResource(filename);
        for (String line : fr.lines()) {
            WebLogParser paser = new WebLogParser();
            records.add(paser.parseEntry(line));
        }
    }
        
    public void printAll() {
        for (LogEntry le : records) {
            System.out.println(le);
        }
    }
    
    private ArrayList<String> getUniqueIPs (ArrayList<LogEntry> records) {
        ArrayList<String> uniqueIPs = new ArrayList<String>();
        for (LogEntry le: records) {
            String ipAddr = le.getIpAddress();
            if (!uniqueIPs.contains(ipAddr)) {
                uniqueIPs.add(ipAddr);
            }
        }
        return uniqueIPs;
    }
    
    public int countUniqueIPs () {
        ArrayList<String> uniqueIPs = getUniqueIPs (records);
        return uniqueIPs.size();
    }
     
    public void printAllHigherThanNum(int num) {
        for (LogEntry le: records) {
            int code = le.getStatusCode();
            if (code > num) {
                System.out.println(code);
            }
        }
    }
     
    public ArrayList<String> uniqueIPVisitsOnDay (String someday) {
        ArrayList<LogEntry> onDay = new ArrayList<>();
        for (LogEntry le: records) {
            Date time = le.getAccessTime();
            if (dateFormat.format(time).equals(someday)) {
                onDay.add(le);
            }
        }
        return getUniqueIPs(onDay);
    }
    
    public int countUniqueIPsInRange (int low, int high) {
        ArrayList<LogEntry> inRange = new ArrayList<>();
        for (LogEntry le: records) {
            int code = le.getStatusCode();
            if (code >= low && code <= high) {
                inRange.add(le);
            }
        }
        return getUniqueIPs(inRange).size();
    }
    
    public HashMap<String, Integer> countVisitsPerIP () {
        HashMap<String, Integer> counts = new HashMap<String, Integer>();
        for (LogEntry le: records) {
            String ip = le.getIpAddress();
            if (! counts.containsKey(ip)) {
                counts.put(ip, 1);
            } else {
                counts.put(ip, counts.get(ip) + 1);
            }
        }
        return counts;
    }
    
    public int mostNumberVisitsByIP (HashMap<String, Integer> counts) {
        int max = 0;
        for (Integer v : counts.values()) {
            if (v > max) {
                max = v;
            }
        }
        return max;
    }
    
    public ArrayList<String> iPsMostVisits (HashMap<String, Integer> counts) {
        ArrayList<String> ip = new ArrayList<String>();
        int max = mostNumberVisitsByIP(counts);
        for (String s : counts.keySet()) {
            if (counts.get(s) == max) {
                ip.add(s);
            }
        }
        return ip;
    }
    
    public HashMap<String, ArrayList<String>> iPsForDays () {
        HashMap<String, ArrayList<String>> ipMap = new HashMap<>(); 
        for (LogEntry le: records) {
            Date time = le.getAccessTime();
            String date = dateFormat.format(time);
            if (!ipMap.containsKey(date)) {
                ArrayList<String> ips = new ArrayList<>();
                ips.add(le.getIpAddress());
                ipMap.put(date, ips);
            } else {
                ipMap.get(date).add(le.getIpAddress());
            }
        }
        return ipMap;
    }
    
    public String dayWithMostIPVisits (HashMap<String, ArrayList<String>> ipDays) {
        int num = 0;
        String date = null;
        for (String s : ipDays.keySet()) {
            if (ipDays.get(s).size() > num) {
                num = ipDays.get(s).size();
                date = s;
            }
        }
        return date;
    }
    
    public ArrayList<String> iPsWithMostVisitsOnDay(HashMap<String, ArrayList<String>> ipDays, String someday) {
        ArrayList<String> ips = ipDays.get(someday);
        HashMap<String, Integer> counts = new HashMap<>();
        for (String s : ips) {
            if (!counts.containsKey(s)) {
                counts.put(s, 1);
            } else {
                counts.put(s, counts.get(s) + 1);
            }
        }
        return iPsMostVisits (counts);
    }
}
