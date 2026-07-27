import java.util.HashMap;
import java.util.Map;

class Solution {
    public String reformatDate(String date) {
        String[] parts = date.split(" ");

        String dayStr = parts[0].substring(0, parts[0].length() - 2);
        int day = Integer.parseInt(dayStr);

        Map<String, String> months = new HashMap<>();
        months.put("Jan", "01");
        months.put("Feb", "02");
        months.put("Mar", "03");
        months.put("Apr", "04");
        months.put("May", "05");
        months.put("Jun", "06");
        months.put("Jul", "07");
        months.put("Aug", "08");
        months.put("Sep", "09");
        months.put("Oct", "10");
        months.put("Nov", "11");
        months.put("Dec", "12");

        String year = parts[2];
        String month = months.get(parts[1]);
        String formattedDay = day < 10 ? "0" + day : String.valueOf(day);

        return year + "-" + month + "-" + formattedDay;
    }
}
