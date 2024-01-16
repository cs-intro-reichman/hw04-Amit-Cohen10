public class StringOps {
    ////////////////////////////////////////////////////////////
    //////                                               ///////
    //////              Reminder:                        ///////
    //////        allowed methods                        ///////
    //////                                               ///////
    //////        1.charAt(int index)                    ///////
    //////        2.length()                             ///////
    //////        3.substring(int start)                 ///////
    //////        4.substring(int start,int ends)        ///////
    //////        5.indexOf(String str)                  ///////
    //////                                               ///////
    //////        The rest are not allowed !             ///////
    //////        if you want to use a different         ///////
    //////        method, and you can implement          ///////
    //////        it using material from the course      ///////
    //////        you need to implement a version of     ///////
    //////        the function by yourself.              ///////
    //////                                               ///////
    //////        see example for substring              ///////
    //////        in Recitation 3 question 5             ///////
    //////                                               ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        /* System.out.println(capVowelsLowRest("Hello World")); */
/*         String cam = " tWo wordS";
        System.out.println(camelCase(cam)); */
        int [] arr = allIndexOf("hello world", 'l');
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static String capVowelsLowRest (String string) {
        String vowels = "aeiouAEIOU";
        String lowerstring = "";
        String newstring = "";
        for(int i=0; i<string.length(); i++){
            if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
                lowerstring = lowerstring + (char)(string.charAt(i)+32);
            }
            else{
                lowerstring = lowerstring + string.charAt(i);
            }
        }
        for(int i=0; i<string.length(); i++){
            if(vowels.indexOf(lowerstring.charAt(i))!=-1){
                newstring = newstring + (char)(lowerstring.charAt(i) -32);
            }
            else{
                newstring = newstring + lowerstring.charAt(i);
            }
        }
        return newstring;
    }

    public static String camelCase (String string) {
        String newstring = "";
        String lowerstring1 ="";
        String lowerstring ="";
        for(int i=0; i<string.length(); i++){
            if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
                lowerstring1 = lowerstring1 + (char)(string.charAt(i) +32);
            }
            else{
                lowerstring1 = lowerstring1 +string.charAt(i);
            }
        }
        int index=0;
        while(lowerstring1.charAt(index)==32){
            index++;
        }
        while (index < lowerstring1.length()) {
            lowerstring = lowerstring + lowerstring1.charAt(index);
            index++;
        }
        for(int i =0; i<lowerstring.length(); i++){
            if (lowerstring.charAt(i)!=32) {
                newstring = newstring + lowerstring.charAt(i);
            }
            else{
                if (i == lowerstring.length() -1) {
                    i++;
                }
                else{
                    if (lowerstring.charAt(i+1) >= 'a' && lowerstring.charAt(i+1) <= 'z') {
                        newstring = newstring +(char) (lowerstring.charAt(i+1)-32);
                        i++;   
                    }
                    else{
                        if (lowerstring.charAt(i)==32) {
                            lowerstring = lowerstring;
                        }
                        else{
                            newstring = newstring + lowerstring.charAt(i);
                        }
                    }
                }
            }
        }
        return newstring;
    }

    public static int[] allIndexOf (String string, char chr) {
        int size = 0;
        int counter=0;
        for(int i=0; i<string.length(); i++){
            if (string.charAt(i)==chr) {
                size++;
            }
        } 
        int [] arr = new int [size];
        for(int i =0; i<string.length(); i++){
                if (string.charAt(i)==chr) {
                    arr[counter]=i;
                    counter++;
                }
        }
        return arr;
    }
}
