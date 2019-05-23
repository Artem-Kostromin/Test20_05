import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Num6_3_Search_for_identical_chains {

    public static void main(String[] args) {
        String[] Nucleotide = {"A","B","C","D"};
        StringBuilder[] setOfNucleotides = new StringBuilder[10];
        for(int i=0;i<10;i++) {
            setOfNucleotides[i] = new StringBuilder("");
        }

        String[] arOfNucl = new String[10];
        int lengthOfChain = 30;
        for(StringBuilder s:setOfNucleotides){
            for(int i=0;i<lengthOfChain;i++){
                s.append(Nucleotide[(int) (Math.random()*4)]);
            }
        }

        System.out.println("Набор цепочек:");
        for(StringBuilder s:setOfNucleotides){
            System.out.println(s.toString());
        }
        System.out.println("Комбинации первого набора: ");
        String[] comb = SplitForAllComb(setOfNucleotides[0].toString());
        for(String str:comb){
            System.out.print(str + " ");
        }
        search(comb, setOfNucleotides);
    }

    public  static String[] SplitForAllComb(String s){
        int len = s.length();
        String string, sub;
        int i, c;
        Set<String> hashSet = new HashSet<>();
        for (c = 0; c < len; c++)
        {
            for(i = 1; i <= len - c; i++)
            {
                sub = s.substring(c, c+i);
                hashSet.add(sub);
                //System.out.println(sub);
            }
        }
        return  hashSet.toArray(new String[hashSet.size()]);
    }

    public static void search(String[] set, StringBuilder[] strBuild) {
        int lenOfStrBuild = strBuild.length;
        String res = "";
        int maxNumb = 0;
        int count = 0;

        //System.out.println(lenOfStrBuild);
        for (String s : set) {
            //System.out.println(s.length());
            if (s.length() > maxNumb) {
                for (int i=1;i<lenOfStrBuild;i++) {
                    if (strBuild[i].toString().contains(s)) {
                        //System.out.println(strBuild[i].toString());
                        count++;
                    }
                }
                System.out.println(count);
                if(count == (lenOfStrBuild-1)) {
                    maxNumb = s.length();
                    res = s;
                }
                count = 0;
            }
        }
        if(maxNumb == 0){
            maxNumb = 1;
        }

        System.out.println("\nМаксимальная подстрока имеет длину " + maxNumb + "(Например " + res + ")");
    }
}
