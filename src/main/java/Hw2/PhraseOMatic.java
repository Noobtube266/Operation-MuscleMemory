package Hw2;

public class PhraseOMatic {
    public static void main(String[] args) {
        String[] wordListOne = {"typical", "racial", "last", "substantial", "savory"};
        String[] wordListTwo = {"worthless", "incompetent", "devilish", "vengeful", "judicous"};
        String[] wordListThree = {"thin", "scattered", "smart", "lackadaisical", "daffy"};

        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        int rand1 = (int) (Math.random() * oneLength);
        int rand2 = (int) (Math.random() * twoLength);
        int rand3 = (int) (Math.random() * threeLength);

        String phrase = wordListOne[rand1] + " " + wordListTwo[rand2] + " " + wordListThree[rand3];
        System.out.println("What we need is a " + phrase);
    }
    }

