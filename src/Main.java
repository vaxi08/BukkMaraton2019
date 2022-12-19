class Versenytav {
    private String rajtSzam;

    public String getTav() {
        switch (rajtSzam.charAt(0)) {
            case 'M':
                return "Mini";
            case 'R':
                return "Rövid";
            case 'K':
                return "Közép";
            case 'H':
                return "Hosszú";
            case 'E':
            default:
                return "Pedelec";
        }
    }

    public Versenytav(String rajtszam) {
        rajtSzam = rajtszam;
    }
}

    public class Main {
        public static void main(String[] args) {

        }
    }
