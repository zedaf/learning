// Use substring()
class Substring {
    public static void main(String args[]) {
        String orgstr = "Java makes the web move.";

        // construct a substring
        String substr = orgstr.substring(5, 18); // this creates a new string that contains the desired substring

        System.out.println("orgstr: " + orgstr);
        System.out.println("substr: " + substr);
    }
}