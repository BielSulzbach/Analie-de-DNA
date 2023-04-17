public class DNA {
    public static void main(String[] args) {

        String DNA1 = "ATGCGATACGCTTGA";
        String DNA2 = "ATGCGATACGTGA";
        String DNA3 = "ATTAATATGTACTGA";

        String DNAs[] = { DNA1, DNA2, DNA3 };

        for (String DNA : DNAs) {

            int indexATG = DNA.indexOf("ATG");
            int indexTGA = DNA.indexOf("TGA");

            if (indexATG >= 0 && indexTGA >= 0 && (indexATG - indexTGA) % 3 == 0) {

                String proteina = DNA.substring(indexATG, indexTGA + 3);
                System.out.println("DNA: " + DNA);
                System.out.println("Proteína: " + proteina);

            } else {

                System.out.println("DNA: " + DNA);
                System.out.println("Não tem proteína");

            }
        }
    }
}
