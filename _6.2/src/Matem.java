public class Matem {
    static double pi = 3.14159265359;

    double areaRectangle(double a, double b) {
        return a * b;
    }

    double areaRectangle(double a) {
        return a * a;
    }

    double areaRightTriangle(double storona_a, double storona_b, boolean is_kat) {//прямокутного трикутника
        if (is_kat == true) {//якщо тру це стандартна формула
            return storona_a * storona_b * 0.5;

        } else {
            double kat_c = Math.sqrt(Math.pow(storona_b, 2) - Math.pow(storona_a, 2));//перетворення в стандартну якщо дано каиеи і гіпотенуза

            return storona_a * kat_c * 0.5;
        }
    }

    double areaVersatileTriangleAndHeight(double a, double h) { // сторона і висота донеї
        return 0.5 * a * h;
    }

    double areaVersatileTriangleHalfPerimeter(double a, double b, double c) {// пів периметру
        double p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    double areaVersatileTrianglВescribedeRadius(double a, double b, double c, double rad) {//описаного
        return (a * b * c) / (4 * rad);
    }

    double areaVersatileTrianglEnteredRadius(double a, double b, double c, double rad) {//вписаного
        double p = (a + b + c) / 2;
        return p * rad;
    }

    double areaСircle(double radius) {
        return pi * Math.pow(radius, 2);
    }

    double areaСircleLength(double lenght) {
        return Math.pow(lenght, 2) / (4 * pi);
    }

    double areaTrapezeFoundationsHeight(double a, double b, double h ) {
        return (a+b)*h*0.5;
    }


}
