//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class Part2 {
    public Part2() {
    }

    public String findSimpleGene(String dna) {
        String startSeq = "ATG";
        String endSeq = "TAA";
        int startIndex = dna.indexOf(startSeq);
        int endIndex = dna.indexOf(endSeq);
        String dnaSeq = dna.substring(startIndex, endIndex + 3).toLowerCase();
        if (dna.contains(startSeq) && dna.contains(endSeq)) {
            return dnaSeq.length() % 3 == 0 ? dnaSeq : "";
        } else {
            return "";
        }
    }

    public void testSimpleGene() {
        String test1 = "ATGGGTTAAGTC";
        String test2 = "ATGGGTTAA";
        String test3 = "ATGTAA";
        String test4 = "GGTTAAGTC";
        String test5 = "ATGGGTGTC";
        System.out.println("The string is: " + test1 + ". The Gene is: " + this.findSimpleGene(test1));
        System.out.println("The string is: " + test2 + ". The Gene is: " + this.findSimpleGene(test2));
        System.out.println("The string is: " + test3 + ". The Gene is: " + this.findSimpleGene(test3));
        System.out.println("The string is: " + test4 + ". The Gene is: " + this.findSimpleGene(test4));
        System.out.println("The string is: " + test5 + ". The Gene is: " + this.findSimpleGene(test5));
    }

    public static void main(String[] args) {
        Part2 dna = new Part2();
        dna.testSimpleGene();
    }
}
