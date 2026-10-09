class LoginValidation {
    public static void main(String[] a) {
        String user = "aasrith";
        String password = "aaro1234";

        if (user == "aasrith") {
            System.out.println("Valid username");
            if (password == "aaro123") {
                System.out.println("Valid Password");
                System.out.println("Logged In Successfully");
            } else {
                System.out.println("Invalid Password");
            }
        } else {
            System.out.println("Invalid Username");
        }
    }
}
