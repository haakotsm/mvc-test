package tutorialtime2;

public class TutorialTime2 {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 15;

        if (a > b) {
            System.out.println(a + ">" + b);
        } else if (a < c && b > c) {
            System.out.println(a + "<" + c + " & " + b + ">" + c);
        } else if (c == b) {
            System.out.println("Hello");
        } else {
            System.out.println("Alle er usanne");
        }

        switch (a) {
            case 9:
                System.out.println("Tallet er 9");
                break;
            case 10:
                System.out.println("Tallet er 10");
                break;
            case 11:
                System.out.println("Tallet er 11");
                break;
            default:
                System.out.println("Tallet er hverken 9,10 eller 11");
        }
        int per = 0;
        for (;;) {
            if (per++ == 0) {
                System.out.println("Per blir født i dag");
                continue;
            } else {
                if (per < 10) {
                    System.out.println("Per har bursdag i dag, han er " + per + " år i dag");
                    continue;
                }
            }
            break;
        }

        int ole = a;
        while (ole < b) {
            System.out.println("Ole har bursdag i dag, han er " + ole++ + " år i dag");
        }

        do {
            System.out.println("plusser på A");
            a++;
        } while (a < c);
    }

}
