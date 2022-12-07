package com.string.CS;

import java.util.*;
import java.util.regex.*;
import java.util.regex.Pattern;

/*
algoritmics01000201000100aisd80998001000010001gov01010
qwertyuiopasdfghjklzxcvbnm23456789
01010
*/
/*
bab1001a102a3452a10000000000000001a10000000000001000a10001000100
ab
10001000100
*/

public class ConvString{

    public Integer parseInt(String s, int radix){
        double am = 0d;
        char[] s_0 = new char[s.length()];

        s.getChars(0, s.length(), s_0, 0);

        for(int i = 0; i < s.length(); i++){
            am += Math.pow(2, s.length() - 1 - i) * (s_0[i] - 48);
        }

        String str_1 = (int)am + "";

        return Integer.parseInt(str_1, radix);
    }

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static int LengthOfString(String s){
        Pattern pattern = Pattern.compile("[\\d]");
        Matcher matches = pattern.matcher(s);
        int lenght = 0;
        while(matches.find()){
            lenght++;
        }
        return lenght;
    }

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static boolean isNumeric(String s){
        Pattern pattern = Pattern.compile("[\\d]");
        Pattern pattern_0 = Pattern.compile("[\\D]");
        int lenght_0 = 0, lenght_1 = 0;
        Matcher matches = pattern.matcher(s);
        while(matches.find()){
            lenght_0++;
        }
        matches = pattern_0.matcher(s);
        while(matches.find()){
            lenght_1++;
        }
        return s != null && !Pattern.matches("[\\d]", s) && !Pattern.matches("[\\D]", s) && lenght_0 != 0 && lenght_1 != 0;
    }

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------

    public static boolean isNum(String s){
        try{
            Integer.parseInt(s, 2);

        }catch(NumberFormatException ex){
            return false;
        }
        return true;
    }

    public void DoIt() {
        
        String maxString = new String(); 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string of tokens: ");
        String str_0 = scanner.nextLine();
        System.out.print("Enter string of separators: ");
        String str_1 = scanner.nextLine();
        List<String> words = new ArrayList<>();
        System.out.print("Enter amount which you want to find: ");
        String P = scanner.nextLine();

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
        if(str_1.length() == 1){
            String[] TempWords = new String[str_0.length()];
            TempWords = str_0.split(str_1);
            words = new ArrayList<>(Arrays.asList(TempWords));
        }

        else{
            StringTokenizer tokenizer = new StringTokenizer(str_0, str_1);
            int max = 0; int i = 0;
            while(tokenizer.hasMoreTokens()){
                words.add(tokenizer.nextToken());
                if(words.get(i).length() > max){
                    maxString = words.get(i);
                    max = words.get(i).length();
                }
                i++;
            }
        }  //все числа в двоичной системе  

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("All tokens: ");
        for(String word : words){
            System.out.print(String.format("%s ", word));
        }

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------

        System.out.println("\n---------------------------------------------------------------------------------------");
        System.out.println("All tokens that are numbers: ");
        List <String> arraylist_1 = new ArrayList<>();

        for(String word : words){
            if(isNum(word) == true){
                arraylist_1.add(word);
            }
            System.out.print(String.format("%s ", word));
        }

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------

        List<String> palindromesList = new ArrayList<>();
            
        for(int i = 0; i < arraylist_1.size(); i++){ // iterable "string"
            char[] str_2 = new char[arraylist_1.get(i).length()];
            arraylist_1.get(i).getChars(0, arraylist_1.get(i).length(), str_2, 0);

            if(arraylist_1.get(i).compareTo(P) == 0){
                System.out.print(String.format("\nFound index first occurrence of string: %d", str_0.indexOf(P))); //поиск первого вхождения строки
            }

            for(int k = 0; k < arraylist_1.get(i).length(); k++){
                if(str_2[k] != str_2[arraylist_1.get(i).length() - k - 1]){
                    palindromesList.add(arraylist_1.get(i));
                    break;
                }
            }
        }  // поиск палиндрома

        System.out.println("\n---------------------------------------------------------------------------------------");
        System.out.println("All numbers that are not palindrome: ");
        for(String pal : palindromesList){
            System.out.println(pal);
        }
        
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------

        Collections.sort(arraylist_1, (s0, s1) -> Integer.valueOf(Integer.parseInt(s0, 2)).compareTo(Integer.valueOf(Integer.parseInt(s1, 2))));
        List<String> FirstNumberAndSymbol = words;
        StringBuffer buffer = new StringBuffer(str_0);

        for(String nas : FirstNumberAndSymbol){
            if(isNumeric(nas) == true && nas.length() != 0){
                System.out.println(String.format("First token consists numbers and characters: %s", nas));
                buffer.delete(str_0.indexOf(nas), str_0.indexOf(nas) + nas.length());
                break;
            }
        }

        System.out.println(String.format("The largest number: %s", arraylist_1.get(arraylist_1.size() - 1)));
        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(String.format("First after deleting token consists numbers and characters: \n%s", buffer.toString()));

        buffer.insert(0, arraylist_1.get(arraylist_1.size() - 1));

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println(String.format("First line after adding the largest number: \n%s", buffer.toString()));

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------

        List <String> sortListByAmount = FirstNumberAndSymbol;
        Collections.sort(sortListByAmount, (s0, s1) -> Integer.valueOf(LengthOfString(s0)).compareTo(LengthOfString(s1)));

        System.out.println("---------------------------------------------------------------------------------------");
        System.out.println("Sorting list by amount of numbers: ");
        for(String list : sortListByAmount){
            System.out.print(String.format("%s ", list));
        }
    }

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------

}
