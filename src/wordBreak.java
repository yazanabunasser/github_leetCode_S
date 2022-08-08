import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Set;

public class wordBreak {

    public static boolean wB(String s, Set<String> wordDict)
    {

        int n = s.length();

        if(n == 0)
            return true;

        for(int i =1 ; i <= n ; i++)
        {
            if(wordDict.contains(s.substring(0,i)) && wB(s.substring(i , n), wordDict))
                return true;
                }

        return false;
    }

}
