public class Num6_3_Search_for_identical_chains {

    public static void main(String[] args) {
        String[] Nucleotide = {"A","B","C","D"};
        StringBuilder[] setOfNucleotides = new StringBuilder[10];
        int lengthOfChain = 16;

        for(StringBuilder s:setOfNucleotides){
            s.
            for(int i=0;i<lengthOfChain;i++){
                s.append(Nucleotide[(int) (Math.random()*4)]);
            }
        }
        for(StringBuilder s:setOfNucleotides){
            System.out.println(s.toString());
        }
    }
}
