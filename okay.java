import java.util.regex.*;

public class okay {
    public static void main(String[] args) {

        String s = "aasdsf@gmail.com, ererderfd@mail.ru, yrjhdhds@icloud.com, pitar228@gmail.com, 748ryeuidjrh";
        Pattern p = Pattern.compile("\\w+@gmail+\\.[a-z]+");
        Matcher m = p.matcher(s);

        while (m.find()) {
            System.out.println(m.group());

        }

    }
}
