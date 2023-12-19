package org.example;

public class Main {


    public static boolean isCharacterPresent (String sir, char caracterCautat) {

        boolean caracterExista = false;
        for (int i = 0; i < sir.length(); i++) {
            if (sir.charAt(i) == caracterCautat) {
                caracterExista = true;
                break;
            }
        }

        if (caracterExista) {
            //System.out.println("Caracterul există în șir.");
            return true;
        } else {
           // System.out.println("Caracterul nu există în șir.");
            return false;
        }
    }

    public static boolean isStringPalindrom (String cuvant){
        cuvant = cuvant.toLowerCase();
        for(int i=0; i< cuvant.length()/2; i++ ){
            if (cuvant.charAt(i) != cuvant.charAt(cuvant.length()-i-1)){
                return false;
            }
        }
        return true;
    }

        public static int schimbareGrade (int gradeC) {
            int gradeF = (((gradeC * 9) /5)+ 32);
            return gradeF;
        }


}