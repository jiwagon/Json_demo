import com.google.gson.JsonParser;

public class app {

    public static void main(String[] args) {

        try {
            Scanner scan = new Scanner(new File("student.json"));
            String studentInfo = scan.nextLine();

            System.out.println(studentInfo);

            JsonParser studentParser = new JsonParser();
            JsonElement student = studentParser.parse(studentInfo);
            JsonObject studentObject = student.getAsJsonObject();
            
            System.out.println(studentObject.get("name"));
            System.out.println(studentObject.get("GPA"));
            System.out.println(studentObject.get("major"));

            // to handle array
            Scanner peopleScan = new Scanner(new File("people.json"));
            String personInfo = peopleScan.nextLine();

            JsonParser peopleParser = new JsonParser();
            JsonArray personArray = (JsonArray) peopleParser.parse(personInfo);

            for (JsonElement perosn: personArray) {
                System.out.println("Name:" + person.getAsJsonObject().get("name").getAsString()));
            }
        }
        catch(Exception e){
            printstacktrace(); 
        }
    }
}