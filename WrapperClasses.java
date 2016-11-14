class Main {

    String str = "1";

    public static void main(String[] args) {
        Main m = new Main(); //need because static to get tmpA, tmpB
        
        byte str = Byte.parseByte (m.str);
        short str = Short.parseShort (m.str);
        int str = Integer.parseInt (m.str);
        long str = Long.parseLong (m.str);
        float str = Float.parseFloat (m.str);
        double str = Double.parseDouble (m.str);
//        System.out.println(str);

    }
}

