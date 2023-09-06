public class URLSanitizer {
  public static String sanatizrURL(String inputString) {
    StringBuilder result = new StringBuilder();
    for (char c : inputString.toCharArray()) {
      if (c == '') {
        result.append("%20");
      }else{
        result.append(c);
      }
    }
    return result.toString();
  }
  public static void main(String[] args) {
    // test cases
    System.out.println(sanatizrURL("http://code.org/hour of code.html"));
    System.out.println(sanatizrURL("https://www.example.com/some path with spaces"));
    System.out.println(sanatizrURL("http://site.com/my%20page"));
  }
}
