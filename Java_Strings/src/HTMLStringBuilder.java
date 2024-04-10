public class HTMLStringBuilder {
    public static void main(String[] args) {
        String[] names = {"Donald", "Daisy", "Huey", "Dewey", "Louie", "Scrooge", "Ludvig"};
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<table>\n");
        for(int i = 0; i < names.length; i++) {
             if((i+1)%2 == 0){
                stringBuilder.append("\t<tr style='background-color:yellow;color:black;'>\n");
            }else {
                 stringBuilder.append("\t<tr style='background-color:green;color:white;'>\n");
             }
            stringBuilder.append("\t\t<td>Row ").append(i+1).append(": ").append(names[i]).append("</td>\n");
            stringBuilder.append("\t</tr>\n");
        }
        stringBuilder.append("</table>");
        System.out.println(stringBuilder);
    }
}
