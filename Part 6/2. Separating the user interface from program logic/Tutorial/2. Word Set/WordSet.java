import java.util.*;

public class WordSet{
    private ArrayList<String> words;

    public WordSet() {
        this.words = new ArrayList<String>();
    }

    public boolean contains(String word) {
        return this.words.contains(word);
    }

    public void add(String word) {
        this.words.add(word);
    }

    public int palindromes(){
        int count = 0;

        for(String s: this.words){
            if(isPalindrome(s)){
                count++;
            }
        }

        return count;
    }

    public boolean isPalindrome(String word){
        int end = word.length() - 1;
        int i = 0;

        while(i < word.length() / 2){
            if(word.charAt(i) != word.charAt(end - i)){
                return false;
            }

            i++;
        }
        return true;
    }   
}