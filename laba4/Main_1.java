import java.util.*;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main_1 {

    public static void main(String[] args) {
        String str = "123sos129";
        Pattern pattern = Pattern.compile("[\\d]");
        Matcher matches = pattern.matcher(str);
        int lenght = 0;
        while(matches.find()){
            lenght++;
            System.out.println(str.substring(matches.start(), matches.end()));
        }
        System.out.println(lenght);
    }
}