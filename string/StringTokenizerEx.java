package string;

import java.util.StringTokenizer;

public class StringTokenizerEx {
    public static void main(String[] args) {
        String query = "name=kitae&addr=seoul&age=21";
        StringTokenizer st = new StringTokenizer(query,"&");
        int n = st.countTokens();
        System.out.println("token 개수=" + n);
        for(int i=0;i<n;i++){
            String token = st.nextToken();
            System.out.println(token);
        }
    }
}
