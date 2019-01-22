public class Grade {
    private String grade0;
    private String grade1;
    private String grade2;
    private String grade3;
    private String grade4;
    private String grade5;
    private int countAccept;
    private int countNoAccept;

    public Grade() {
        this.grade0 = "";
        this.grade1 = "";
        this.grade2 = "";
        this.grade3 = "";
        this.grade4 = "";
        this.grade5 = "";
        countAccept = 0;
        countNoAccept = 0;

    }

    public String grade(int score){
        if (score >= 0 && score <= 29){
            this.countNoAccept++;
            return this.grade0 += "*";
        }else if (score >= 30 && score <= 34) {
            this.countAccept++;
            return this.grade1 += "*";
        }else if (score >= 35 && score <= 39) {
            this.countAccept++;
            return this.grade2 += "*";
        }else if (score >= 40 && score <= 44) {
            this.countAccept++;
            return this.grade3 += "*";
        }else if (score >= 45 && score <= 49) {
            this.countAccept++;
            return this.grade4 += "*";
        }else if (score >= 50 && score <= 60) {
            this.countAccept++;
            return this.grade5 += "*";
        }else
            return "Nothing";
    }

    public void printGrades(){
        System.out.println("5: " + this.grade5);
        System.out.println("4: " + this.grade4);
        System.out.println("3: " + this.grade3);
        System.out.println("2: " + this.grade2);
        System.out.println("1: " + this.grade1);
        System.out.println("0: " + this.grade0);
    }

    public double acceptancePercentage(){
        if(this.countAccept + this.countNoAccept ==0){
            return 0;
        }else
            return (double) (100 * this.countAccept / (this.countAccept + this.countNoAccept));
    }

}