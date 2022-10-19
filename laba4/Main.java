import java.util.*;

/*
algoritmics01000201000100aisd80998001000010001gov01010
qwertyuiopasdfghjklzxcvbnm23456789
01010
*/
/*
bab1001a102a3452a10000000000000001a10000000000001000a10001000100
a
1001
*/

import java.util.regex.Pattern;

public class Main{

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

    public static boolean isNum(String s){
        try{
            int num = Integer.parseInt(s, 2);

        }catch(NumberFormatException ex){
            return false;
        }
        return true;
    }

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------
    public static void main(String[] args) {

        String maxString = new String(); 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter string of tokens: ");
        String str_0 = scanner.nextLine();
        System.out.print("Enter string of separators: ");
        String str_1 = scanner.nextLine();
        String[] words = new String[str_0.length()];
        System.out.print("Enter amount which you want to find: ");
        String P = scanner.nextLine();

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------
    
    if(str_1.length() == 1){
        words = str_0.split(str_1);
    }

    else{
        StringTokenizer tokenizer = new StringTokenizer(str_0, str_1);
        int i = 0; int max = 0;

        while(tokenizer.hasMoreTokens()){
            words[i] = tokenizer.nextToken();
            if(words[i].length() > max){
                maxString = words[i];
                max = words[i].length();
            }
            System.out.println(words[i]);
            i++;
        }
    }  //все числа в двоичной системе  

    System.out.println("---------------------------------------------------------------------------------------");
    System.out.println("All tokens: ");
    for(String word : words){
        System.out.println(word);
    }

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------

    System.out.println("---------------------------------------------------------------------------------------");
    System.out.println("All tokens that are numbers: ");
    List <String> arraylist_1 = new ArrayList<>();
    for(String word : words){
        if(isNum(word) == true){
            arraylist_1.add(word);
        }

        System.out.println(word);
    }

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------

    List<String> palindromesList = new ArrayList<>();
        
    for(int i = 0; i < arraylist_1.size(); i++){ // iterable "string"
        char[] str_2 = new char[arraylist_1.get(i).length()];
        arraylist_1.get(i).getChars(0, arraylist_1.get(i).length(), str_2, 0);

        if(arraylist_1.get(i).compareTo(P) == 0){
            System.out.println(str_0.indexOf(P)); //поиск первого вхождения строки
        }

        for(int k = 0; k < arraylist_1.get(i).length(); k++){
            if(str_2[k] != str_2[arraylist_1.get(i).length() - k - 1]){
                palindromesList.add(arraylist_1.get(i));
                break;
            }
        }
    }  // поиск палиндрома

    System.out.println("---------------------------------------------------------------------------------------");
    System.out.println("All numbers that are not palindrome: ");
    for(String pal : palindromesList){
        System.out.println(pal);
    }
    
//---------------------------------------------------------------------------------------------------------------------------------------------------------------------

    Collections.sort(arraylist_1, (s0, s1) -> Integer.valueOf(Integer.parseInt(s0, 2)).compareTo(Integer.valueOf(Integer.parseInt(s1, 2))));
    List<String> FirstNumberAndSymbol = new ArrayList<>(Arrays.asList(words));
    StringBuffer buffer = new StringBuffer(str_0);

    System.out.println("---------------------------------------------------------------------------------------");
    System.out.println("First after deleting token consist numbers and characters: ");
    System.out.println(buffer);

    for(String nas : FirstNumberAndSymbol){
        if(isNum(nas) == false && nas.length() != 0){
            buffer.delete(str_0.indexOf(nas), str_0.indexOf(nas) + nas.length());
            break;
        }
    }

    buffer.insert(0, arraylist_1.get(arraylist_1.size() - 1));

    System.out.println("---------------------------------------------------------------------------------------");
    System.out.println("First line after adding the largest number: ");

    System.out.println(buffer);

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------

    // Pattern pattern = Pattern.compile("A.++a")
    // Collections.sort(FirstNumberAndSymbol, (s0, s1) -> Integer.valueOf(s0.length()).compareTo(s1.length()));
    // System.out.println(FirstNumberAndSymbol);

//---------------------------------------------------------------------------------------------------------------------------------------------------------------------

    }
}
