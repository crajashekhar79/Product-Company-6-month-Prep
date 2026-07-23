public class MaximumPopulation {

    public static void main(String[] args) {

        int[][] logs = {{1950,1961},{1960,1971},{1970,1981}};
        System.out.println(maxpopulation(logs));

    }

    static int maxpopulation( int[][] logs ){
           int maxpop = 0;
           int answer = 0;
        for (int year = 1950; year <= 2050; year++) {

            int count = 0;

            for (int i = 0; i < logs.length; i++) {

                // Is person i alive in this year?
                if (year >= logs[i][0] && year < logs[i][1]) {
                    count++;
                }
            }

           if(count > maxpop){
               maxpop = count;
               answer = year;

           }
        }

return  answer;
    }
}
