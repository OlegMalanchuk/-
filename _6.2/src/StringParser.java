public class StringParser //перевірка паролів
{
    boolean checkPassword(String pass) {

        if (pass.length() < 7) {
            System.out.println(" Пароль за короткий ");
            return false;
        }


        if (!checkNumInString(pass)) {
            System.out.println(" Має містити хочаб один символ");
            return false;
        }


        if (!checkUppercaseInString(pass)) {
            System.out.println(" Має містити велику літеру ");
            return false;
        }


        System.out.println("Пароль нормальний ");
        return true;
    }

    boolean checkNumInString(String pass) {
        String array[] = pass.split("");

        int f = 0;
        for (String e : array) {
            if (e.matches("\\d+")) { // \\d+ перевіряє строку на наявність числа
                f++;
                break;
            }
        }

        if (f == 0) {
            return false;
        }
        return true;

    }

    boolean checkUppercaseInString(String pass) {

        for (int i = 0; i < pass.length(); i++) {
            if (Character.isUpperCase(pass.charAt(i))) { //Character.isUpperCase ->перевіряє на наявністть великої літери , а pass.charAt витягує елемент по індексу
                return true;
            }
        }

        return false;
    }



















}
