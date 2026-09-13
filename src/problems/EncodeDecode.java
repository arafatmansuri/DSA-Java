package problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class EncodeDecode {
    public void endcode(List<String> strings){
        StringBuilder concated = new StringBuilder();
        for (String s: strings)
            concated.append(s).append("#");
        System.out.println(concated.toString());
        char[] chars = concated.toString().toCharArray();
        int j = 0;
        List<String> list = new ArrayList<>();
        int hashCount = 0;
        for (int i = 0; i < chars.length; i++) {
            String curr = "";
            boolean equals = String.valueOf(chars[i]).equals("#");
            if (equals) {
                System.out.println("Hash Count: "+hashCount);
                if (++hashCount == strings.size()) break;
                list.add(++j,"");
                continue;
            } else if (list.isEmpty()) {
                list.add(j, curr.concat(String.valueOf(chars[i])));
            } else if (Objects.equals(list.get(j), "")) {
                list.add(j, curr.concat(String.valueOf(chars[i])));
            } else if (!Objects.equals(list.get(j), "")) {
                curr = list.get(j);
                list.add(j, curr.concat(String.valueOf(chars[i])));
//              System.out.println("Non empty string "+ curr +" at index: "+i + "and J "+ j);
            }
//            System.out.println("Current String value: "+curr);
        }
        System.out.println(list);
    }

}
