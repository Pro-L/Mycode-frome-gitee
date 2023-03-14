package Classcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author
 * @creat 2023--16
 */




public class Code763 {
    public static void main(String[] args) {



        String s2 = "eaaaabaaec";
        partitionLabels(s2);
    }

    public static List<Integer> partitionLabels(String s) {
        ArrayList<Integer> ans = new ArrayList<Integer>();
        List<Element> elements = new ArrayList<Element>();

        //预先处理
        for (int i = 0; i < s.length(); i++) {
            if (check(elements,s.charAt(i))==false){
                Element e = new Element(s.charAt(i));
                for (int j = s.length() - 1; j >= 0; j--) {
                    if(s.charAt(j)==s.charAt(i)){
                        e.end = j;
                        break;
                    }
                }

                elements.add(e);
            }
        }

        int start = 0,end = 0;
        for (int i = 0; i <= s.length(); i++) {
            end = elements.get(indexOf(elements,s.charAt(start))).end;
            for (int j = i+1; j < end; j++) {
                if (elements.get(indexOf(elements,s.charAt(j))).end>end){
                    end = elements.get(indexOf(elements,s.charAt(j))).end;
                }
            }

            ans.add((end - start) + 1);
            start = end + 1;
            i = start;
        }

        for (int i = 0; i < ans.size(); i++) {
            System.out.println(ans.get(i));
        }

        return ans;
    }


    public static boolean check(List<Element> elements,char a){
        for (int i = 0; i < elements.size(); i++) {
            if(elements.get(i).coede==a){
                return true;
            }
        }

        return false;
    }

    public static int indexOf(List<Element> elements,char a){
        for (int i = 0; i < elements.size(); i++) {
            if (elements.get(i).coede==a) return i;
        }

        return 0;
    }


}
//----------------------------------------------------------------------------------------------------------------------
class Element{
    char coede;
    int end;

    public Element(char coede) {
        this.coede = coede;
    }
}
